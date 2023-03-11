package Lessen2;

public class Horse extends Animal{
    public void runHorse() {
        int runHorse = 1500;
        if (this.run <= runHorse) {
            System.out.println("Лошадь побежит");
        } else {
            System.out.println("Лошадь не может бежать");
        }
    }
    public void swimHorse() {
        int swimHorse = 100;
        if (this.swim <= swimHorse) {
            System.out.println("Лошадь плавает");
        } else {
            System.out.println("Лошадь не может плавать");
        }
    }
    public void jumpHorse() {
        int jumpHorse = 3;
        if (this.jump <= jumpHorse) {
            System.out.println("Лошадь прыгает");
        } else {
            System.out.println("Лошадь не может пыгать");
        }
    }
}
