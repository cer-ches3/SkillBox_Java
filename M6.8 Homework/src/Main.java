public class Main {
    public static void main(String[] args) {

        /*Basket basket1 = new Basket();
        basket1.add("Молоко", 150, 2, 2);
        basket1.add("Хлеб", 30, 1, 2);

        Basket basket2 = new Basket();
        basket2.add("Яйца", 120, 1, 2);
        basket2.add("Масло", 170, 2, 3);

        System.out.println("Общая сумма товаров: " + Basket.getTotalPriceAllProducts() + " руб.");
        System.out.println("общее колличество продуктов " + Basket.getTotalCountProducts() + " шт");
        System.out.println("средняя стоимость товара составит: " + Basket.calcPriceAverage() + " руб.");
        System.out.println("средняя стоимость корзины составит: " + Basket.calcPriceAverageOneBasket() + " руб.");*/


        Processor processor1 = new Processor(3.5, 4, "Intel", 0.1);
        Ram ram1 = new Ram(TypeRam.DDR4, 32, 0.05);
        Storage storage1 = new Storage(TypeStorage.SSD, 500, 0.7);
        Display display1 = new Display(24.0, TypeDisplay.IPS, 2.6);
        Keyboard keyboard1 = new Keyboard(TypeKeyboard.USB, IsIlluminate.YES, 0.6);
        Computer computer1 = new Computer("Apple", "MacBook Air 13", processor1, ram1, storage1, display1, keyboard1);

        Processor processor2 = new Processor(3.7, 8, "AMD", 0.1);
        Ram ram2 = new Ram(TypeRam.DDR4, 32, 0.05);
        Storage storage2 = new Storage(TypeStorage.SSD, 1000, 0.7);
        Display display2 = new Display(22.0, TypeDisplay.TN, 2.8);
        Keyboard keyboard2 = new Keyboard(TypeKeyboard.WIRELESS, IsIlluminate.NO, 0.7);
        Computer computer2 = new Computer("Honor", "MagicBook", processor2, ram2, storage2, display2, keyboard2);

        System.out.println(computer1.toString());
        System.out.println(computer2.toString());


    }
}
