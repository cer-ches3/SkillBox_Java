public class Main {
    public static void main(String[] args) {
        /*//Печать всех элементов массива с помощью цикла
        int[] nums = {1,3,7,8,1,22};
        for (int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }*/


        /*//Вывести 1000 7мизначных номеров купонов и выделить выйгрышные(каждый 100)
        int certCount = 1000;
        int[] certNumbers = new int[certCount];
        for (int i = 0; i < certNumbers.length; i++){
            certNumbers[i] = 1_000_000 + (int) Math.round(8_999_999 * Math.random());
        }
        *//*for (int i = 0; i < certNumbers.length; i++){
            System.out.println(certNumbers[i]);
        }*//*
        int winnersRate = 100;
        int[] winnerNumbers = new int[certNumbers.length / winnersRate];
        int winnerNumberIndex = 0;
        for (int i = 0; i < certNumbers.length; i = i + winnersRate){
            winnerNumbers[winnerNumberIndex++] = certNumbers[i];
        }*/

        /*//Более читабельный вариант того же кода
        int certCount = 1000;
        int winnersRate = 100;

        int[] certNumbers = new int[certCount];
        boolean[] certIsWin = new boolean[certCount];
        for (int i = 0; i < certNumbers.length; i++){
            certNumbers[i] = 1_000_000 + (int) Math.round(8_999_999 * Math.random());
            certIsWin[i] = i % winnersRate == 100;
        }*/


        /*//Перебор элементов без указания индекса
        int[] numbers = {22,15,22,47,14,1,-4,85};
        for (int number : numbers){
            System.out.println(number);
        }*/


        /*//Измененине элементов в массиве внутри цикла
        //В данном примере каждый элемент массива будет увеличен на 2
        int[] numbers = {22,15,22,47,14,1,-4,85};
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = numbers[i] * 2;
            System.out.println(numbers[i]);
        }*/


        /*//пример 1 Посчитать площадь комнат на каждом этаже
        int[] rooms = {15,22,22,23,22,22,23};
        double roomArea = 5.72;

        double[] roomAreas = new double[rooms.length];
        for (int i = 0; i < rooms.length; i++){
            roomAreas[i] = rooms[i] * roomArea
        }*/


        //Пример 2 Перебор всех товаров в корзине и применение скидки к товарам стоимостью дорорже 1000
        Product[] products = {
                new Product("Молоко", 75),
                new Product("Масло", 120),
                new Product("Сыр", 180),
                new Product("Чайник", 1890),
                new Product("Фильтр для воды", 1200),
        };
        int MIN_PRICE_FOR_DISCOUNT = 1000;
        double discount = 0.1;
        for (int i = 0; i < products.length; i++){
            Product product = products[i];
            int price = product.getPrice();
            if (price > MIN_PRICE_FOR_DISCOUNT){
                int newPrice = (int) (price * (1 - discount));
                products[i] = new Product(product.getName(), newPrice);
            }
        }
        for (Product product : products){
            System.out.println(product);
        }
    }
}
