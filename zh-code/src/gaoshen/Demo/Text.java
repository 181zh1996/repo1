package gaoshen.Demo;

import java.util.ArrayList;
import java.util.Scanner;

public class Text {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("������������֤��");
        String a = sc.next();
        String str = a;

        //�жϳ��ȷ�����������
        if (str.length() == 18 | str.length() == 16) {
            byte[] b = str.getBytes();
            // System.out.println(b);

            //�жϳ������һλ ����λ�ò��ܳ��ֳ�����������Ķ���
            for (int i =0 ;i<b.length ; i--) {
                if (!(b[i] <= 57 && b[i] >= 48)) {

                    System.out.println("���ݲ����ϱ�׼");
                    break;

                }else {
                    //ת��Ϊ�ַ��� ��ȡ����λ�� ��ӡ
                    String st = new String(b);
                    System.out.println(st.substring(6,14));
                    break;
                }
            }

        } else {
            System.out.println("���Ȳ��������֤�ű�׼");
        }
    }
}