package Lessen2;

public class Lessen1 {
    public static void main(String[] args){
        Dog dog = new Dog();
        dog.runDog();
        dog.swimDog();
        dog.jumpDog();
        System.out.println("--------");
        Cat cat = new Cat();
        cat.jumpCat();
        cat.runCat();
        cat.swimCat();
        System.out.println("--------");
        Horse horse = new Horse();
        horse.runHorse();
        horse.jumpHorse();
        horse.swimHorse();
        System.out.println("--------");
        Dog dog2 = new Dog();
        dog2.runDog1();
        dog2.jumpDog1();
        dog2.swimDog1();
        System.out.println("---------");
        System.out.println("Всего животных " + Animal.getAllAnimal());


    }
}
