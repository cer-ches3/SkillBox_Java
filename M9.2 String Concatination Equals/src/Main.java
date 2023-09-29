import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        /*String name = "Дмитрий";
        String empty = "";
        String blank = "  \t   \n ";
        System.out.println(empty.isEmpty()); //проверяет, является ли строка пустой
        System.out.println(blank.isBlank()); //проверяет, пустая ли строка или состоит из пробелов и пробельных символов*/

        /*String name = "Дмитрий";
        String surname = "Петров";
        int age = 55;
        String personInfo = name + ' ' + surname + ' ' + age + " лет.";
        System.out.println(personInfo);*/

        /*String name = "Дмитрий";
        String surname = "Петров";
        LocalDate birthday = LocalDate.of(1996, 8, 3);
        String personInfo = name + ' ' + surname + ' ' + birthday;
        System.out.println(personInfo);*/



        /*Product product = new Product("молоко", 100);
        System.out.println("Информация о продукте: " + product);*/



        /*Product mask = new Product("молоко", 50);
        StringBuilder goods = new StringBuilder();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++){
            goods.append(mask);
            goods.append('\n');
        }
        System.out.println(System.currentTimeMillis() - start);
        System.out.println(goods.length());*/


        /*Product mask = new Product("молоко", 50);
        StringBuilder goods = new StringBuilder();

        for (int i = 0; i < 100_000; i++){
            goods.append(mask).append('\n');;
        }

        String allGoods = goods.toString();
        long start = System.currentTimeMillis();
        allGoods = allGoods.concat(mask.toString());

        System.out.println(System.currentTimeMillis() - start);*/



        Product mask = new Product("молоко", 50);
        StringBuilder goods = new StringBuilder();
        long start = System.currentTimeMillis();

        for (int i = 0; i < 100_000; i++){
            goods.append(mask).append('\n');;
        }

        System.out.println(System.currentTimeMillis() - start);
    }
}