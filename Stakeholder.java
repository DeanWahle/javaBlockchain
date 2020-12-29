public class Stakeholder {

        String stkId;
        String stkName;
        String stkAddr;
        double stkBal;

        public Stakeholder( double balance, String id, String name, String address) {
            this.stkId = id;
            this.stkName = name;
            this.stkAddr = address;
            this.stkBal = balance;
        }

    public String toString() {
        String result = stkId + ", " + stkName + ", " + stkAddr + ", " + stkBal;
        return result;
    }

    public String getId() {
        return stkId;
    }

    public void setId(String id) {
        this.stkId = id;
    }

    public String getName() {
        return stkName;
    }

    public void setName(String name) {
        this.stkName = name;
    }

    public String getAddress() {
        return stkAddr;
    }

    public void setAddress(String address) {
        this.stkAddr = address;
    }

    public double getBalance() {
        return stkBal;
    }

    public void setBalance(double balance) {
        this.stkBal = balance;
    }
}
