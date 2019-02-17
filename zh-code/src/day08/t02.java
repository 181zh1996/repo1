package day08;

public class t02 {
    public static void main(String[] args) {
        String em="zhangsan@163.com";
        int a = em.indexOf("@");
        int b = em.indexOf(".");

        String sub = em.substring(a + 1, b);
        System.out.println(sub);
    }
}
