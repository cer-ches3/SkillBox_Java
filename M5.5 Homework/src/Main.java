public class Main {
    public static void main(String[] args) {

        /*Product product = new Product("Milk",  "189re1g8re1g188e");
        System.out.println(product.getName() + ", " +
                product.getPrice() + ", " + product.getBarCode() + "\n");

        product.setPrice(128);
        System.out.println(product.getName() + ", " +
                product.getPrice() + ", " + product.getBarCode() + "\n");*/

        Book book = new Book("Война и мир", "Ф. Достоевский", 1000, "15ewrw22");
        System.out.println("Название книги: " + book.getName() + "\n" +
                "Автор книги: " + book.getAuthor() + "\n" +
                "Количество страниц в книге: " + book.getPageCount() + "\n" +
                "Номер ISBN: " + book.getNumISBN() + "\n");

    }
}
