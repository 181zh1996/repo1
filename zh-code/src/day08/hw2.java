package day08;

import java.util.ArrayList;
import java.util.Random;

/*
定义String getStr()方法
		功能描述：
			获取长度为5的随机字符串
			字符串由随机的4个大写英文字母和1个0-9之间(包含0和9)的整数组成
			英文字母和数字的顺序是随机的
 */
public class hw2 {
    public static void main(String[] args) {
        String str = getStr();
        System.out.println(str);
    }

    public static String getStr() {
        Random r = new Random();
        int a = r.nextInt(26) + 65;
        int b = r.nextInt(26) + 65;
        int c = r.nextInt(26) + 65;
        int d = r.nextInt(26) + 65;
        int f = r.nextInt(26) + 65;
        int e = r.nextInt(10) + 48;


        int index = r.nextInt(5);
        byte[] arr = {(byte) a, (byte) b, (byte) c, (byte) d, (byte) f};

        for (int i = 0; i < arr.length; i++) {
            if (index == i) {
                arr[i] = (byte) e;
            }
        }
        String str = new String(arr);
        return str;
    }
}




