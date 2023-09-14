public class MainBankCard {
    public static void main(String[] args) {
        BankCard user = new BankCard(500);
        user.authorisation();
        System.out.println("Баланс: " + user.getBalance());
        user.depositMoney(500);

    }
}
