package day10.demo.TryAngia;

public class JP implements USB {
    @Override
    public void Open() {
        System.out.println("把键盘给他插进去");
    }

    @Override
    public void Close() {
        System.out.println("一不小心把键盘拔出来了");
    }

    public void Qiao(){
        System.out.println("小手指在键盘上敲击");
    }
}
