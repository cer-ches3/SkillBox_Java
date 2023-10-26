import java.util.*;

public class Main {
    /*
    TODO:
     - реализовать методы класса CoolNumbers
     - посчитать время поиска введимого номера в консоль в каждой из структуры данных
     - проанализоровать полученные данные
     */

    public static void main(String[] args) {

        System.out.println("Введите номер автомобиля: ");
        String enteredNumber = new Scanner(System.in).nextLine();
        List<String> coolNumbers = new ArrayList<>(CoolNumbers.generateCoolNumbers());

        CoolNumbers.bruteForceSearchInList(coolNumbers, enteredNumber);

        CoolNumbers.binarySearchInList(coolNumbers, enteredNumber);

        HashSet<String> hashCoolNumbers = new HashSet<>(coolNumbers);
        CoolNumbers.searchInHashSet((HashSet<String>) hashCoolNumbers, enteredNumber);

        TreeSet<String> threeCoolNumbers = new TreeSet<>(coolNumbers);
        CoolNumbers.searchInTreeSet((TreeSet<String>) threeCoolNumbers, enteredNumber);
    }
}


