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
        System.out.println("在使用"+price+"元的"+brand+"玩游戏");
    }
    public void listenMusic(){
        System.out.println("在使用"+price+"元的"+brand+"听音乐");
    }
}
