package homeworkDay07;

import java.util.ArrayList;

/*
1.����һ��ArrayList���ϣ����ڴ洢һЩ�ַ�����"abc","def","def","ghi","def","hij","jkol"
	2.�������ϣ�ͳ�Ƽ�����"def"�ַ���һ�������˶��ٸ�
	3.�������е�����"def"�ַ���ɾ������ӡɾ����ļ���Ԫ��
 */
public class hw3 {
    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>();
        str.add("abc");
        str.add("def");
        str.add("def");
        str.add("ghi");
        str.add("def");
        str.add("hij");
        str.add("jkol");

        int count = 0;
        for (int i = 0; i < str.size(); i++) {
            if (str.get(i).equals("def")) {
                count++;
            }
        }
        System.out.println("def�ַ���һ��������" + count + "��");
        for (int i = (str.size()-1); i >=0; i--) {
            if (str.get(i).equals("def")) {
                str.remove(i);
            }
        }
        System.out.print("�������е�����def�ַ���ɾ��=");
        for (int i = 0 ;i<str.size();i++){
            String num = str.get(i);
            System.out.print(num+" ");
        }
    }
}