package Lessen2;

public class Animal {
    public static int allAnimal;
    int run = 150;
    double jump = 0.5;
    int swim = 10;
    public Animal(){
        allAnimal++;
    }
    public static int getAllAnimal(){
        return allAnimal;
    }
}

