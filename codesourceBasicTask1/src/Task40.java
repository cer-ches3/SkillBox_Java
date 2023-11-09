import java.nio.charset.Charset;

/*Напишите программу на Java, чтобы перечислить доступные наборы символов в объектах charset.
        Ожидаемый результат

        Список доступных наборов символов:
        Big5
        Big5-HKSCS
        CESU-8
        EUC-JP
        EUC-KR
        GB18030
        GB2312
        GBK
        ...*/
public class Task40 {
    public static void main(String[] args) {
        System.out.println("List: \n");
        for (String str : Charset.availableCharsets().keySet()){
            System.out.println(str);
        }
    }
}
