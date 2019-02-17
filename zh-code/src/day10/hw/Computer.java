package day10.hw;

public class Computer {
    public void turnOn(){
        System.out.println("开机");
    }
    public void turnOff(){
        System.out.println("关机");
    }
    public void usbDerive(USB usb){
        usb.open();
    if (usb instanceof Mouse){
        Mouse mouse = (Mouse) usb;
        mouse.kick();
    }else if (usb instanceof JianPan){
        JianPan jianPan = (JianPan) usb;
        jianPan.nock();
    }

        usb.close();
    }
}
