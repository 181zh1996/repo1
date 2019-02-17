package test01;

public class T004 {
    public static void main(String[] args) {
        System.out.println("这个长方形周长是"+zhouChang(21,41));
    }
    public static int zhouChang(int chang,int kuan){
        int zc=(chang*2) +(kuan*2);
        return zc;
    }
}
