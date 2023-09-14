public class Main {
    public static void main(String[] args) {
        Container container = new Container();
        container.addCount(5412);
        System.out.println(container.getCount());

        for (int i = 'А'; i <= 'я'; i++){
            char list = (char) i;
            System.out.println(list + " - " + i);
        }
        int bigE = 'Ё';
        int e = 'е';
        char listBigE = (char) bigE;
        char listE = (char) e;
        System.out.println(listBigE + " - " + bigE);
        System.out.println(listE + " - " + e);
    }
}
