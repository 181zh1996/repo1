package test01;

/*
	1.定义方法，求出两个整数的和
    2.调用方法，输出结果
*/
public class T001 {
    public static void main(String[] args) {
        int c = getSum(22, 11);
        System.out.println(c);
    }

    /*public static void getSum() {
        int sum1=10;
        int sum2=20;
        int result=sum1+sum2;
        System.out.println(result);
    }*/
  /*  public static void getSum(int a,int b) {
        int result=a+b;
        System.out.println(result);*/
    public static int getSum(int a, int b) {
        int result = a + b;
        return result;
    }
}


