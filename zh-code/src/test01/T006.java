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
        System.out.println("�������ѧ����" + b + "��");
        for (int i = 1; i < score.length; i++) {
            a=(score[0]+=score[i]);
        }
        System.out.println("ѧ���ܷ�="+a);
        System.out.println("�༶ƽ����="+((double)a/score.length));
    }
}
