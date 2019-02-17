package test;
import java.util.Scanner;
public class T006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的工龄");
        int x = sc.nextInt();
        System.out.println("请输入您的基本工资");
        int y = sc.nextInt();
        if (x >= 10 && x < 15) {
            System.out.println("您目前工作了" + x + "年，基本工资为" + y+"元,应涨工资5000元,涨后工资" + (y + 5000) + "元");
        } else if (x >= 5 && x < 10) {
            System.out.println("您目前工作了" + x + "年，基本工资为" + y+"元,应涨工资2500元,涨后工资" + (y + 2500) + "元");
        }else if (x >= 3 && x<5){
            System.out.println("您目前工作了" + x + "年，基本工资为" + y+"元,应涨工资1000元,涨后工资" + (y + 1000) + "元");
        }else if (x >= 1 && x<3){
            System.out.println("您目前工作了" + x + "年，基本工资为" + y+"元,应涨工资500元,涨后工资" + (y + 500) + "元");
        }else if (x >= 0 && x<1){
            System.out.println("您目前工作了" + x + "年，基本工资为" + y+"元,应涨工资200元,涨后工资" + (y + 200) + "元");
        }else {
            System.out.println("你输入的数据有误");
        }
    }
}


