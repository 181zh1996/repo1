package zh.code.Demo.day;

public class Demo04For {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            System.out.println("����̨���1-10������������-"+i);
        }for(int j=10;j>=1;j--){
            System.out.println("����̨���10-1������������-"+j);
        }
        int num=0;
        for(int i=1;i<=10;i++){
            num=num+i;
        }
        System.out.println("1-10�ĺ�Ϊ"+num);
        int num1=0;
        int num2=0;
        for(int i=1;i<=100;i++){
            if(i %2 == 0){
                num1=num1+i;
            }else if(i %2 != 0){
                num2=num2+i;
            }

        }
        System.out.println("1-100������Ϊ"+num2);
        System.out.println("1-100ż����Ϊ"+num1);
    }

}
