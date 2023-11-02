import java.util.Arrays;

/*Напишите программу на Java для обращения строки.
        Входные данные:
        Введите строку: быстрый коричневый лис
        Ожидаемый результат

        Обратная строка: xof nworb kciuq ehT*/
public class Task37 {
    public static void main(String[] args) {
        String str = "быстрый коричневый лис";
        char[] arrayStr = str.toCharArray();
        for (int i = arrayStr.length -1; i >=0; i--) {
            System.out.print(arrayStr[i]);
        }

    }
}
