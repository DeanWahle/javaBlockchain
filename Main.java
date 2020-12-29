import java.io.FileReader;
import java.time.LocalDateTime;
import java.util.*;
import java.util.Scanner;
public class Main {

    public static ArrayList<Block> blockchain = new ArrayList<>();
    public static int prefix = 4;
    public static String prefixString = new String(new char[prefix]).replace('\0', '0');
    private static ArrayList<Stakeholder> stakeHolderList;
    private static ArrayList<Artifact> artifactList;

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        ArrayList<Stakeholder> stakeHolderList = new ArrayList<Stakeholder>();
        stakeHolderList = ReadStakes("src/Stakeholders.csv");

        Stakeholder Dean = stakeHolderList.get(0);
        Stakeholder Connor = stakeHolderList.get(1);
        Stakeholder Jeff = stakeHolderList.get(2);
        Stakeholder Zimbabwe = stakeHolderList.get(3);
        Stakeholder NYCMuseum = stakeHolderList.get(4);
        Stakeholder PrivateCollector = stakeHolderList.get(5);
        Stakeholder Australia = stakeHolderList.get(6);
        Stakeholder ChinaAuctionHouse = stakeHolderList.get(7);
        Stakeholder BrazilAuctionHouse = stakeHolderList.get(8);
        Stakeholder GreeceAuctionHouse = stakeHolderList.get(9);
        Stakeholder USA = stakeHolderList.get(10);
        Stakeholder WakeForest = stakeHolderList.get(11);

        Artifact spear = new Artifact("aaaaaa", "spear", Zimbabwe, Connor);
        Artifact pot = new Artifact("bbbbbb", "pot", Australia, Dean);
        Artifact shoes = new Artifact("cccccc", "shoes", USA, Jeff);

        String artifactName1;
        String artifactName2;
        String artifactName3;

        String buyerName1;
        String buyerName2;
        String buyerName3;

        String sellerName1;
        String sellerName2;
        String sellerName3;

        String auctionHouseName1;
        String auctionHouseName2;
        String auctionHouseName3;

        Stakeholder buyer1 = null;
        Stakeholder buyer2 = null;
        Stakeholder buyer3 = null;

        Stakeholder seller1 = null;
        Stakeholder seller2 = null;
        Stakeholder seller3 = null;

        Stakeholder auctionHouse1 = null;
        Stakeholder auctionHouse2 = null;
        Stakeholder auctionHouse3 = null;

        Artifact artifact1 = null;
        Artifact artifact2 = null;
        Artifact artifact3 = null;

        int price1 = 0;
        int price2 = 0;
        int price3 = 0;

        while (artifact1 == null) {
            System.out.println("What artifact is being sold first?");
            artifactName1 = scnr.nextLine();
            if (artifactName1.compareTo("spear") == 0) {
                artifact1 = spear;
            }
            if (artifactName1.compareTo("pot") == 0) {
                artifact1 = pot;
            }
            if (artifactName1.compareTo("shoes") == 0) {
                artifact1 = shoes;
            }
            if (artifact1 == null) {
                System.out.println("That artifact is not in our system, please try again.");
            }
        }

        while (buyer1 == null) {
            System.out.println("Who is buyer1?");
            buyerName1 = scnr.nextLine();
            if (buyerName1.compareTo("NYC Museum") == 0) {
                buyer1 = NYCMuseum;
            }
            if (buyerName1.compareTo("Private Collector") == 0) {
                buyer1 = PrivateCollector;
            }
            if (buyerName1.compareTo("Wake Forest") == 0) {
                buyer1 = WakeForest;
            }
            if (buyer1 == null) {
                System.out.println("That buyer is not in our system, please try again.");
            }
        }

        while (seller1 == null) {
            System.out.println("Who is seller1?");
            sellerName1 = scnr.nextLine();
            if (sellerName1.compareTo("Dean") == 0) {
                seller1 = Dean;
            }
            if (sellerName1.compareTo("Connor") == 0) {
                seller1 = Connor;
            }
            if (sellerName1.compareTo("Jeff") == 0) {
                seller1 = Jeff;
            }
            if (seller1 == null) {
                System.out.println("That seller is not in our system, please try again.");
            }
        }


        while (auctionHouse1 == null) {
            System.out.println("What auction house is selling item1?");
            auctionHouseName1 = scnr.nextLine();
            if (auctionHouseName1.compareTo("China Auction House") == 0) {
                auctionHouse1 = ChinaAuctionHouse;
            }
            if (auctionHouseName1.compareTo("Brazil Auction House") == 0) {
                auctionHouse1 = BrazilAuctionHouse;
            }
            if (auctionHouseName1.compareTo("Greece Auction House") == 0) {
                auctionHouse1 = GreeceAuctionHouse;
            }
            if (auctionHouse1 == null) {
                System.out.println("That auction house is not in our system, please try again.");
            }
        }

