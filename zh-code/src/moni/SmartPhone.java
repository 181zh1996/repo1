package moni;

public class SmartPhone extends Phone implements PlayGame {

    public SmartPhone() {
    }

    public SmartPhone(String brand, int price) {
        super(brand, price);
    }

    @Override
    public void playGame() {
        System.out.println("��ʹ��"+super.getPrice()+"Ԫ"+super.getBrand()+"�ֻ�����Ϸ");
    }
}

