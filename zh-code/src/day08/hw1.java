package day08;


import java.util.ArrayList;
import java.util.Scanner;

/*
1.键盘录入一个大字符串,再录入一个小字符串
	2.统计小字符串在大字符串中出现的次数
	3.代码运行打印格式:
		请输入大字符串:woaiheima,heimabutongyubaima,wulunheimahaishibaima,zhaodaogongzuojiushihaoma
		请输入小字符串:heima
 */
public class hw1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一串大字符");
        String str1 = sc.next();
        
        System.out.println("请输入一串小字符");
        String e = sc.next();

        String[] str = str1.split(",");
        
        int count=0;
        int index;
        
        for (int i = 0; i<str.length;i++){
            String s = str[i];
            index=s.indexOf(e);
            if(index!=-1){
                count++;
            }
        }
        System.out.println("共出现"+count+"次");
    }
}
