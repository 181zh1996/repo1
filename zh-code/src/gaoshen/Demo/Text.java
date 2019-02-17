package gaoshen.Demo;

import java.util.ArrayList;
import java.util.Scanner;

public class Text {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的身份证号");
        String a = sc.next();
        String str = a;

        //判断长度符不符合条件
        if (str.length() == 18 | str.length() == 16) {
            byte[] b = str.getBytes();
            // System.out.println(b);

            //判断除了最后一位 其他位置不能出现除了数字以外的东西
            for (int i =0 ;i<b.length ; i--) {
                if (!(b[i] <= 57 && b[i] >= 48)) {

                    System.out.println("内容不符合标准");
                    break;

                }else {
                    //转换为字符串 截取生日位置 打印
                    String st = new String(b);
                    System.out.println(st.substring(6,14));
                    break;
                }
            }

        } else {
            System.out.println("长度不符合身份证号标准");
        }
    }
}