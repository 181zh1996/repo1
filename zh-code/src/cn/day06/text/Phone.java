package cn.day06.text;

public class Phone {
    private String brand;
    private int price;

    public Phone() {
    }

    public Phone(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public void call(){
        System.out.println("����ʹ��"+price+"Ԫ��"+brand+"�ֻ���绰");
    }
    public void send(){
        System.out.println("����ʹ��"+price+"Ԫ��"+brand+"�ֻ�������");
    }
    public void play(){
        System.out.println("����ʹ��"+price+"Ԫ��"+brand+"�ֻ�����Ϸ");
    }
}
