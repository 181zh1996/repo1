package gaoshen;

public class fanzhuan {
    public static void main(String[] args) {
        int [] arr={11,22,33,44,55};
        print(arr);
    }
    public static void reveseArray(int[] arr){
        for (int i=0;i<arr.length/2;i++){

            int temp = arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;

        }
    }
    public static  void print(int[] arr){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
