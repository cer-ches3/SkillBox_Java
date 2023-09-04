public class Main {
    public static void main(String[] args) {
        BankDetails details = new BankDetails();
        details.setBillNumber("40724654648498165984");
        Company company = new Company("Smart-Express", details);
        //some code
        details.setBillNumber("30765684616546846@");
        System.out.println(company);

        BankDetails copy = new BankDetails(details.getBillNumber(),
                details.getCorBill(),
                details.getBikNumber(),
                details.getBankName(),
                details.getCity());
    }
}
