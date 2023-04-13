public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer("MSI","Проц");
        computer.setCpu(new CPU(1000,2,"Привет", 5.5));
        computer.setRam(new RAM("MS",256,4.5));
        computer.setStorage(new Storage(StorageType.SSD,512,4.4));
        computer.setMonitor(new Monitor(15.4,MonitorType.TN,24));
        computer.setKeyboard(new Keyboard("МСИ",true,1.4));
        System.out.println(computer.toString());
    }
}