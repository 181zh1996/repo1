package test01;
import java.util.Scanner;
public class T005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("�������һ������");
        int a = sc.nextInt();
        System.out.println("������ڶ�������");
        int b = sc.nextInt();
        int sum = getSum(a,b);
        System.out.println(sum);

    }
    public static int getSum(int a, int b){
        return a+b;
    }
   /* public static int getSum(double a, int b){
        return (int)(a+b);
    }
    public static int getSum(double a, double b){
        return (int)(a+b);
    }
    public static int getSum(int a, double b){
        return (int)(a+b);
    }*/
}
