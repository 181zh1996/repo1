package day09;


import java.util.ArrayList;

public class HongBao {
    public static void main(String[] args) {
        Manger manger = new Manger("����",10000);

        Member a1=new Member("·�˼�",0);
        Member a2=new Member("�ڻ���",0);
        Member a3=new Member("�˷���",0);
        Member a4=new Member("������",0);
        Member a5=new Member("������",0);

        manger.show();
        a1.show();
        a2.show();
        a3.show();
        a4.show();
        a5.show();
        System.out.println("����������������������������������������������������������������������������������������������������������������������������������������");

        ArrayList<Double> list = manger.send(1632.6,5);

        a1.receive(list);
        a2.receive(list);
        a3.receive(list);
        a4.receive(list);
        a5.receive(list);

        manger.show();
        a1.show();
        a2.show();
        a3.show();
        a4.show();
        a5.show();
    }
}
