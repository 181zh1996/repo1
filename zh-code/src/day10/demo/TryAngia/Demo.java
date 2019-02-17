package day10.demo.TryAngia;

public class Demo {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.turnON();
        USB usb = new Mouse();

        computer.usbDerive(usb);


        USB usb1 = new JP();

        computer.usbDerive(usb1);

        computer.turnOff();
    }
}
