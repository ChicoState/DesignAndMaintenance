//package example;
public class PhoneBuilder{
    private String os;
    private int ram;
    private double screenSize;
    private double battery;
    private int camera;
    private int processor;

    public PhoneBuilder setOs(String os) {
        this.os = os;
        return this;
    }

    public PhoneBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public PhoneBuilder setScreenSize(double screenSize) {
        this.screenSize = screenSize;
        return this;
    }

    public PhoneBuilder setBattery(double battery) {
        this.battery = battery;
        return this;
    }

    public PhoneBuilder setCamera(int camera) {
        this.camera = camera;
        return this;
    }

    public PhoneBuilder setProcessor(int d) {
        this.processor = d;
        return this;
    }

    public Phone getPhone(){
        return new Phone(os, ram, screenSize, battery, camera, processor);
    }

}