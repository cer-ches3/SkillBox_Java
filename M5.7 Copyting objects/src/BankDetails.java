public class BankDetails {
    private final String billNumber;
    private final String corBill;
    private final String bikNumber;
    private final String bankName;
    private final String city;

    public BankDetails(String billNumber, String corBill, String bikNumber, String bankName, String city) {
        this.billNumber = billNumber;
        this.corBill = corBill;
        this.bikNumber = bikNumber;
        this.bankName = bankName;
        this.city = city;
    }

    public BankDetails() {
        this.billNumber = "N/A";
        this.corBill = "N/A";
        this.bikNumber = "N/A";
        this.bankName = "N/A";
        this.city = "N/A";
    }

    public String getBillNumber() {
        return billNumber;
    }

    public BankDetails setBillNumber(String billNumber) {
        return new BankDetails(billNumber, corBill, bikNumber, bankName, city);
    }

    public String getCorBill() {
        return corBill;
    }

    public BankDetails setCorBill(String corBill) {
        return new BankDetails(billNumber, corBill, bikNumber, bankName, city);
    }

    public String getBikNumber() {
        return bikNumber;
    }

    public BankDetails setBikNumber(String bikNumber) {
        return new BankDetails(billNumber, corBill, bikNumber, bankName, city);
    }

    public String getBankName() {
        return bankName;
    }

    public BankDetails setBankName(String bankName) {
        return new BankDetails(billNumber, corBill, bikNumber, bankName, city);
    }

    public String getCity() {
        return city;
    }

    public BankDetails setCity(String city) {
        return new BankDetails(billNumber, corBill, bikNumber, bankName, city);
    }

    @Override
    public String toString() {
        return "Счет: " + billNumber + "\n" +
                "Кор.счет: " + corBill + "\n" +
                "БИК: " + bikNumber + "\n" +
                "в " + bankName + " (" + city + ") ";
    }
}
