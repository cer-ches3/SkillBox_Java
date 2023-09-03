public class Main {
    public static void main(String[] args) {
        ChildBankAccount card = new ChildBankAccount(10000);
        card.depositMoney(1000);
        card.depositMoney(999.99);
        System.out.println("Баланс: " + card.getBalance());
        card.depositMoney(9500);
        System.out.println("Баланс: " + card.getBalance());
        card.debitMoney(500);
        System.out.println("Баланс: " + card.getBalance());
        card.debitMoney(-500);
        System.out.println("Баланс: " + card.getBalance());
        card.debitMoney(5000);
        System.out.println("Баланс: " + card.getBalance());
        card.debitMoney(1498.99);
        System.out.println("Баланс: " + card.getBalance());
    }
}
