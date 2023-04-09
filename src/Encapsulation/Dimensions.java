package Encapsulation;

public class Dimensions {
    private final double height;
    private final double width;
    private final double length;
    public Dimensions(double height, double width, double length){
        this.height = height;
        this.width = width;
        this.length = length;
    }
    public Dimensions setHeight(double height){
        return new Dimensions(height, width, length);
    }
    public Dimensions setWidth(double width){
        return new Dimensions(height, width, length);
    }
    public Dimensions setLength(double length){
        return new Dimensions(height, width, length);
    }
    public double getHeight() {
        return height;
    }
    public double getWidth() {
        return width;
    }
    public double getLength() {
        return length;
    }
    public double volume(){
        return (length * width * length) / 5000;
    }
    public void volumeString(){
        System.out.println("Длина " + length + "см.;" + "\n" + "Ширина " + width + "cм.;"
                + "\n" + "Высота " + height + "cм.;");
    }
}
