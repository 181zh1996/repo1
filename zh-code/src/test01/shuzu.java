package test01;

import java.util.Arrays;

public class shuzu {
    public static void main(String[] args) {
        int num = 4;
        int[] arrA = {8, 64, 3, 40, 16, 32, 6, 27};
        int[] arrReturn = getNums(arrA, num);
        Arrays.sort(arrReturn);
        for (int i = 0; i < arrReturn.length; i++) {
            System.out.print(arrReturn[i] + " ");
        }
    }


    public static int[] getNums(int[] arr, int num) {
        //����һ�������� ���������������������ж��ٸ�
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % num == 0) {
                count++;
            }
        }
        System.out.println(count);
        System.out.println("----------");
        //����һ������ �ó��� Ϊ���� count��ֵ
        int[] arrReturn = new int[count];
        //indexΪ�������������
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % num == 0) {
                // count++;
                //Ϊ��̬���鸳ֵ
                arrReturn[index] = arr[i];
                index++;
            }
        }


        return arrReturn;


    }

}
