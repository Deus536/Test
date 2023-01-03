package lesson1;

public class HomeWork {
    public static void main(String[] args) {
        printThreeWords();
        System.out.println("-------");
        checkSumSign();
        System.out.println("-------");
        printColor();
        System.out.println("-------");
        compareNumbers();
    }
    public static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void checkSumSign(){
        int a = 9;
        int b = 5;
        int sum = a + b;
        if(sum >= 0){
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
    public static void printColor(){
        int value = 15;
        if(value <= 0){
            System.out.println("Красный");
        } if(value > 0 && value < 100){
            System.out.println("Желтый");
        } else if(value > 100){
            System.out.println("Зеленый");
        }
    }
    public static void compareNumbers(){
        int a = 3;
        int b = 7;
        if(a >= b) {
            System.out.println("a >= b");
        } else  {
            System.out.println("a < b");
        }


    }
}
