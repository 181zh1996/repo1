package day10.demo.TryAngia;

public class Mouse implements USB {
    @Override
    public void Open() {
        System.out.println("�������ȥ");
    }

    @Override
    public void Close() {
        System.out.println("�����γ�����");
    }

    public void kick(){
        System.out.println("��С���ָ������");
    }
}
