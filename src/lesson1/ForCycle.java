package lesson1;

import java.util.Scanner;

public class ForCycle {
    public static void main(String[] args){
        int value = new Scanner(System.in).nextInt();
        for(int i = 0; i <= value; i++){
            for(int j=0; j <= value; j++){
                if(i*i == value){
                }
                System.out.println(i +"*"+j);
            }
        }
    }
}
