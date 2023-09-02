public class Main {
    public static void main(String[] args) {

        Printer printer = new Printer();
        printer.append("some text 123", "Справка", 10);
        printer.append("some text 1234", 15);
        printer.append("some text 12345", "Договор");
        printer.append("some text 123456");
        System.out.println(printer.getPagesInQueue());
        printer.print();

        printer.append("some text 1548", 14);
        printer.print();
        printer.clear();

        printer.append("some text 5648464489" , "name12",32);
        printer.append("some text 561814198");
        printer.print();
        System.out.println(printer.getPagesComplete());
    }

}
