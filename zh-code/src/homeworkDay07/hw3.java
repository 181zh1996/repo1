package homeworkDay07;

import java.util.ArrayList;

/*
1.创建一个ArrayList集合，用于存储一些字符串："abc","def","def","ghi","def","hij","jkol"
	2.遍历集合，统计集合中"def"字符串一共出现了多少个
	3.将集合中的所有"def"字符串删除。打印删除后的集合元素
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
        System.out.println("def字符串一共出现了" + count + "个");
        for (int i = (str.size()-1); i >=0; i--) {
            if (str.get(i).equals("def")) {
                str.remove(i);
            }
        }
        System.out.print("将集合中的所有def字符串删除=");
        for (int i = 0 ;i<str.size();i++){
            String num = str.get(i);
            System.out.print(num+" ");
        }
    }
}