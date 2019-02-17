package day07;
import java.util.Scanner;
public class Stest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入第一个数字");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个数字");
        int num2 = sc.nextInt();
        int result = num1+num2;
        System.out.println("两个数字相加的结果是"+result);
    }
}
