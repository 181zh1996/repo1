package cn.demo;

public class test7 {
    public static void main(String[] args) {
        Phone phone=new Phone();

        phone.pingPai="小米？？？？";
        phone.color="可能是绿色吧";
        phone.jiaGE=566.5;
        System.out.println(phone.pingPai);
        System.out.println(phone.color);
        System.out.println(phone.jiaGE);

        phone.call("hee");
        phone.fa();
        phone.neirong();
    }
}
