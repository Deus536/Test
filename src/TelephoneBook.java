import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TelephoneBook {
    public static void getBook() throws IOException {
        TreeMap<String, String> map = new TreeMap<>() {
        };
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Pattern pattern = Pattern.compile("[а-яА-Я]{1,}");
        Pattern pattern1 = Pattern.compile("\\d[0-9]");    //(\+7)(\d[0-9]{10})+/g
        while (true) {
            System.out.println("Введите команду, номер телефона или имя: ");
            String str = bufferedReader.readLine();
            Matcher matcher = pattern.matcher(str);
            Matcher matcher1 = pattern1.matcher(str);
            if (matcher.find()) {
                if (map.containsKey(str)) {
                    map.get(str);
                    System.out.println(str + " - " + map.get(str));
                } else {
                    System.out.println("Введите телефон: ");
                    String tel = bufferedReader.readLine();
                    while (true) {
                        Matcher matcherTel = pattern1.matcher(tel);
                        if (matcherTel.find()) {
                            map.put(str, tel);
                            break;
                        } else {
                            System.out.println("Вы ввели не правильный номер.");
                            tel = bufferedReader.readLine();
                        }
                    }
                }
            }
            if (matcher1.find()) {
                boolean presence = false;
                for (Map.Entry entry : map.entrySet()) {
                    if (entry.getValue().equals(str)) {
                        System.out.println(entry.getKey() + " - " + str);
                        presence = true;
                    }
                }
                if (!presence) {
                    System.out.println("Введите имя: ");
                    String name = bufferedReader.readLine();
                    while (true) {
                        Matcher matcherName = pattern.matcher(name);
                        if (matcherName.find()) {
                            map.put(name, str);
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
