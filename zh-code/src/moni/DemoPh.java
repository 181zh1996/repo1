package moni;

public class DemoPh {
    public static void main(String[] args) {


        Phone phone = new Phone("ŵ����",100);
        phone.call("����С��");
        phone.sendMessage("����С��");
        System.out.println();

        SmartPhone  s =new SmartPhone("��Ϊ",3000);
        s.call("ӣ��С����");
        s.sendMessage("ӣ��С����");
        s.playGame();
        System.out.println();

        Pad p= new Pad("ipad",2000);
        p.playGame();
        p.listenMusic();
    }
}
