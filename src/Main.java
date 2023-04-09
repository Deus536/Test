public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer("MSI","Проц");
        computer.setCpu(new CPU(1000,2,"Привет", 5.5));
        System.out.println(computer.toString());
    }
}