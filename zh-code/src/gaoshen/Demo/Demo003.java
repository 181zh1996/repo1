package gaoshen.Demo;

import java.util.ArrayList;
import java.util.Collections;

/*
���塰�����ࡱComputer�����ղι��졢���ι�������³�Ա������
����name��String���ͣ�
�۸�price�� double���ͣ�
����type��String���ͣ�
�������ϳ�Ա������set/get����
���������Test���������Ҫ��
�ٶ���public static ArrayList<Computer> filter(ArrayList<Computer> list, String str) {....}����:
Ҫ�󣺱�������list���������������Բ���str��β��Ԫ�ش�����һ��ArrayList<Computer> �в�����
����main�������������Ҫ��:
a.�����������ݴ�������ʼ��3��Computer����
  		{"DELL",6799,"һ���"}
{"MacAir", 7488,"��ֵ����"}
{"MIAir",4288,"�ᱡ�ʼǱ�"}
b.����һ��ArrayList<Computer> list_cp���������3��Computer������ӵ� list_cp�У�
����filter��������list_cp�͡�Air�������ݷ��ص�list����������������ԡ�Air����β������Ԫ����Ϣ
 */
public class Demo003 {
    public static void main(String[] args) {
        ArrayList<Computer> list_cp = new ArrayList<>();
        Computer com = new Computer("DELL",6799,"һ���");
        Computer com1 = new Computer("MacAir",7488,"��ֵ����");
        Computer com2 = new Computer("MIAir",4288,"�ᱡ�ʼǱ�");
        list_cp.add(com);
        list_cp.add(com1);
        list_cp.add(com2);
        ArrayList<Computer> list = filter(list_cp, "Air");
        System.out.println("���ص�list�����е�����Ԫ����Ϣ:");
        for (int i = 0; i < list.size(); i++) {
            list.get(i).show();
        }
    }
    public static ArrayList<Computer> filter(ArrayList<Computer> list, String str){
        ArrayList<Computer> filter = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().endsWith(str)){
                filter.add(list.get(i));
            }
        }
        return filter;
    }
}
