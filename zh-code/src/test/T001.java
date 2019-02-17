package test;

public class T001 {
    public static void main(String[] args) {
           print();
    }
    public static void print(){
        for (int i=1;i<=8;i++){
            for (int j=1;j<=6;j++){
                System.out.print("*");
            }
            System.out.println( );
        }
    }
}
