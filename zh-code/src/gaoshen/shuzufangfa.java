package gaoshen;

public class shuzufangfa {
    public static void main(String[] args) {
        int[] arr = {12, 13, 41, 51, 25, 65, 213, 21};
        printArr(arr);

    }

    public static void printArr(int[] arrA) {
        for (int i = 0; i < arrA.length; i++) {
            System.out.println(arrA[i]);
        }
    }

    public static int printArrA() {
        int[] arrA = {12, 5, 68, 6, 45, 34, 8, 99, 603, 239};
        int max = arrA[0];
        for (int i = 1; i < arrA.length; i++) {
            if (arrA[i] > max) {
                max = arrA[i];
            }
        }
        System.out.println(max);
            return max;
    }
}
