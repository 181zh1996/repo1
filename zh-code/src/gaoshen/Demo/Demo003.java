package gaoshen.Demo;

import java.util.ArrayList;
import java.util.Collections;

/*
定义“电脑类”Computer包含空参构造、满参构造和以下成员变量：
名称name（String类型）
价格price（ double类型）
类型type（String类型）
生成以上成员变量的set/get方法
定义测试类Test，完成以下要求：
①定义public static ArrayList<Computer> filter(ArrayList<Computer> list, String str) {....}方法:
要求：遍历集合list，将电脑名称是以参数str结尾的元素存入另一个ArrayList<Computer> 中并返回
②在main方法内完成以下要求:
a.根据以下内容创建并初始化3个Computer对象
  		{"DELL",6799,"一体机"}
{"MacAir", 7488,"颜值担当"}
{"MIAir",4288,"轻薄笔记本"}
b.创建一个ArrayList<Computer> list_cp，将上面的3个Computer对象添加到 list_cp中，
调用filter方法传入list_cp和“Air”，根据返回的list集合输出电脑名称以“Air”结尾的所有元素信息
 */
public class Demo003 {
    public static void main(String[] args) {
        ArrayList<Computer> list_cp = new ArrayList<>();
        Computer com = new Computer("DELL",6799,"一体机");
        Computer com1 = new Computer("MacAir",7488,"颜值担当");
        Computer com2 = new Computer("MIAir",4288,"轻薄笔记本");
        list_cp.add(com);
        list_cp.add(com1);
        list_cp.add(com2);
        ArrayList<Computer> list = filter(list_cp, "Air");
        System.out.println("返回的list集合中的所有元素信息:");
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
