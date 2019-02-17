package test01;

public class T006 {
    public static void main(String[] args) {
        int b = 0;
        int a = 0;
        int[] score = {80, 90, 85, 90, 78, 88, 89, 93, 98, 75};
        for (int i = 0; i < score.length; i++) {
            if (score[i] < 60) {
                b++;
            }
        }
        System.out.println("不及格的学生有" + b + "人");
        for (int i = 1; i < score.length; i++) {
            a=(score[0]+=score[i]);
        }
        System.out.println("学生总分="+a);
        System.out.println("班级平均分="+((double)a/score.length));
    }
}
