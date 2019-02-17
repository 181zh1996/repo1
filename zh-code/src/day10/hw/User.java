package day10.hw;

import cn.day06.text.Coder;

public class User {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.turnOn();
        USB usb = new Mouse();
        computer.usbDerive(usb);
        USB usb1 = new JianPan();
        computer.usbDerive(usb1);





        computer.turnOff();
    }
}
