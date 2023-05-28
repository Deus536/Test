import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TelephoneBook {
    public static void getBook() throws IOException {
        TreeMap<String, String> map = new TreeMap<>() {
        };

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Pattern patternName = Pattern.compile("^[а-яА-Я]+$");
        Pattern patternNumber = Pattern.compile("(\\+7)(\\d[0-9]{9})");    //(\+7)(\d[0-9]{10})+/g
//        Pattern patternBug = Pattern.compile("^[\\wа-яА-Я,\" .\\-=`~@:;\\{\\}\\]\\[]+$");
        while (true) {
            System.out.println("Введите команду, номер телефона или имя: ");
            String str = bufferedReader.readLine();
            Matcher matcherName = patternName.matcher(str);
            Matcher matcherNumber = patternNumber.matcher(str);
//            Matcher matcherBug = patternBug.matcher(str);
            String commands = "LIST";
            if (str.equals(commands)) {
                if (!map.isEmpty()) {
                    System.out.println("Список всех контактов: \nИмя - " + map.keySet() + ". Номер телефона - " + map.values());
                } else {
                    System.out.println("Список пуст");
                }
//                boolean presence = false;
//                for (String key : map.keySet()) {
//                    Integer value = Integer.valueOf(map.get(key));
//                    System.out.println("Список всех контактов: \nИмя - " + key + ". Номер телефона - " + value);
//                    presence = true;
//                }
//                if (!presence) {
//                    System.out.println("Список пуст.");
//                }
            }
            if (matcherName.find()) {
                if (map.containsKey(str)) {
                    for (Map.Entry entry : map.entrySet()){
                        if(entry.getKey().equals(str)){

                        }
                    }
                        map.get(str);
                    System.out.println(str + " - " + map.get(str));
                } else {
                    System.out.println("Введите телефон для абаннента \"" + str + "\" :");
                    String tel = bufferedReader.readLine();
                    while (true) {
                        Matcher matcherTel = patternNumber.matcher(tel);
                        if (matcherTel.find()) {
                            map.put(str, tel);
                            System.out.println("Контанкт сохранен!");
                            break;
                        } else {
                            System.out.println("Вы ввели не правильный номер.");
                            tel = bufferedReader.readLine();
                        }
                    }
                }
            }
            if (matcherNumber.find()) {
                boolean presence = false;
                for (Map.Entry entry : map.entrySet()) {
                    if (entry.getValue().equals(str)) {
                        System.out.println(entry.getKey() + " - " + str);
                        presence = true;
                    }
                }
                if (!presence) {
                    System.out.println("Введите имя для номера \"" + str + "\" :");
                    String name = bufferedReader.readLine();
                    while (true) {
                        Matcher matcherName1 = patternName.matcher(name);
                        if (matcherName1.find()) {
                            map.put(name, str);
                            System.out.println("Контанкт сохранен!");
                            break;
                        } else {
                            System.out.println("Ввели не правильно имя");
                            name = bufferedReader.readLine();
                        }
                    }
                }
            }
        }
    }
}



