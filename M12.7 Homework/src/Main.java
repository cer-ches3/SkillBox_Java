import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    /*
    TODO:
     - реализовать методы класса CoolNumbers
     - посчитать время поиска введимого номера в консоль в каждой из структуры данных
     - проанализоровать полученные данные
     */

    public static void main(String[] args) {
        String letter1 = "";
        String letter2 = "";
        String letter3 = "";
        String number = "";
        String region = "";

        for (int i = 0; i <= 100; i++) {

            //todo Получаем буквы
            String[] letters = {"А", "В", "Е", "К", "М", "Н", "О", "Р", "С", "Т", "У", "Х"};
            ArrayList<String> arrayLetters = new ArrayList<>();
            for (String letter : letters) {
                arrayLetters.add(letter);
            }
            Collections.shuffle(arrayLetters);
            letter1 = arrayLetters.get(0);
            letter2 = arrayLetters.get(1);
            letter3 = arrayLetters.get(2);

            /*for (int l1 = 0; l1 < 1; l1++) {
                letter1 = arrayLetters.get(l1);
            }
            for (int l2 = 0; l2 < 1; l2++) {
                letter2 = arrayLetters.get(l2);
            }
            for (int l3 = 0; l3 < 1; l3++) {
                letter3 = arrayLetters.get(l3);
            }*/

            // todo Получаем 3 цыфры
            for (int nums = 111; nums <= 999; nums = nums + 111) {
                number = Integer.toString(nums);
                for (int reg = 0; reg <= 199; reg++) {
                    region = Integer.toString(reg);
                }
            }

            // todo Получаем регион

            System.out.println(letter1.concat(number).concat(letter2).concat(letter3).concat(region));
        }

    }
}