        if (artifact1.getArtId().compareTo("aaaaaa") == 0) {
            price1 = 1000;
        }
        if (artifact1.getArtId().compareTo("bbbbbb") == 0) {
            price1 = 500;
        }
        if (artifact1.getArtId().compareTo("cccccc") == 0) {
            price1 = 2000;
        }

        while (artifact2 == null) {
            System.out.println("What artifact is being sold second?");
            artifactName2 = scnr.nextLine();
            if (artifactName2.compareTo("spear") == 0) {
                artifact2 = spear;
            }
            if (artifactName2.compareTo("pot") == 0) {
                artifact2 = pot;
            }
            if (artifactName2.compareTo("shoes") == 0) {
                artifact2 = shoes;
            }
            if (artifact2 == null) {
                System.out.println("That artifact is not in our system, please try again.");
            }
        }

        while (buyer2 == null) {
            System.out.println("Who is buyer2?");
            buyerName2 = scnr.nextLine();
            if (buyerName2.compareTo("NYC Museum") == 0) {
                buyer2 = NYCMuseum;
            }
            if (buyerName2.compareTo("Private Collector") == 0) {
                buyer2 = PrivateCollector;
            }
            if (buyerName2.compareTo("Wake Forest") == 0) {
                buyer2 = WakeForest;
            }
            if (buyer2 == null) {
                System.out.println("That buyer is not in our system, please try again.");
            }
        }

        while (seller2 == null) {
            System.out.println("Who is seller2?");
            sellerName2 = scnr.nextLine();
            if (sellerName2.compareTo("Dean") == 0) {
                seller2 = Dean;
            }
            if (sellerName2.compareTo("Connor") == 0) {
                seller2 = Connor;
            }
            if (sellerName2.compareTo("Jeff") == 0) {
                seller2 = Jeff;
            }
            if (seller2 == null) {
                System.out.println("That seller is not in our system, please try again.");
            }
        }


        while (auctionHouse2 == null) {
            System.out.println("What auction house is selling the second item?");
            auctionHouseName2 = scnr.nextLine();
            if (auctionHouseName2.compareTo("China Auction House") == 0) {
                auctionHouse2 = ChinaAuctionHouse;
            }
            if (auctionHouseName2.compareTo("Brazil Auction House") == 0) {
                auctionHouse2 = BrazilAuctionHouse;
            }
            if (auctionHouseName2.compareTo("Greece Auction House") == 0) {
                auctionHouse2 = GreeceAuctionHouse;
            }
            if (auctionHouse2 == null) {
                System.out.println("That auction house is not in our system, please try again.");
            }
        }

        if (artifact2.getArtId().compareTo("aaaaaa") == 0) {
            price2 = 1000;
        }
        if (artifact2.getArtId().compareTo("bbbbbb") == 0) {
            price2 = 500;
        }
        if (artifact2.getArtId().compareTo("cccccc") == 0) {
            price2 = 2000;
        }

        while (artifact3 == null) {
            System.out.println("What artifact is being sold third?");
            artifactName3 = scnr.nextLine();
            if (artifactName3.compareTo("spear") == 0) {
                artifact3 = spear;
            }
            if (artifactName3.compareTo("pot") == 0) {
                artifact3 = pot;
            }
            if (artifactName3.compareTo("shoes") == 0) {
                artifact3 = shoes;
            }
            if (artifact3 == null) {
                System.out.println("That artifact is not in our system, please try again.");
            }
        }

        while (buyer3 == null) {
            System.out.println("Who is buyer3?");
            buyerName3 = scnr.nextLine();
            if (buyerName3.compareTo("NYC Museum") == 0) {
                buyer3 = NYCMuseum;
            }
            if (buyerName3.compareTo("Private Collector") == 0) {
                buyer3 = PrivateCollector;
            }
            if (buyerName3.compareTo("Wake Forest") == 0) {
                buyer3 = WakeForest;
            }
            if (buyer3 == null) {
                System.out.println("That buyer is not in our system, please try again.");
            }
        }

        while (seller3 == null) {
            System.out.println("Who is seller3?");
            sellerName3 = scnr.nextLine();
            if (sellerName3.compareTo("Dean") == 0) {
                seller3 = Dean;
            }
            if (sellerName3.compareTo("Connor") == 0) {
                seller3 = Connor;
            }
            if (sellerName3.compareTo("Jeff") == 0) {
                seller3 = Jeff;
            }
            if (seller3 == null) {
                System.out.println("That seller is not in our system, please try again.");
            }
        }


