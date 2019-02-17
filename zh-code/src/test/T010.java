package test;
import java.util.Scanner;
public class T010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数值，范围在1-12");
        int x = sc.nextInt();

        if (x>12 || x<1){
            System.out.println("请输入正确数值");
        }else if (x>=3 && x<=5){
            System.out.println(x+"月是春季");
        }else if (x>=6 && x<=8){
            System.out.println(x+"月是夏季");
        }else if (x>=9 && x<=11){
            System.out.println(x+"月是秋季");
        }else {
            System.out.println(x+"月是冬季");
        }
    }
}
