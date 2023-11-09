/*Напишите Java-программу для создания и отображения уникального трехзначного числа с использованием 1, 2, 3, 4.
        Также подсчитайте, сколько существует трехзначных чисел.*/
public class Task39 {
    public static void main(String[] args) {
        int amount = 0;
        for (int i = 1; i <= 4; i++){
            for (int j = 1; j <= 4; j++){
                for (int k = 1; k <= 4; k++){
                    if (i != k && k != j && j != i){
                        System.out.println(i+""+j+""+k);
                        amount++;
                    }
                }
            }
        }
        System.out.println(amount);
    }
}
