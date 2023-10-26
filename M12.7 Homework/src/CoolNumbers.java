import java.util.*;

public class CoolNumbers {

    public static List<String> generateCoolNumbers() {
        String regNumber = "";
        String region = "";
        List<String> coolNumbers = new ArrayList<>();
        List<String> letters = new ArrayList<>(Arrays.asList("А", "В", "Е", "К", "М", "Н", "О",
                "Р", "С", "Т", "У", "Х"));
        Collections.shuffle(letters);
        List<String> numbers = new ArrayList<>(Arrays.asList("111", "222", "333", "444", "555",
                "666", "777", "888", "999"));

        for (String letter1 : letters) {
            for (String nums : numbers) {
                for (String letter2 : letters) {
                    for (String letter3 : letters) {
                        for (int reg = 1; reg <= 199; reg++) {
                            region = String.valueOf(Integer.parseInt(String.valueOf(reg)));
                            if (reg < 10) {
                                region = "0" + region;
                            }


                            regNumber = letter1.concat(nums).concat(letter2).concat(letter3).concat(region);
                            coolNumbers.add(regNumber);
                        }
                    }
                }
            }
        }
        Collections.sort(coolNumbers);
        return coolNumbers;
    }

    public static boolean bruteForceSearchInList(List<String> list, String number) {
        list = new ArrayList<>(generateCoolNumbers());
        long start = System.nanoTime();
        boolean isFound = false;
        if (list.contains(number)) {
            isFound = true;
        }
        long time = System.nanoTime() - start;
        System.out.println("Номер найден!\n" + "Поиск перебором занял " + time + " нс.");
        return isFound;
    }

    public static boolean binarySearchInList(List<String> sortedList, String number) {
        sortedList = new ArrayList<>(generateCoolNumbers());
        long start = System.nanoTime();
        boolean isFound = false;
        if (Collections.binarySearch(sortedList, number) >= 0) {
            isFound = true;
        }
        long time = System.nanoTime() - start;
        System.out.println("Номер найден!\n" + "Бинарный поиск занял " + time + " нс.");
        return isFound;
    }

    public static boolean searchInHashSet(HashSet<String> hashSet, String number) {
        hashSet = new HashSet<>(generateCoolNumbers());
        long start = System.nanoTime();
        boolean isFound = false;
        if (hashSet.contains(number)) {
            isFound = true;
        }
        long time = System.nanoTime() - start;
        System.out.println("Номер найден!\n" + "Поиск по HashSet занял " + time + " нс.");
        return isFound;
    }

    public static boolean searchInTreeSet(TreeSet<String> treeSet, String number) {
        treeSet = new TreeSet<>(generateCoolNumbers());
        long start = System.nanoTime();
        boolean isFound = false;
        if (treeSet.contains(number)) {
            isFound = true;
        }
        long time = System.nanoTime() - start;
        System.out.println("Номер найден!\n" + "Поиск по TreeSet занял " + time + " нс.");
        return isFound;
    }

}
