package day10.demo.TryAngia;

public class JP implements USB {
    @Override
    public void Open() {
        System.out.println("�Ѽ��̸������ȥ");
    }

    @Override
    public void Close() {
        System.out.println("һ��С�İѼ��̰γ�����");
    }

    public void Qiao(){
        System.out.println("С��ָ�ڼ������û�");
    }
}
