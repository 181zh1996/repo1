package day10.hw;

public class JianPan implements USB {
    @Override
    public void open() {
        System.out.println("���ϼ���");
    }

    @Override
    public void close() {
        System.out.println("�γ�����");
    }
    public void nock(){
        System.out.println("������");
    }
}
