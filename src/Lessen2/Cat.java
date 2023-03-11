package Lessen2;

public class Cat extends Animal{
    public void runCat() {
        int runCat = 200;
        if (this.run <= runCat) {
            System.out.println("Кошка побежит");
        } else {
            System.out.println("Кошка не может бежать");
        }
    }

    public void swimCat() {
        int swimCat = 0;
        if (this.swim < swimCat) {
            System.out.println("Кошка не умеет плавать");
        } else {
            System.out.println("Кошка не умеет плавать");
        }
    }

    public void jumpCat() {
        int jumpCat = 10;
        if (this.jump <= jumpCat) {
            System.out.println("Кошка прыгает");
        } else {
            System.out.println("Кошка не может пыгать");
        }
    }

}
