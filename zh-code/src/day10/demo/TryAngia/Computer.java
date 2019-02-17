package day10.demo.TryAngia;

public class Computer {
    public void turnON() {
        System.out.println("开机啦！");
    }

    public void turnOff() {
        System.out.println("关机啦！");
    }

    public void usbDerive(USB usb) {
        usb.Open();
        if (usb instanceof Mouse) {
            Mouse mouse = (Mouse) usb;
            mouse.kick();
        } else if (usb instanceof JP) {
            JP jp = (JP) usb;
            jp.Qiao();
        }

        usb.Close();
    }
}
