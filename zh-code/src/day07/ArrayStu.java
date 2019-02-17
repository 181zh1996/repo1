package day07;

import java.util.ArrayList;

public class ArrayStu {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student stu = new Student("°¢Éª¶«",23);
        Student stu1 = new Student("°¢Ë¹¶Ù",25);
        Student stu2 = new Student("°¢ÈøµÂ",12);
        Student stu3 = new Student("°¢Ê²¶Ù",65);

        list.add(stu);
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        for(int i = 0 ; i< list.size();i++){
            Student str=list.get(i);
            System.out.println("ĞÕÃû"+str.getName()+"Äê¼Í"+str.getAge());
        }
    }
}
