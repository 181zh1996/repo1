package test;
import java.util.Scanner;
public class T006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("���������Ĺ���");
        int x = sc.nextInt();
        System.out.println("���������Ļ�������");
        int y = sc.nextInt();
        if (x >= 10 && x < 15) {
            System.out.println("��Ŀǰ������" + x + "�꣬��������Ϊ" + y+"Ԫ,Ӧ�ǹ���5000Ԫ,�Ǻ���" + (y + 5000) + "Ԫ");
        } else if (x >= 5 && x < 10) {
            System.out.println("��Ŀǰ������" + x + "�꣬��������Ϊ" + y+"Ԫ,Ӧ�ǹ���2500Ԫ,�Ǻ���" + (y + 2500) + "Ԫ");
        }else if (x >= 3 && x<5){
            System.out.println("��Ŀǰ������" + x + "�꣬��������Ϊ" + y+"Ԫ,Ӧ�ǹ���1000Ԫ,�Ǻ���" + (y + 1000) + "Ԫ");
        }else if (x >= 1 && x<3){
            System.out.println("��Ŀǰ������" + x + "�꣬��������Ϊ" + y+"Ԫ,Ӧ�ǹ���500Ԫ,�Ǻ���" + (y + 500) + "Ԫ");
        }else if (x >= 0 && x<1){
            System.out.println("��Ŀǰ������" + x + "�꣬��������Ϊ" + y+"Ԫ,Ӧ�ǹ���200Ԫ,�Ǻ���" + (y + 200) + "Ԫ");
        }else {
            System.out.println("���������������");
        }
    }
}


