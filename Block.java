import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.LocalDateTime;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.security.SecureRandom;

public class Block {
    private String prevHash;
    private Transaction data;
    private long blockTimestamp;
    private int nonce;
    private String currHash;

    public Block(Transaction data, String prevHash, long blockTimestamp) {
        this.prevHash = prevHash;
        this.data = data;
        this.blockTimestamp = blockTimestamp;
        this.currHash = calculateBlockHash();
        this.nonce = secureRandom();
    }

    public static class Customer{
        private static final Logger LOGGER = Logger.getLogger(String.valueOf(Customer.class));
        public void getCustomerDetails() {
        }
    }

    private int secureRandom(){
        SecureRandom rand = new SecureRandom();
        int rand_int1 = rand.nextInt(2147483647);
        return rand_int1;
    }

    public String calculateBlockHash() {
        String dataToHash;
        dataToHash = Long.toString(blockTimestamp) + Integer.toString(nonce) + data;
        MessageDigest digest = null;
        byte[] bytes = null;
        try {
            digest = MessageDigest.getInstance("SHA-256");
            bytes = digest.digest(dataToHash.getBytes(StandardCharsets.UTF_8));
        } catch (NoSuchAlgorithmException ex) {
            Customer.LOGGER.log(Level.SEVERE, ex.getMessage());
        }
        StringBuffer buffer = new StringBuffer();
        for (byte b : bytes) {
            buffer.append(String.format("%02x", b));
        }
        return buffer.toString();
    }


    public String mineBlock(int prefix){
        String prefixAsString = new String(new char[prefix]).replace('\0', '0');
        while (!currHash.substring(0, prefix).equals(prefixAsString)) {
            nonce = (nonce + 1);
            currHash = calculateBlockHash();
        }
        return currHash;
    }

    public boolean TreatySC(Transaction t){
        int transactionVer = 0;
        boolean executeTreaty = false;

        for(int i =0; i<retrieveProvenance1(t.getSoldArt().getArtId()).size(); i++){
            //if(retrieveProvenance1(t.getSoldArt().getArtId()).get(i).getTimeStamp().getYear() >= 2001){
                //transactionVer = transactionVer + 1;
                //if (transactionVer >= 2){
                    if(t.getBuyer().getBalance() > t.getPrice()){
                        executeTreaty = true;
                        t.auctionHouse.setBalance(t.auctionHouse.getBalance() + (t.getPrice() * .10));
                        t.getSoldArt().country.setBalance(t.soldArt.country.getBalance() + (t.getPrice() * .20));
                        t.seller.setBalance(t.seller.getBalance() + (t.getPrice() * .70));
                    }
                }
           //}
        //}
        return executeTreaty;
    }

    public ArrayList<Transaction> retrieveProvenance1(String id){
        ArrayList<Transaction> transactionsList = new ArrayList<Transaction>();
        for (int i=0; i<Main.blockchain.size(); i++) {
            if (Main.blockchain.get(i).getData().getSoldArt().getArtId().compareTo(id) == 0){
                transactionsList.add(Main.blockchain.get(i).getData());
            }
        }
        return transactionsList;
    }

    public ArrayList<Transaction> retrieveProvenance2(String id, long timestamp){
        ArrayList<Transaction> transactionsListByTime = new ArrayList<Transaction>();
        for (int i=0; i<Main.blockchain.size(); i++) {
            if (Main.blockchain.get(i).data.soldArt.artId.compareTo(id) == 0 && Main.blockchain.get(i).blockTimestamp > timestamp){
                transactionsListByTime.add(Main.blockchain.get(i).data);
            }
        }
        return transactionsListByTime;
    }

    public boolean verify_Blockchain(ArrayList<Block> BC){
        boolean flag = true;
        for (int i = 0; i < BC.size(); i++) {
            String previousHash;
            if(i==0){
                previousHash = "0";
            } else {
                previousHash = BC.get(i - 1).getCurrHash();
            }
            flag = BC.get(i).getCurrHash().equals(BC.get(i).calculateBlockHash()) && previousHash.equals(BC.get(i).getPrevHash()) && BC.get(i).getCurrHash().substring(0, Main.prefix).equals(Main.prefixString);
                if (!flag) break;
            }
            return flag;
    }

    public String getPrevHash() {
        return prevHash;
    }

    public void setPrevHash(String prevHash) {
        this.prevHash = prevHash;
    }

    public Transaction getData() {
        return data;
    }

    public void setData(Transaction data) {
        this.data = data;
    }

    public Long getBlockTimestamp() {
        return blockTimestamp;
    }

    public void setBlockTimestamp(Long blockTimestamp) {
        this.blockTimestamp = blockTimestamp;
    }

    public int getNonce() {
        return nonce;
    }

    public void setNonce(int nonce) {
        this.nonce = nonce;
    }

    public String getCurrHash() {
        return currHash;
    }

    public void setCurrHash(String currHash) {
        this.currHash = currHash;
    }
}
