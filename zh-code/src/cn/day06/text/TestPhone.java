package cn.day06.text;

public class TestPhone {
    public static void main(String[] args) {
      //set��ֵ
      /*
        Phone phone = new Phone();
        phone.setBrand("С��");
        phone.setPrice(998);
        phone.call();
        phone.send();
        phone.play();
      */

//�����ǹ��췽����ֵ
       Phone phone = new Phone("С��",998);
        phone.call();
        phone.send();
        phone.play();
    }

}
