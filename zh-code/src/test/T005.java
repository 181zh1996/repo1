package test;
import java.util.Scanner;
public class T005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数值");
        int x = sc.nextInt();
        int y;
        if (x<0){
            System.out.println("y=-1");
        }else if(x==0){
            System.out.println("y=0");
        }else if (x>0 && x != 2){
            System.out.println("y=1");
        }else {
            System.out.println("x=2,y=1");
        }
    }
}
