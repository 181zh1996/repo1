package test;
/*
1.����������ģ����������ܣ��Լ���¼�������int���͵����ݽ��мӡ������ˡ��������㣬����ӡ������
	2.Ҫ��
		(1)����¼����������,����ǰ������������μ���������ݣ�
			����������ΪҪ���е�����(0:��ʾ�ӷ�����,1:��ʾ��������,2:��ʾ�˷�����,3:��ʾ��������)
		(2)ʹ�ý�����ѧ֪ʶ��ɹ���
		(3)��ʾ��ʽ����:
			�������һ������:30
			������ڶ�������:40
			��������Ҫ���е�����(0:��ʾ�ӷ�����,1:��ʾ��������,2:��ʾ�˷�����,3:��ʾ��������):0
			����̨���:30+40=70
 */
import java.util.Scanner;
public class T009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("��һ������");
        int x = sc.nextInt();
        System.out.println("�ڶ�������");
        int y = sc.nextInt();
        System.out.println("����������,��Χ��0-3֮��");
        int z = sc.nextInt();
        if(z == 0  ){
            System.out.println(x+"+"+y+"="+(x+y));
        }else if (z==1){
            System.out.println(x+"-"+y+"="+(x-y));
        }else if (z == 2){
            System.out.println(x+"*"+y+"="+(x*y));
        }else if (z == 3){
            System.out.println(x+"/"+y+"="+(x/y));
        }else {
            System.out.println("���������ֵ��������������");
        }
    }
}
