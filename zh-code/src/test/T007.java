package test;
import java.util.Scanner;
public class T007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("��һ������");
        int x = sc.nextInt();
        System.out.println("�ڶ�������");
        int y = sc.nextInt();
        System.out.println("����������");
        int z = sc.nextInt();
        //��ȡ���ڶ�����������temp��

        int temp = x < y ? x : y;
        int temp3= temp > z ?  temp : z;
        //ͨ���Ƚ� ������ֵ ����� max��
        int max = temp > z ? temp : z ;
        //ͨ���Ƚ� �����Сֵ ����mix��
        int temp2 = x < y ? x : y;
        int mix = temp2 < z ? temp2 : z;


        System.out.println(mix+" "+temp3+" "+max);

    }
}