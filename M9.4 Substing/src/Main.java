import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) {
        /*String header1 = "Content-type: text/html; charset=utf-8;";
        String header2 = "Content-type: text/html; charset=windows-1251;";
        String header3 = "Content-type: text/html; charset=ISO-8859-1;";

        String header4 = "Content-type: text/html;";
        String header5 = "Content-type: text/html; charset=";
        String header6 = "Content-type: text/html; charset=;";

        System.out.println(getEncoding(header1));
        System.out.println(getEncoding(header2));
        System.out.println(getEncoding(header3));

        System.out.println(getEncoding(header4));
        System.out.println(getEncoding(header5));
        System.out.println(getEncoding(header6));
    }

    public static String getEncoding(String header){
        String charsetStr = "charset=";
        int start = header.indexOf(charsetStr);
        int end = header.indexOf(';',start);

        if (start < 0 || end < 0) {
            return "";
        }
        String encoding = header.substring(start + + charsetStr.length(), end);
        return encoding;*/



        /*String name1 = "Василий";
        String name2 = "Георгий";
        String name3 = "Алексай";

        *//*StringJoiner joiner = new StringJoiner(", ");
        joiner.add(name1);
        joiner.add(name2);
        joiner.add(name3);

        System.out.println(joiner);*//*

        String list = String.join(", ", name1, name2, name3);*/


        String name = "Максим";
        int birthday = 1996;
        String template = "{\"name\" : \"%s\", \"birthday\" : \"%d\"}";
//        String result = String.format(template, name, birthday);
        System.out.printf(template, name, birthday);
    }
}
