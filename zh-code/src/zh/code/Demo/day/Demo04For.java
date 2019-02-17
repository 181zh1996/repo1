package zh.code.Demo.day;

public class Demo04For {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            System.out.println("控制台输出1-10——————-"+i);
        }for(int j=10;j>=1;j--){
            System.out.println("控制台输出10-1——————-"+j);
        }
        int num=0;
        for(int i=1;i<=10;i++){
            num=num+i;
        }
        System.out.println("1-10的和为"+num);
        int num1=0;
        int num2=0;
        for(int i=1;i<=100;i++){
            if(i %2 == 0){
                num1=num1+i;
            }else if(i %2 != 0){
                num2=num2+i;
            }

        }
        System.out.println("1-100奇数和为"+num2);
        System.out.println("1-100偶数和为"+num1);
    }

}
