public class Main {
    public static void main(String[] args) {
        Basket basket1 = new Basket();
        basket1.add("Колбаса", 65);
        basket1.add("Молоко", 120);
        basket1.add("Масло", 80);
        basket1.print("Содержимое корзины 1");
        System.out.println("Общая стоимость товаров: " + basket1.getTotalPrice());
        System.out.println();
        basket1.clear();
        basket1.print("Содержимое корзины 1 после очистки");
        System.out.println("Общая стоимость товаров: " + basket1.getTotalPrice());

        Basket basket2 = new Basket();
        basket2.add("Яйца", 65);
        basket2.add("Хлеб", 120);
        basket2.print("Содержимое корзины 2");
        System.out.println("Общая стоимость товаров: " + basket1.getTotalPrice());
        System.out.println();
        basket1.clear();
        basket1.print("Содержимое корзины 1 после очистки");
        System.out.println("Общая стоимость товаров: " + basket1.getTotalPrice());
    }
}
