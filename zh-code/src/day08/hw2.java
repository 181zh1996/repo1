package day08;

import java.util.ArrayList;
import java.util.Random;

/*
����String getStr()����
		����������
			��ȡ����Ϊ5������ַ���
			�ַ����������4����дӢ����ĸ��1��0-9֮��(����0��9)���������
			Ӣ����ĸ�����ֵ�˳���������
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




