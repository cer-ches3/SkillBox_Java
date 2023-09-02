public class Arithmetic {
    int num1;
    int num2;
    int result;

    public Arithmetic(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void sum(){
        result = num1 + num2;
        System.out.println("Сумма чисел равна: " + result);
    }
    public void multiply(){
        result = num1 * num2;
        System.out.println("Произведение чисел равна: " + result);
    }
    public void minValue(){
        result = (num1 < num2 ? num1 : num2);
        System.out.println("Наименьшее число: " + result);
    }
    public void maxValue(){
        result = (num1 > num2 ? num1 : num2);
        System.out.println("Наибольшее число: " + result);
    }

}
