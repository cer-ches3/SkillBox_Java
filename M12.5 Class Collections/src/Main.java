import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        game.initPlayers();

        /*ArrayList<String> winners = game.getWinners();

        for (String win : winners){
            System.out.println(win);
        }*/
        game.add("Андрей Дмитриев");

    }
}
