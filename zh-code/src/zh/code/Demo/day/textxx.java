package zh.code.Demo.day;
//����¼����ϰ
import java.util.Scanner;
public class textxx{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("����������");
        int row=sc.nextInt();
        System.out.println("����������");
        int column=sc.nextInt();

        print(row,column);
    }

    public static void print(int a,int b) {
        for(int i=1;i<=a;i++){
            for(int j=1;j<=b;j++){
                System.out.print("*");
            }
            System.out.println( );
        }
        return;
    }
}
