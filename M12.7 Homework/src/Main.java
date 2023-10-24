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
        String firstLetter = "";
        String threeNumbers = "";
        String[] letters = {"А", "В", "Е", "К", "М", "Н", "О", "Р", "С", "Т", "У", "Х"};
        ArrayList<String>arrayLetters = new ArrayList<>();
        for (String letter : letters) {
            arrayLetters.add(letter);
        }
        Collections.shuffle(arrayLetters);

        String[] numbers = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        ArrayList<String>arrayNumbers = new ArrayList<>();
        for (String number : numbers) {
            arrayNumbers.add(number);
        }
        Collections.shuffle(arrayNumbers);

        //todo Получаем 1 букву
        for (int i = 0; i < 1; i++){
            firstLetter = arrayLetters.get(i);
            System.out.println("Первая буква: " +  firstLetter);
        }

        // todo Получаем 3 цыфры
        for (int i = 0; i < 3; i++){
            threeNumbers = arrayNumbers.get(i);
        }
        System.out.println("Три цифры: " +  threeNumbers);

        System.out.println(firstLetter.concat(threeNumbers));
    }
}

