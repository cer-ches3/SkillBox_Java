import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class PhoneBook {
    Map<String, String> phoneBook = new TreeMap<>();

    public boolean phoneIsValid(String phone) {
        String regex = "79[0-9]{9}";
        boolean isValid = phone.matches(regex) ? true : false;
        return isValid;
    }

    public boolean nameIsValid(String name) {
        String regex = "[а-яА-я\s+]{1,}";
        boolean isValid = name.matches(regex) ? true : false;
        return isValid;
    }

    public boolean haveName(String name) {
        boolean haveName = false;
        for (String key : phoneBook.keySet()) {
            if (name.equals(phoneBook.get(key))) {
                haveName = true;
            }
        }
        return haveName;
    }

    public void addContact(String phone, String name) {
        // проверьте корректность формата имени и телефона
        // (рекомедуется написать отдельные методы для проверки является строка именем/телефоном)
        // если такой номер уже есть в списке, то перезаписать имя абонента
        if (nameIsValid(name) && phoneIsValid(phone)) {
            if (phoneBook.containsValue(name)){
                addTwoContact(name, phone);
            }else {
                phoneBook.put(phone, name);
                System.out.println("Контакт сохранен!");
            }
        }
        else {
            System.out.println("Не верный формат ввода");
        }
    }

    public void addTwoContact(String name, String phone) {
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            String oldNumber = entry.getKey();
            if (oldNumber.equals(name)){
                System.out.println("Контакт переименован");
            }else {
                String newNumber = oldNumber.concat(", ").concat(phone);
                phoneBook.put(newNumber, name);
                phoneBook.remove(oldNumber);
                System.out.println("Номер добавлен к контакту " + name);
            }
        }
    }

    public String getContactByPhone(String phone) {
        // формат одного контакта "Имя - Телефон"
        // если контакт не найдены - вернуть пустую строку
        String contactByPhone = "";
        for (String key : phoneBook.keySet()) {
            if (phone.equals(key)) {
                contactByPhone = phoneBook.get(key) + " - " + key;
            }
        }
        return contactByPhone;
    }

    public Set<String> getContactByName(String name) {
        // формат одного контакта "Имя - Телефон"
        // если контакт не найден - вернуть пустой TreeSet
        Set<String> contactByName = new TreeSet<>();
        for (String key : phoneBook.keySet()) {
            if (name.equals(phoneBook.get(key))) {
                contactByName.add(phoneBook.get(key) + " - " + key);
            }
        }
        return contactByName;
    }

    public Set<String> getAllContacts() {
        // формат одного контакта "Имя - Телефон"
        // если контактов нет в телефонной книге - вернуть пустой TreeSet
        Set<String> allContacts = new TreeSet<>();
        StringBuilder builder = new StringBuilder();
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            String phone = entry.getKey();
            String name = entry.getValue();
            builder.append(name).append(" - ").append(phone);
            allContacts.add(builder.toString());
            builder.delete(0, builder.length());
        }
        return allContacts;
    }

    // для обхода Map используйте получение пары ключ->значение Map.Entry<String,String>
    // это поможет вам найти все ключи (key) по значению (value)
    /*
        for (Map.Entry<String, String> entry : map.entrySet()){
            String key = entry.getKey(); // получения ключа
            String value = entry.getValue(); // получения ключа
        }
    */
}
