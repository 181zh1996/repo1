package cn.day06.zixi1;

public class TestText {
    public static void main(String[] args) {
        int[] arr = {11, 12, 13, 15, 11, 14, 13, 15, 19, 18, 17, 17};
        int Index = getIndex(17, arr);

        System.out.println(Index);

        if (Index == -1) {
            System.out.println("在数组中不存在");
        } else {
            System.out.println("在数组中的索引为=" + Index);
        }
    }

    public static int getIndex(int num, int[] arr) {
        int a=-1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                a=i;
            }

        }
        return a;

    }
}