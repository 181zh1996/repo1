package cn.day06.text;

public class TestPhone {
    public static void main(String[] args) {
      //set赋值
      /*
        Phone phone = new Phone();
        phone.setBrand("小米");
        phone.setPrice(998);
        phone.call();
        phone.send();
        phone.play();
      */

//下面是构造方法赋值
       Phone phone = new Phone("小米",998);
        phone.call();
        phone.send();
        phone.play();
    }

}
