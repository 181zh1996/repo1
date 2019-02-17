package test01;

public class T008 {
    public static void main(String[] args) {
        int[] arr={11,23,45,15,65,123,22,33,10,8};
        getNewArr(arr);
    }
    public static void getNewArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==15){
                arr[i]=998;
            }
            System.out.print(arr[i]+" ");
        }
    }
}
