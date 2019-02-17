package day10.demo.TryAngia;

public class Mouse implements USB {
    @Override
    public void Open() {
        System.out.println("把鼠标插进去");
    }

    @Override
    public void Close() {
        System.out.println("把鼠标拔出来了");
    }

    public void kick(){
        System.out.println("用小手手抚摸鼠标");
    }
}
