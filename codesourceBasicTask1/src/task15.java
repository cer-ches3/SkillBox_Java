/*Напишите программу на Java для замены двух переменных.*/
public class task15 {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        int z;
        System.out.println(x + " , " + y);
        z = x;
        x = y;
        y = z;
        System.out.println(x + " , " + y);

    }
}
