package gaoshen.Demo;

import java.util.Random;
import java.util.Scanner;

public class Demo001 {/*
��Ҫ����main������������¹��ܣ�
a.����һ������Ϊ5��int������arr����ʾ�û�����5��1-60֮���������Ϊ����Ԫ��
b.����2-10����Χ����2��10��֮��������num
c.��������arr,ɸѡ�������в���num������Ԫ�ز����
 */

    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("�������һ��1-60֮�������");
        int a = sc.nextInt();
        System.out.println("������ڶ���1-60֮�������");
        int b = sc.nextInt();
        System.out.println("�����������1-60֮�������");
        int c = sc.nextInt();
        System.out.println("��������ĸ�1-60֮�������");
        int d = sc.nextInt();
        System.out.println("����������1-60֮�������");
        int e = sc.nextInt();
        int x = r.nextInt(9) + 2;
        System.out.println("���ɵ������Ϊ:" + x);
        int[] arr=new int[5];
        arr[0]=a;
        arr[1]=b;
        arr[2]=c;
        arr[3]=d;
        arr[4]=e;

        System.out.println("����������Ԫ��Ϊ��");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] %x !=0){
                System.out.print(arr[i]+" ");

            }

        }
    }
}
