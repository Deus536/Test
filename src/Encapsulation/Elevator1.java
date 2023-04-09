package Encapsulation;

import java.util.Scanner;

import static java.nio.file.Files.move;

public class Elevator1{
    public static void main(String[] args){
        Elevator elevator = new Elevator(-3, 10);
        while (true) {
            System.out.print("Введите номер этажа: ");
            int floor = new Scanner(System.in).nextInt();
            elevator.move(floor);
        }
    }
}

 class Elevator {
    int currentFloor = 1;
    int minFloor;
    int maxFloor;
    int count;
    public Elevator(int minFloor, int maxFloor){
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }
    public int getCurrentFloor(){
        return currentFloor;
    }
    public void moveDown(int floor){
        for(int i = getCurrentFloor(); i > floor; i--){
            currentFloor = currentFloor - 1;
            count--;
        }
        System.out.println("Лифт едет в низ " + count);
        count = 0;
    }
    public void moveUp(int floor){
        for(int i = getCurrentFloor(); floor > i; i++){
            currentFloor = currentFloor + 1;
            count++;
            }
        System.out.println("Лифт едет вверх " + count);
        count = 0;
    }
    public void move(int floor){
        if(floor > maxFloor || floor < minFloor) {
            System.out.println("Лифт не может ехать");
            return;
        }
        if(floor < currentFloor){
            moveDown(floor);
        } else if (floor == currentFloor) {
            System.out.println("Мы уже на этом этаже");
            return;
        } else {
            moveUp(floor);
        }

    }

}

