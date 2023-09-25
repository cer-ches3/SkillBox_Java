public class FIO {
    public static void main(String[] args) {
        String fio = "Чесноков Сергей Сергеевич";

        int firstSpace = fio.indexOf(' ');
        String surname = fio.substring(0, firstSpace);
        int secondSpace = fio.lastIndexOf(' ');
        String name = fio.substring(firstSpace + 1, secondSpace);
        String lastName = fio.substring(secondSpace + 1);

        System.out.println(surname + "\n" +
                name + "\n" +
                lastName + "\n");

    }

}
