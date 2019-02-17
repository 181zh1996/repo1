package moni;


import java.util.Scanner;

/*
根据以下需求，用代码实现
	1.程序运行后通过键盘录入一个字符串。要求字符串中必须包含：大写字母
    2.如果录入的字符串中没有大写字母、要进行给出提示。然后程序可以继续录入字符串
    3.如果录入的字符串中有大写字母。那么统计这个字符串中小写字母、
    大写字母、数字、其他字符出现的个数。程序结束
 */
public class T1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = 0;
        int a2 = 0;
        int a3 = 0;
        int a4 = 0;
        int a5 = 0;
            System.out.println("请输入一个字符串");
        while (true) {
            String a = sc.next();
            char[] c = a.toCharArray();
            for (int i = 0; i < c.length; i++) {
                if (c[i] >= 65 && c[i] <= 90) {
                    a1++;
                }
            }
            if (a1 == 0) {
                System.out.println("您输入的字符串中没有大写字母。请重新输入：");
            } else {
                for (int x = 0; x < c.length; x++) {
                    if (c[x] >= 97 && c[x] <= 122) {
                        a2++;
                    } else if (c[x] >= 48 && c[x] <= 57) {
                        a3++;
                    } else if (c[x] >= 65 && c[x] <= 90) {
                        a4++;
                    } else {
                        a5++;
                    }
                }
                break;
            }
        }
        System.out.println("大写字母有：" + a4 + "个");
        System.out.println("小写字母有：" + a2 + "个");
        System.out.println("数字有：" + a3 + "个");
        System.out.println("其他有：" + a5 + "个");
    }
}