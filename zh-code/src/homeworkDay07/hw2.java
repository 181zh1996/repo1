package homeworkDay07;

import java.util.ArrayList;
import java.util.Scanner;

/*
1.����һ��ArrayList���ϣ����ڴ洢һЩ�ַ���
	2.ͨ������¼��5���ַ��������浽������
	3.�������ϣ���ӡÿһ���ַ���
 */
public class hw2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        System.out.println("��������������ַ���");
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();
        String d = sc.next();
        String e = sc.next();

        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        list.add(e);

        for (int i = 0; i<list.size();i++){
            String str=list.get(i);
            System.out.println(str);
        }
    }
}
