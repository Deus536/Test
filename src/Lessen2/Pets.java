package Lessen2;
    public class Pets(String[] args){
        Dog dog1 = new Dog();
        dog1.Run(500)
        Dog dog2 = new Dog();
        dog2.run = 600;



}

class Dog {
    int run = 500;
    double jump = 0.4;
    int swim = 10;
    void Run(int canrun){
        run = canrun;
    }
}
class Cat{
    int run = 200;
    int swim = Integer.parseInt(null);
    int jump = 2;

}
class Horse {
    int run = 1500;
    int swim = 100;
    int jump = 3;
}
class Bird{
    int flight = 5;
    int swim = Integer.parseInt(null);
    double jump = 0.1;
}
