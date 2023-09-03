public class Main {
    public static void main(String[] args) {
        Country russia = new Country("Россия");
        russia.setPopulation(144000000);
        russia.setArea(150000);
        russia.setCapital("Москва");
        russia.setAccessToSea(true);

        System.out.println("Страна: " + russia.getName() + "\n" +
                "Население: " + russia.getPopulation() + "\n" +
                "Площадь: " + russia.getArea() + "\n" +
                "Столица: " + russia.getCapital() + "\n" +
                "Выход к морю: " + russia.isAccessToSea());
    }
}
