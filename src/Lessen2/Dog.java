package Lessen2;

public class Dog extends Animal {
    public void runDog() {
        int runDog = 500;
        if (this.run <= runDog) {
            System.out.println("Собака побежит");
        } else {
            System.out.println("Собака не может бежать");
        }
    }
    public void swimDog() {
        int swimDog = 10;
        if (this.swim <= swimDog) {
            System.out.println("Собака плавает");
        } else {
            System.out.println("Собака не может плавать");
        }
    }
    public void jumpDog() {
        int jumpDog = 2;
        if (this.jump <= jumpDog) {
            System.out.println("Собака прыгает");
        } else {
            System.out.println("Собака не может пыгать");
        }
    }
    public void runDog1() {
        int runDog1 = 600;
        if (this.run <= runDog1) {
            System.out.println("Собака 2 побежит");
        } else {
            System.out.println("Собака 2 не может бежать");
        }
    }
    public void swimDog1() {
        int swimDog1 = 9;
        if (this.swim <= swimDog1) {
            System.out.println("Собака 2 плавает");
        } else {
            System.out.println("Собака 2 не может плавать");
        }
    }
    public void jumpDog1() {
        int jumpDog1 = 1;
        if (this.jump <= jumpDog1) {
            System.out.println("Собака 2 прыгает");
        } else {
            System.out.println("Собака 2 не может пыгать");
        }
    }
}




