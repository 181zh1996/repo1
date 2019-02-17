package test;
/*
1.功能描述：模拟计算器功能，对键盘录入的两个int类型的数据进行加、减、乘、除的运算，并打印运算结果
	2.要求：
		(1)键盘录入三个整数,其中前两个整数代表参加运算的数据，
			第三个整数为要进行的运算(0:表示加法运算,1:表示减法运算,2:表示乘法运算,3:表示除法运算)
		(2)使用今天所学知识完成功能
		(3)演示格式如下:
			请输入第一个整数:30
			请输入第二个整数:40
			请输入您要进行的运算(0:表示加法运算,1:表示减法运算,2:表示乘法运算,3:表示除法运算):0
			控制台输出:30+40=70
 */
import java.util.Scanner;
public class T009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("第一个数据");
        int x = sc.nextInt();
        System.out.println("第二个数据");
        int y = sc.nextInt();
        System.out.println("第三个数据,范围在0-3之间");
        int z = sc.nextInt();
        if(z == 0  ){
            System.out.println(x+"+"+y+"="+(x+y));
        }else if (z==1){
            System.out.println(x+"-"+y+"="+(x-y));
        }else if (z == 2){
            System.out.println(x+"*"+y+"="+(x*y));
        }else if (z == 3){
            System.out.println(x+"/"+y+"="+(x/y));
        }else {
            System.out.println("您输入的数值有误，请重新输入");
        }
    }
}
