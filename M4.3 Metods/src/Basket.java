public class Basket {
    private static String items = "";
    public static void main(String[] args) {
        add("Колбаса", 65);
        add("Молоко", 120);
        add("Масло", 80);
        print("Содержимое корзины");
        clear();
        print("Содержимое корзины после очистки");

    }

    public static void add(String name, int price){
        items = items + "\n" + name + " - " + price;
    }
    public static void clear(){
        items = "";
    }
    public static void print(String title){
        System.out.println(title);
        if (items.isEmpty()){
            System.out.println("Корзина пуста");
        }else {
            System.out.println(items);
        }
    }
}
