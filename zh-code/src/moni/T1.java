package moni;


import java.util.Scanner;

/*
�������������ô���ʵ��
	1.�������к�ͨ������¼��һ���ַ�����Ҫ���ַ����б����������д��ĸ
    2.���¼����ַ�����û�д�д��ĸ��Ҫ���и�����ʾ��Ȼ�������Լ���¼���ַ���
    3.���¼����ַ������д�д��ĸ����ôͳ������ַ�����Сд��ĸ��
    ��д��ĸ�����֡������ַ����ֵĸ������������
 */
public class T1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = 0;
        int a2 = 0;
        int a3 = 0;
        int a4 = 0;
        int a5 = 0;
            System.out.println("������һ���ַ���");
        while (true) {
            String a = sc.next();
            char[] c = a.toCharArray();
            for (int i = 0; i < c.length; i++) {
                if (c[i] >= 65 && c[i] <= 90) {
                    a1++;
                }
            }
            if (a1 == 0) {
                System.out.println("��������ַ�����û�д�д��ĸ�����������룺");
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
        System.out.println("��д��ĸ�У�" + a4 + "��");
        System.out.println("Сд��ĸ�У�" + a2 + "��");
        System.out.println("�����У�" + a3 + "��");
        System.out.println("�����У�" + a5 + "��");
    }
}