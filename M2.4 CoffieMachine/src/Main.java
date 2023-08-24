public class Main {
    public static void main(String[] args) {
        int coffeeAmount = 2330;
        int milkAmount = 3210;
        int skimmedMilkAnount = 1290;
        boolean isBlocked = true;

        int cappucinoMilkRequired = 60;
        int cappucinoCoffeeRequired = 15;

        if(!isBlocked && coffeeAmount >= cappucinoCoffeeRequired &&
                (milkAmount >= cappucinoMilkRequired) || skimmedMilkAnount >= cappucinoMilkRequired){
            System.out.println("Готовим капучино");
        }else {
            System.out.println("Ингридиентов недостаточно");
        }
    }
}