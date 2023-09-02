public class Printer {
    String queue = "";
    int pagesInQueue;
    int pagesComplete;

    public int getPagesInQueue() {
        return pagesInQueue;
    }

    public int getPagesComplete() {
        return pagesComplete;
    }

    public void append(String text, String name, int pagesCount){
        queue = queue + "\n" + name + " - " + text;
        pagesInQueue = pagesInQueue + pagesCount;
    }
    public void append(String text, String name){
        queue = queue + "\n" + name + " - " + text;
        pagesInQueue = pagesInQueue + 1;
    }
    public void append(String text, int pagesCount){
        queue = queue + "\nБез имени" + " - " + text;
        pagesInQueue = pagesInQueue + pagesCount;
    }
    public void append(String text){
        queue = queue + "\nБез имени" + " - " + text;
        pagesInQueue = pagesInQueue + 1;
    }

    public void clear(){
        queue = "";
        pagesInQueue = 0;
    }

    public void print(){
        pagesComplete = pagesComplete + pagesInQueue;
        System.out.println(queue);
        clear();
    }


}
