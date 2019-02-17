package test;

/*
	1.键盘录入学生成绩(整数类型),如果录入的成绩为-1表示录入结束
	2.打印输出录入的学生成绩的平均值
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
