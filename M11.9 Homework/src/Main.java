import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        String name;

        while(true){
            System.out.println("Введите номер, имя или команду");
            String input = new Scanner(System.in).nextLine();

            // TODO: Если введено имя
            if (phoneBook.nameIsValid(input)){
                if (phoneBook.haveName(input)){
                    System.out.println(phoneBook.getContactByName(input));
                    continue;
                }else {
                    System.out.println("Такого имени нет в телефонной книге\n" +
                            "Введите номер телефона для абонента " +"\"" + input + "\":" );
                    String phoneInput = new Scanner(System.in).nextLine();
                    if (phoneBook.phoneIsValid(phoneInput)){
                        phoneBook.addContact(phoneInput, input);
                        continue;
                    }
                }
            }

            // TODO: Если введен номер телефона
            else if (phoneBook.phoneIsValid(input)) {
                if (!phoneBook.getContactByPhone(input).isEmpty()) {
                    System.out.println(phoneBook.getContactByPhone(input));
                    continue;
                }
                System.out.println("Такого номера нет в телефонной книге.\n" +
                        "Введите имя абонента для номера " + "\"" + input + "\":");
                String nameInput = new Scanner(System.in).nextLine();
                phoneBook.addContact(input, nameInput);
                continue;
            }

            // TODO: Если введен LIST
            else if (input.toUpperCase().equals("LIST")) {
                for (String contact : phoneBook.getAllContacts()){
                    System.out.println(contact);
                }
                continue;
            }
            System.out.println("Не верный формат ввода");
        }
    }
}