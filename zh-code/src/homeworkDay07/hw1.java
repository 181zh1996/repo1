package homeworkDay07;

import java.util.Random;
import java.util.Scanner;

/*
1.通过键盘录入一个数字，作为数组的长度
	2.根据录入的数字，创建一个长度为该数字的数组
	3.通过随机数为数组中的每个元素进行赋值。随机数的范围在1-100之间
	4.求出数组中最大数字
	5.求出数组中的数字平均值
 */
public class hw1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        while (true) {
            System.out.println("请输入一个数，定义数组长度");
            int i = sc.nextInt();
            //通过随机数为数组中的每个元素进行赋值。随机数的范围在1-100之间
            if (i > 0) {
                int[] arr = new int[i];
                for (int a = 0; a < arr.length; a++) {
                    arr[a] = r.nextInt(100) + 1;
                }
                //求出数组中最大数字
                int max = arr[0];
                for (int a = 0; a < arr.length; a++) {
                    if (max < arr[a]) {
                        max = arr[a];
                    }
                }
                System.out.println("数组中最大数字是" + max);
                //求出数组中的数字平均值
                double x = 0;
                for (int a = 0; a < arr.length; a++) {
                    x += arr[a];
                }
                System.out.println("数组中数字平均值是" + (x / i));
                break;
            } else {
                System.out.println("你输入的数据有误!!!!!");

            }
        }
    }
}