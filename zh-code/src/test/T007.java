package test;
import java.util.Scanner;
public class T007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("第一个数据");
        int x = sc.nextInt();
        System.out.println("第二个数据");
        int y = sc.nextInt();
        System.out.println("第三个数据");
        int z = sc.nextInt();
        //获取到第二大的数存放在temp中

        int temp = x < y ? x : y;
        int temp3= temp > z ?  temp : z;
        //通过比较 获得最大值 存放在 max中
        int max = temp > z ? temp : z ;
        //通过比较 获得最小值 放在mix中
        int temp2 = x < y ? x : y;
        int mix = temp2 < z ? temp2 : z;


        System.out.println(mix+" "+temp3+" "+max);

    }
}