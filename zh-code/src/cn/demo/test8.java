package cn.demo;

public class test8 {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.pingPai="С��";
        phone.jiaGE=1299.98;
        phone.color="ʺ��ɫ";
        method(phone);
    }
    public static void method(Phone vivo){
        System.out.println(vivo.jiaGE);
        System.out.println(vivo.pingPai);
        System.out.println(vivo.color);
    }
}
