package test01;

import java.util.Arrays;

//����һ��int���� ����Ԫ�����ݴӴ�С����
public class T007 {
    public static void main(String[] args) {
        int[] arr = {13, 20, 33, 24, 57, 76, 97, 81};
        Arrays.sort(arr);
        for (int min = 0, max = arr.length - 1; max > min; min++, max--) {
            int temp = arr[min];
            arr[min] = arr[max];
            arr[max] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
