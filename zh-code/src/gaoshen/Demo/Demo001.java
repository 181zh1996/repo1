package gaoshen.Demo;

import java.util.Random;
import java.util.Scanner;

public class Demo001 {/*
按要求在main方法中完成以下功能：
a.定义一个长度为5的int型数组arr，提示用户输入5个1-60之间的数字作为数组元素
b.生成2-10（范围包含2和10）之间的随机数num
c.遍历数组arr,筛选出数组中不是num倍数的元素并输出
 */

    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个1-60之间的数字");
        int a = sc.nextInt();
        System.out.println("请输入第二个1-60之间的数字");
        int b = sc.nextInt();
        System.out.println("请输入第三个1-60之间的数字");
        int c = sc.nextInt();
        System.out.println("请输入第四个1-60之间的数字");
        int d = sc.nextInt();
        System.out.println("请输入第五个1-60之间的数字");
        int e = sc.nextInt();
        int x = r.nextInt(9) + 2;
        System.out.println("生成的随机数为:" + x);
        int[] arr=new int[5];
        arr[0]=a;
        arr[1]=b;
        arr[2]=c;
        arr[3]=d;
        arr[4]=e;

        System.out.println("符合条件的元素为：");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] %x !=0){
                System.out.print(arr[i]+" ");

            }

        }
    }
}
