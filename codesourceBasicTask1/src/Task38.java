//Напишите программу на Java для подсчета букв, пробелов, чисел и других символов входной строки.
public class Task38 {
    public static void main(String[] args) {
        String str = "Hello, my dear friend 123!";
        System.out.println(getCount(str));

    }
    public static String getCount(String str) {
        int wordsCount = 0;
        int digitCount = 0;
        int spaceCount = 0;
        int otherChar = 0;

        char[] arrayStr = str.toCharArray();
        for (int i = 0; i < arrayStr.length; i++){
            if (Character.isLetter(arrayStr[i])){
                wordsCount++;
            } else if (Character.isDigit(arrayStr[i])) {
                digitCount++;
            }else if (Character.isSpaceChar(arrayStr[i])){
                spaceCount++;
            }else {
                otherChar++;
            }
        }
        return "Количество букв: " + wordsCount + '\n' +
                "Количество цифр: " + digitCount + '\n' +
                "Количество пробелов: " + spaceCount + '\n' +
                "Количество прочих символов: " + otherChar + '\n';
    }
}
