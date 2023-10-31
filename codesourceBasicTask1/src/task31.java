/*Напишите программу на Java, чтобы проверить, установлена ли Java на вашем компьютере. Перейти к редактору
        Ожидаемый результат

        Версия Java: 1.8.0_71
        Java Runtime Version: 1.8.0_71-b15
        Домашняя страница Java: /opt/jdk/jdk1.8.0_71/jre
        Поставщик Java: корпорация Oracle
        URL поставщика Java: http://Java.oracle.com/
        Java Class Path:.*/
public class task31 {
    public static void main(String[] args) {
        System.out.println("Версия Java: " + System.getProperty("java.version"));
        System.out.println("Версия Runtime: " + System.getProperty("java.runtime.version"));
        System.out.println("Java home: " + System.getProperty("java.home"));
        System.out.println("Поставщик Java: " + System.getProperty("java.vendor"));
        System.out.println("URL поставщика Java : " + System.getProperty("java.vendor.url"));
        System.out.println("Java Class Path: " + System.getProperty("java.class.path"));

    }
}
