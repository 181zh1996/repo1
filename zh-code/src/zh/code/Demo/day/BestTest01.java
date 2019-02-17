package zh.code.Demo.day;

public class BestTest01 {
    public static void main(String[] args) {
        int [] arr = new int[100];
        for(int i=0;i<=99;i++){
            arr [i] = (i+1);
            System.out.println(arr[i]);
            for (int num1=1;i<=100;i++){
                if (num1 %num1 ==0 && num1 %arr[i] !=0){
                    System.out.println(num1);
                }
            }

        }

    }
}
