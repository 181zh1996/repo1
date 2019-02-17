package test;

public class T003 {
    public static void main(String[] args) {
    /*
    for 语句输出星星
        for (int i=1;i<=4;i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
      */
        int i =1;
        int j =1;
        while (i<=4){
            while (j<=i){
                System.out.print("*");


                j++;
            }
            System.out.println();
            i++;
        }
    }
}
