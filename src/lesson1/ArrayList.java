package lesson1;


import java.sql.SQLOutput;
import java.util.List;

public class ArrayList {

    public static void main(String[] args) {


    String str1 = "Это первая строка";
    String str2 = new String(str1);
    String str3 = "Это третья строка";
    String str4 = "one two one two";
        System.out.println("Длина первой строки " + str1.length());
    //    for(int i = 0; i < str1.length(); i++){
    //        System.out.println((int)str1.charAt(i));
        //   }

        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str1 == str2);
        System.out.println(str4.indexOf('w'));
        System.out.println(str4.lastIndexOf('w'));
        System.out.println(str4.compareTo(str1));
        System.out.println(str1.compareTo(str2));
        if (str1.compareTo(str2) == 0){
            System.out.println(str1 + " = " + str2);
        }






//        Integer x = 10000;
//        Integer z = 10000;
//        int y = 10000;
//        System.out.println(x == y);
//        System.out.println(z.equals(x));


    }
class  Human{
        int age;
        String name;

}
}
