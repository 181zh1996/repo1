package day08;


import java.util.ArrayList;
import java.util.Scanner;

/*
1.����¼��һ�����ַ���,��¼��һ��С�ַ���
	2.ͳ��С�ַ����ڴ��ַ����г��ֵĴ���
	3.�������д�ӡ��ʽ:
		��������ַ���:woaiheima,heimabutongyubaima,wulunheimahaishibaima,zhaodaogongzuojiushihaoma
		������С�ַ���:heima
 */
public class hw1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("������һ�����ַ�");
        String str1 = sc.next();
        
        System.out.println("������һ��С�ַ�");
        String e = sc.next();

        String[] str = str1.split(",");
        
        int count=0;
        int index;
        
        for (int i = 0; i<str.length;i++){
            String s = str[i];
            index=s.indexOf(e);
            if(index!=-1){
                count++;
            }
        }
        System.out.println("������"+count+"��");
    }
}
