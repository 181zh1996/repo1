package zh.code.Demo.day;

public class Demo05For {
    public static void main(String[] args) {
        for(int i=100;i<=999;i++){
            int ge=i%10;
            int shi=i/10%10;
            int bai=i/100%10;
            if(ge*ge*ge+shi*shi*shi+bai*bai*bai == i){
                System.out.println("水仙花数为"+i);
            }
        }
    }
}
