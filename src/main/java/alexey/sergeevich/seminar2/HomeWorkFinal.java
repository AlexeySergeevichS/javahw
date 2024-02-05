package alexey.sergeevich.seminar2;

import java.util.*;
import java.util.Scanner;

public class HomeWorkFinal {
    static Scanner scanner = new Scanner(System.in);
    private static HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();

    public static void main(String[] args) {
        String[] contacts = {
                "Григорьев Анатолий 654452",
                "Фокин Глеб 1345244",
                "Шестаков Клим 4343332",
                "Хохлов Мартин 2554542",
                "Шубин Лазарь 4422343733",
                "Шубин Лазарь 4343444339",
                "Шубин Лазарь 44324434333",
                "Гущина Арьяна 243354332",
                "Брагина Виоланта 24354332",
                "Афанасьева Екатерина 13414332",
                "Рыбакова Снежана 434423442",
                "Лазарева Алла 433334442",
                "Бирюков Владлен 443354442",
                "Копылов Панкратий 4434544",
                "Горбунов Рубен 45556553",
                "Лыткин Герман 134566642",
                "Бирюков Владлен 43335443344",
                "Соколов Орест 134313435"
        };
        makePhoneBook(contacts);
//        System.out.println(phoneBook);
        System.out.println("~~~~~~~~~~~~~~~~");
        System.out.println("find - поиск по фамилии и имени");
        System.out.println("print - вывод справочника");
        System.out.println("add - добавить контакт");
        System.out.println("~~~~~~~~~~~~~~~~");
        while (true) {

            System.out.print("Введи команду:");
            String inputString = scanner.nextLine();
            if (inputString.equals("")) {
                System.out.println("Завершение работы приложения.");
                break;
            }

            switch (inputString) {
                case "find" -> {
                    System.out.print("НАЙТИ: ");
                    inputString = scanner.nextLine();
                    System.out.println(find(inputString) != null ? find(inputString) : "Не найдено!");
                }
                case "print" -> {
                    printPhoneBook();
                }
                case "add" -> {
                    System.out.print("Введите в формате 'фамилия имя номер':  ");
                    inputString = scanner.nextLine();
                    add(inputString);
                }
                default -> {
                    System.out.println("Неверная команда!");
                }
            }
        }

    }

    private static void makePhoneBook(String[] contacts) {
        //HashMap<Double, ArrayList<Student>> statistics = new HashMap<>();
        for (String contact : contacts) {
            add(contact);
        }
    }

    private static void printPhoneBook() {

        TreeMap<ArrayList<String>, String> sortedBook = new TreeMap<>(Comparator.comparing(o -> -o.size()));

        for (Map.Entry<String, ArrayList<String>> element : phoneBook.entrySet()) {
            sortedBook.put(element.getValue(), element.getKey());
        }
        for (Map.Entry<ArrayList<String>, String> element : sortedBook.entrySet()) {
            //System.out.printf("%d место - средний балл %.2f\n", counter, element.getKey());
            System.out.println(element.getValue());
            System.out.println(element.getKey());
            System.out.println("+++++++++++++++");
        }
    }

    private static void add(String str) {
        String[] contactParts = str.split(" ");
        if (contactParts.length == 3) {
            String name = contactParts[0] + " " + contactParts[1];
            if (phoneBook.containsKey(name)) {
                phoneBook.get(name).add(contactParts[2]);
            } else {
                ArrayList<String> list = new ArrayList<>();
                list.add(contactParts[2]);
                phoneBook.put(name, list);
            }
        } else {
            System.out.println("Неправильный формат данных");
        }
    }

    private static ArrayList<String> find(String name) {
        if (phoneBook.containsKey(name)) {
            return phoneBook.get(name);
        } else {
            return null;
        }
    }
}

