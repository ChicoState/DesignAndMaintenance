//package example;

public class Phone{
    private String os;
    private int ram;
    private double screenSize;
    private double battery;
    private int camera;
    private int processor;

    public Phone(String os, int ram, double screenSize, double battery, int camera, int processor) {
        this.os = os;
        this.ram = ram;
        this.screenSize = screenSize;
        this.battery = battery;
        this.camera = camera;
        this.processor = processor;
    }

    @Override
    public String toString() {
        return "Phone [battery=" + battery + ", camera=" + camera + ", os=" + os + ", processor=" + processor + ", ram="
                + ram + ", screenSize=" + screenSize + "]";
    }

    
    
}