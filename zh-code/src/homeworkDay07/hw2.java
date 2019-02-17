package homeworkDay07;

import java.util.ArrayList;
import java.util.Scanner;

/*
1.创建一个ArrayList集合，用于存储一些字符串
	2.通过键盘录入5个字符串，保存到集合中
	3.遍历集合，打印每一个字符串
 */
public class hw2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        System.out.println("请连续输入五个字符串");
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();
        String d = sc.next();
        String e = sc.next();

        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        list.add(e);

        for (int i = 0; i<list.size();i++){
            String str=list.get(i);
            System.out.println(str);
        }
    }
}
