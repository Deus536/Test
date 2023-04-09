public class Computer {
    private CPU cpu;
    private RAM ram;
    private Storage storage;
    private Monitor monitor;
    private Keyboard keyboard;
    private final String vendor;
    private final String name;

    public Computer(String vendor, String name) {
        this.vendor = vendor;
        this.name = name;
    }

    public Computer(CPU cpu, RAM ram, Storage storage, Monitor monitor, Keyboard keyboard, String vendor, String name) {
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
        this.monitor = monitor;
        this.keyboard = keyboard;
        this.vendor = vendor;
        this.name = name;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }
    public void setRam(RAM ram) {
        this.ram = ram;
    }
    public void setStorage(Storage storage) {
        this.storage = storage;
    }
    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }
    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }
    public CPU getCpu() {
        return cpu;
    }
    public RAM getRam() {
        return ram;
    }
    public Storage getStorage() {
        return storage;
    }
    public Monitor getMonitor() {
        return monitor;
    }
    public Keyboard getKeyboard() {
        return keyboard;
    }
    public String getVendor() {
        return vendor;
    }
    public String getName() {
        return name;
    }
    public double getTotalWeight(){
        return cpu.getWeight() + ram.getWeight() + storage.getWeight() + monitor.getWeight() + keyboard.getWeight();
    }
    public String toString(){
        return  "Процессор: количество ядер " +  cpu.getNumberOfCores() + "\n" + "Частота: " + cpu.getFrequency() + "\n" +"Производитель: " + cpu.getManufacturer();
    }
}
