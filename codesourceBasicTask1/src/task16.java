import java.sql.Array;

/*Напишите программу на Java для печати лица. Перейти к редактору
        Ожидаемый результат

         +"""""""+
         [| о о |]
          |  ^  |
          | '-' |
          +-----+*/
public class task16 {
    public static void main(String[] args) {
        String[] arrays = new String[5];
        arrays[0] = "+\"\"\"\"\"\"\"+";
        arrays[1] = "[| о о |]";
        arrays[2] = " |  ^  |";
        arrays[3] = " | '-' |";
        arrays[4] = " +-----+";

        for (int i = 0; i < 5; i++){
            System.out.println(arrays[i]);
        }
    }
}
