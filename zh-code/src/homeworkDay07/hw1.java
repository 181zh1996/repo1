package homeworkDay07;

import java.util.Random;
import java.util.Scanner;

/*
1.ͨ������¼��һ�����֣���Ϊ����ĳ���
	2.����¼������֣�����һ������Ϊ�����ֵ�����
	3.ͨ�������Ϊ�����е�ÿ��Ԫ�ؽ��и�ֵ��������ķ�Χ��1-100֮��
	4.����������������
	5.��������е�����ƽ��ֵ
 */
public class hw1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        while (true) {
            System.out.println("������һ�������������鳤��");
            int i = sc.nextInt();
            //ͨ�������Ϊ�����е�ÿ��Ԫ�ؽ��и�ֵ��������ķ�Χ��1-100֮��
            if (i > 0) {
                int[] arr = new int[i];
                for (int a = 0; a < arr.length; a++) {
                    arr[a] = r.nextInt(100) + 1;
                }
                //����������������
                int max = arr[0];
                for (int a = 0; a < arr.length; a++) {
                    if (max < arr[a]) {
                        max = arr[a];
                    }
                }
                System.out.println("���������������" + max);
                //��������е�����ƽ��ֵ
                double x = 0;
                for (int a = 0; a < arr.length; a++) {
                    x += arr[a];
                }
                System.out.println("����������ƽ��ֵ��" + (x / i));
                break;
            } else {
                System.out.println("���������������!!!!!");

            }
        }
    }
}