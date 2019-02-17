package moni;

public class SmartPhone extends Phone implements PlayGame {

    public SmartPhone() {
    }

    public SmartPhone(String brand, int price) {
        super(brand, price);
    }

    @Override
    public void playGame() {
        System.out.println("在使用"+super.getPrice()+"元"+super.getBrand()+"手机玩游戏");
    }
}

