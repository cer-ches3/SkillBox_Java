import java.util.Scanner;

public class BankCard {
    public  double balance = 0;
    public  int pinCode = 7388;
    public  int enterPinCode;
    public  boolean pinCodeAccepted;

    public void authorisation() {
        System.out.println("Введите пинкод");
        enterPinCode  = new Scanner(System.in).nextInt();
        if (enterPinCode == pinCode){
            pinCodeAccepted = true;
        }else{
            pinCodeAccepted = false;
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
