package test;

public class T014 {
    public static void main(String[] args) {
        /*int a = 56;
        boolean b = false;*/
        int[] arr = {12, 89, 35, 48, 72, 56};
      /*  for (int i = 0; i < arr.length; i++) {

            if (a == arr[i]) {
                b = true;
                break;
            }
        }
        if (b) {
            System.out.println("cunzai ");
        } else {
            System.out.println("bucunzai");
        }*/
            int temp=0;
      for (int min=0,max=arr.length-1;max>min;min++,max--) {
              temp=arr[min];
              arr[min]=arr[max];
              arr[max]=temp;
            }
         for (int i = 0; i < arr.length; i++) {
             System.out.println(arr[i]);
        }
    }

}
