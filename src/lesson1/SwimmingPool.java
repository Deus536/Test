package lesson1;

public class SwimmingPool {
    public static void main(String[] args) {
        int volume = 1200;
        int fillingSpeed = 30;
        int devastationSpeed = 10;
        int sum = 0;
        int count = 0;
        while ( volume > sum ) {
            for (int i = 0; sum >= i; i++) {
                    sum = sum + fillingSpeed - devastationSpeed;
                    count++;
                    if (sum == volume) {
                    break;
                }
            }
        System.out.println(count);

    }
}
}
