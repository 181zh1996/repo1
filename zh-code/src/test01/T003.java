package test01;

public class T003 {
    public static void main(String[] args) {
        int sum = getSum();
        System.out.println("1-100µÄºÍ=" + sum);
    }
    public static int getSum() {
        int a = 0;
        for (int i = 1; i <= 100; i++) {
            a += i;
        }
        return a;
    }
}
