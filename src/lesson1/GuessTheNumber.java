package lesson1;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args){
        int value = new Random().nextInt(100);
        int attempt = new Scanner(System.in).nextInt();
        int difference = value - attempt;
        int difference1= attempt - value;
         while (true){
                if(value > attempt){
                    System.out.println("Вы ввели на  " + difference + " меньше чем было число");
                    break;
                } else if (value < attempt) {
                    System.out.println("Вы ввели на  " + difference1 + " больше чем было число");
                    break;
                } else {
                    System.out.println("Вы угадали чило");
                    break;
                }

         }

    }
}
