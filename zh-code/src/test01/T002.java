package test01;

public class T002 {
    public static void main(String[] args) {
        boolean a = abc(12,12);
        System.out.println("这两个数相同吗"+a);
    }
    public static boolean abc (int a,int b){
       /* boolean kx = a==b;
        return kx;*/
       /*boolean kx;C:\basic-code\zh-code\src\day07
       if (a==b ){
           kx=true;
       }else {
           kx=false;
       }
       return kx;
       */
       return a==b;
    }
}
