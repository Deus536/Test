package lesson1;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

        first();
        System.out.println("----");
        number();
        System.out.println("----");
        multiplication();
        System.out.println("----");
        square();
        System.out.println("----");
        oneArray();
        System.out.println("----");
        checkBalance();
        System.out.println("----");
    }

    public static void first(){
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for(int i = 0; i < array.length; i++){
            if(array[i] == 0) {
                array[i] = 1;
            } else if (array[i] == 1){
                array[i] = 0;
            }
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void number() {
        int[] array = new int[8];
        for (int i = 0; i < array.length; i++) {
            array[i] = i * 3;
            System.out.print(array[i] + " ");
        }System.out.println();
    }

    public static void multiplication(){
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for(int i = 0; i<array.length; i++) {
            if(array[i] < 6 )
            {
                array[i] = array[i] * 2;
            }
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static void square(){
        int[][] array =new int [5][5];
        for(int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(i == j){
                    array[i][j] = 1;
                } else {
                    array[i][j] = 0;
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for(int i = 0; i < array.length; i++){
            for(int j = array.length-1; j >= 0; j--){
                if (i == j){
                    array[i][j] = 1;
                } else {
                    array[i][j] = 0;
                }
                System.out.print(array[i][j] + " ");
            }System.out.println();
        }
        System.out.println();

    }
    public static void oneArray(){
        int[] array = {3, 4, 0, 10, 15, 13, -4};
        int max = array[0];
        int min = array[0];
        for(int i = 1; i < array.length; i++){
            int number = array[i];
            if(number < min){
                min = number;
            }
        }
        for(int i = 0; i < array.length; i++){
            int number = array[i];
            if(number > max){
                max = number;
            }
        }
        System.out.println("Минимальное значание: " + min);
        System.out.println("Максимальное значение: " + max);
    }
    public static void checkBalance(){
        int[] array = {2, 2, 2, 1, 2, 2, 10, 1};
        int sum = 0;
        for(int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        int right_sum = 0;
        for(int j = 0; j < array.length; j++) {
            right_sum = right_sum + array[j];
            sum = sum - array[j];
            if (right_sum == sum) {
                System.out.println("true");
            }
        }
    }

}

