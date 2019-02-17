package test01;

import java.util.Arrays;

public class shuzu {
    public static void main(String[] args) {
        int num = 4;
        int[] arrA = {8, 64, 3, 40, 16, 32, 6, 27};
        int[] arrReturn = getNums(arrA, num);
        Arrays.sort(arrReturn);
        for (int i = 0; i < arrReturn.length; i++) {
            System.out.print(arrReturn[i] + " ");
        }
    }


    public static int[] getNums(int[] arr, int num) {
        //定义一个计数器 记下其中满足条件的数有多少个
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % num == 0) {
                count++;
            }
        }
        System.out.println(count);
        System.out.println("----------");
        //建立一个数组 让长度 为上面 count的值
        int[] arrReturn = new int[count];
        //index为数组索引的序号
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % num == 0) {
                // count++;
                //为动态数组赋值
                arrReturn[index] = arr[i];
                index++;
            }
        }


        return arrReturn;


    }

}
