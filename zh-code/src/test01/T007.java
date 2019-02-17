package test01;

import java.util.Arrays;

//定义一个int数组 数组元素内容从大到小排列
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
