package lesson1;

import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args){
        int value = new Scanner(System.in).nextInt();
        int result = 1;
        for (int i = 1; i <= value; i++) {
             result= result * i;
        }
        System.out.println(result);
    }
}

