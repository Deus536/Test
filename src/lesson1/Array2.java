package lesson1;

import java.util.Arrays;

public class Array2 {

    public static void main(String [] args){
        array();
    }
    public static void array() {
        int[] array = {1, 2, 3, 4, 5, 6};
        int[] array2 = new int[array.length];
        int number = 1;
        if (number == 0) {
            System.out.print(array.length + " ");
            return;
        }

        for(int i = 0; i < array.length; i++) {
            if (i + number > array.length - 1){
                array2[i + number - array.length] = array[i];
            } else {
                array2[i + number] = array[i];
            }

        }
        for(int x : array2){
        System.out.print(x + " ");
    }
    }

}
