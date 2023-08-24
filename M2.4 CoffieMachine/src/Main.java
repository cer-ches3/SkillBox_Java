public class Main {
    public static void main(String[] args) {
        int coffeeAmount = 2330;
        int milkAmount = 3210;
        int skimmedMilkAmount = 1290;
        boolean isBlocked = false;
        boolean hasError = false;

        int cappucinoMilkRequired = 60;
        int cappucinoCoffeeRequired = 15;

        boolean milkIsEnough = milkAmount >= cappucinoMilkRequired || skimmedMilkAmount >= cappucinoMilkRequired;
        boolean coffeeIsEnough = coffeeAmount >= cappucinoCoffeeRequired;

        if (isBlocked){
            hasError = true;
            System.out.println("Кофе машина заблокирована");
        }
        if (!milkIsEnough){
            hasError = true;
            System.out.println("Молока недостаточно");
        }
        if (!coffeeIsEnough){
            hasError = true;
            System.out.println("Кофе недостаточно");
        }
        if (!hasError){
            System.out.println("Готовим кофе");
        }

    }
}