//package example;

public class main_shop{
    public static void main(String[] args) {
        // OS, Ram, ScreenSize, Battery, Camera, Processor
        // Phone p = new Phone("Mac",16,6,5000,18,3200);
        final Phone p = new PhoneBuilder().setOs("Android").setBattery(8000).setCamera(18).setProcessor(3200)
                .getPhone();
        System.out.println(p);
    }
}