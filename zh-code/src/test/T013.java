package test;

/*
	1.����¼��ѧ���ɼ�(��������),���¼��ĳɼ�Ϊ-1��ʾ¼�����
	2.��ӡ���¼���ѧ���ɼ���ƽ��ֵ
 */
//import java.util.Scanner;
public class T013 {
    public static void main(String[] args) {
        //      Scanner sc = new Scanner(System.in);
        int[] arr = {62, 42, 78, 9765, 4, 4345, 34523, 43, 238, 69, 968, 798, 8596};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
