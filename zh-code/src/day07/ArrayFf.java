package day07;

import java.util.ArrayList;

public class ArrayFf {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("��");
        list.add("Ŷ");
        list.add("��");
        list.add("��");
        print(list);
    }
    public static void print(ArrayList<String> list){
        for (int i = 0;i<list.size();i++){
            String str=list.get(i);
            System.out.print(str+"��ˬ ");
        }
    }
}