        while (auctionHouse3 == null) {
            System.out.println("What auction house is selling the third item?");
            auctionHouseName3 = scnr.nextLine();
            if (auctionHouseName3.compareTo("China Auction House") == 0) {
                auctionHouse3 = ChinaAuctionHouse;
            }
            if (auctionHouseName3.compareTo("Brazil Auction House") == 0) {
                auctionHouse3 = BrazilAuctionHouse;
            }
            if (auctionHouseName3.compareTo("Greece Auction House") == 0) {
                auctionHouse3 = GreeceAuctionHouse;
            }
            if (auctionHouse3 == null) {
                System.out.println("That auction house is not in our system, please try again.");
            }
        }

        if (artifact3.getArtId().compareTo("aaaaaa") == 0) {
            price3 = 1000;
        }
        if (artifact3.getArtId().compareTo("bbbbbb") == 0) {
            price3 = 500;
        }
        if (artifact3.getArtId().compareTo("cccccc") == 0) {
            price3 = 2000;
        }

        Transaction data1 = new Transaction(artifact1, LocalDateTime.now(), seller1, buyer1, auctionHouse1, price1);
        Transaction data2 = new Transaction(artifact2, LocalDateTime.now(), seller2, buyer2, auctionHouse2, price2);
        Transaction data3 = new Transaction(artifact3, LocalDateTime.now(), seller3, buyer3, auctionHouse3, price3);
        Transaction data4 = new Transaction(shoes, LocalDateTime.now(), Jeff, WakeForest, ChinaAuctionHouse, 1000);

        Transaction spearTransaction1 = new Transaction(spear, LocalDateTime.of(2002, 4, 19, 4, 1, 5, 0), Zimbabwe, PrivateCollector, ChinaAuctionHouse, 1000);
        Transaction spearTransaction2 = new Transaction(spear, LocalDateTime.of(2002, 6, 19, 4, 1, 5, 0), PrivateCollector, Connor, ChinaAuctionHouse, 1000);


        Block spearBlock1 = new Block(spearTransaction1, "0", new Date().getTime());
        spearBlock1.mineBlock(prefix);
        if (spearBlock1.getCurrHash().substring(0, prefix).equals(prefixString) && spearBlock1.verify_Blockchain(blockchain))
            blockchain.add(spearBlock1);
        else
            System.out.println("Malicious block, not added to the chain");

        Block spearBlock2 = new Block(spearTransaction2, blockchain.get(blockchain.size() - 1).getCurrHash(), new Date().getTime());
        spearBlock2.mineBlock(prefix);
        if (spearBlock2.getCurrHash().substring(0, prefix).equals(prefixString) && spearBlock2.verify_Blockchain(blockchain))
            blockchain.add(spearBlock2);
        else
            System.out.println("Malicious block, not added to the chain");

        Block genesisBlock = new Block(data1, "0", new Date().getTime());
        genesisBlock.mineBlock(prefix);
        if (genesisBlock.getCurrHash().substring(0, prefix).equals(prefixString) && genesisBlock.verify_Blockchain(blockchain) && genesisBlock.TreatySC(data1))
            blockchain.add(genesisBlock);
        else
            System.out.println("Malicious block, not added to the chain");

        Block secondBlock = new Block(data2, blockchain.get(blockchain.size() - 1).getCurrHash(), new Date().getTime());
        secondBlock.mineBlock(prefix);
        if (secondBlock.getCurrHash().substring(0, prefix).equals(prefixString) && secondBlock.verify_Blockchain(blockchain) && secondBlock.TreatySC(data2))
            blockchain.add(secondBlock);
        else
            System.out.println("Malicious block, not added to the chain");

        Block thirdBlock = new Block(data3, blockchain.get(blockchain.size() - 1).getCurrHash(),
                new Date().getTime());
        thirdBlock.mineBlock(prefix);
        if (thirdBlock.getCurrHash().substring(0, prefix).equals(prefixString) && thirdBlock.verify_Blockchain(blockchain) && thirdBlock.TreatySC(data3))
            blockchain.add(thirdBlock);
        else
            System.out.println("Malicious block, not added to the chain");

        System.out.println(seller1.getBalance());
    }

    public static ArrayList<Stakeholder> ReadStakes(String fileName) {
        ArrayList<Stakeholder> base = new ArrayList<Stakeholder>();
        Scanner fileReader;
        try {
            fileReader = new Scanner(new FileReader(fileName));
            fileReader.useDelimiter(",");
            fileReader.nextLine();
        } catch (Exception e) {
            System.out.println("Input file not working.");
            System.exit(22);
            return null;
        }
        String id, name, address;
        double balance;

        while (fileReader.hasNext()) {
            try {
                balance = fileReader.nextDouble();
                id = fileReader.next();
                name = fileReader.next();
                address = fileReader.next();
                fileReader.nextLine();
            } catch (Exception e) {
                System.out.println("Stakeholder data is not working");
                System.exit(33);
                return null;
            }

            base.add(new Stakeholder(balance, name, address, id));
        }
        fileReader.close();
        return base;
    }

}

