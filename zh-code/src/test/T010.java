package test;
import java.util.Scanner;
public class T010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("������һ����ֵ����Χ��1-12");
        int x = sc.nextInt();

        if (x>12 || x<1){
            System.out.println("��������ȷ��ֵ");
        }else if (x>=3 && x<=5){
            System.out.println(x+"���Ǵ���");
        }else if (x>=6 && x<=8){
            System.out.println(x+"�����ļ�");
        }else if (x>=9 && x<=11){
            System.out.println(x+"�����＾");
        }else {
            System.out.println(x+"���Ƕ���");
        }
    }
}
