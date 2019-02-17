package moni;

public class Pad implements PlayGame {
    private String brand;
    private int price;

    public Pad() {
    }

    public Pad(String brand, int price) {
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

    @Override
    public void playGame() {
        System.out.println("��ʹ��"+price+"Ԫ��"+brand+"����Ϸ");
    }
    public void listenMusic(){
        System.out.println("��ʹ��"+price+"Ԫ��"+brand+"������");
    }
}
