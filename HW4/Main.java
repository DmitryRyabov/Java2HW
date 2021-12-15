package HW4;


import java.util.*;

public class Main {

    public void main(String[] args) {

        List<String> words = Arrays.asList(
                "Плюшка", "Ватрушка", "Пирог", "Пироженое", "Торт",
                "Борщ", "Хлеб", "Варенье", "Пироженое", "Торт",
                "Ватрушка", "Пирог", "Пироженое", "Хлеб", "Хлеб",
                "Пирог", "Пироженое", "Хлеб", "Хлеб", "Пироженое"
        );

        Set<String> unique = new HashSet<>(words);

        System.out.println("Первоначальный массив");
        System.out.println(words);
        System.out.println("Уникальные слова");
        System.out.println(unique);
        System.out.println("Частота встречаемости слов");
        for (String key : unique) {
            System.out.println(key + ": " + Collections.frequency(words, key));
        }


        HashMap<String, Long> phonebook = new HashMap<>();

        phonebook.put("Иванов Олег", 89514663559L);
        phonebook.put("Иванов Сергей", 89517223559L);
        phonebook.put("Петров Сергей", 89514663752L);
        phonebook.put("Иванов Дмитрий", 89514521899L);
        phonebook.put("Сидоров Константин", 89582488659L);
        phonebook.put("Петров Олег", 89511578959L);

        for (Map.Entry<String, Long> o : phonebook.entrySet()) {
            System.out.println(o.getKey() + ": " + o.getValue());
        }

        phonebook.get("Иванов");
        phonebook.get("Петров");
        phonebook.get("Сидоров");
    
    }
}
