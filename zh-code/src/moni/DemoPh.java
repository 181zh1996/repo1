package moni;

public class DemoPh {
    public static void main(String[] args) {


        Phone phone = new Phone("诺基亚",100);
        phone.call("蜡笔小新");
        phone.sendMessage("蜡笔小新");
        System.out.println();

        SmartPhone  s =new SmartPhone("华为",3000);
        s.call("樱桃小丸子");
        s.sendMessage("樱桃小丸子");
        s.playGame();
        System.out.println();

        Pad p= new Pad("ipad",2000);
        p.playGame();
        p.listenMusic();
    }
}
