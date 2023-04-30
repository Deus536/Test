import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TelephoneBook {
    public static void getBook() throws IOException {
        TreeMap<String, String> map = new TreeMap<>() {} ;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        while (true){
           String str = bufferedReader.readLine();
            if(map.containsKey(str)){
                map.get(str);
                System.out.println(str + " - " + map.get(str));
            }else {
                System.out.println("Введите телефон: ");
                String tel = bufferedReader.readLine();
                map.put(str, tel);
            }

        }
    }
}
