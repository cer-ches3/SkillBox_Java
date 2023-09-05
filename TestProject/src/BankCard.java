import java.util.Scanner;

public class BankCard {
    public  double balance = 0;
    public  int pinCode = 7388;
    public  int enterPinCode;
    public  boolean pinCodeAccepted;

    public BankCard(double balance) {
        this.balance = balance;
    }

    public void authorisation() {
            while (enterPinCode != pinCode){
                System.out.println("Введите пинкод");
                enterPinCode  = new Scanner(System.in).nextInt();
                if (enterPinCode == pinCode){
                    pinCodeAccepted = true;
                    System.out.println("Доступ разрешен");
                }else{
                    pinCodeAccepted = false;
                    System.out.println("Доступ запрещен");
                    break;
                }
            }
        }
    public double getBalance(){
        return balance;
    }
    public double depositMoney(int value){
        balance = balance + value;
        return balance;
    }
    public double debitMoney(int value){
        balance = balance - value;
        return  balance;
    }

}
