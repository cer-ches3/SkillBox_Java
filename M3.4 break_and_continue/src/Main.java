public class Main {
    public static void main(String[] args) {
       /* int firstYear = 19996;
        int lastYear = 2023;
        int soughtYear = 2012;
        boolean yearExist = false;

        for (int year = firstYear; year <= lastYear; year++){
            if (year == soughtYear){
                yearExist = true;
                break;
            }
        }
        String found = "Год найден";
        String notFound = "Год не найден";
        System.out.println(yearExist ? found : notFound);*/

        int firstYear = 2000;
        int lastYear = 2023;

        for (int year = firstYear; year <= lastYear; year++) {
            if (year % 4 != 0) {
                continue;
            }
            System.out.println(year);
            for (int month = 1; month <= 12; month++) {
                String zero = month < 10 ? "0" : "";
                System.out.println("29. " + zero + month + "." + year);
            }
        }
    }
}
