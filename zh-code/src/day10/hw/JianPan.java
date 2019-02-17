package day10.hw;

public class JianPan implements USB {
    @Override
    public void open() {
        System.out.println("²åÉÏ¼üÅÌ");
    }

    @Override
    public void close() {
        System.out.println("°Î³ö¼üÅÌ");
    }
    public void nock(){
        System.out.println("°´¼üÅÌ");
    }
}
