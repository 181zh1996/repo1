package cn.demo;

public class test9 {
    public static void main(String[] args) {
        Phone vivo = getPhone();
        System.out.println(vivo.pingPai);
        System.out.println(vivo.jiaGE);
        System.out.println(vivo.color);
    }
    public static Phone getPhone(){
        Phone phone = new Phone();
        phone.pingPai="ŵ����";
        phone.jiaGE=100.0;
        phone.color="͸��";
        return phone;
    }
}
