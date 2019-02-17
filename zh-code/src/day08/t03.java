package day08;

import java.util.Arrays;

public class t03 {
    public static void main(String[] args) {
       /* int[] arr={1,56,3,123,53,75,34,22,21};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));*/
       String st = "asdh931hghdg9a0WERJNGAH";
        char[] cr = st.toCharArray();
        Arrays.sort(cr);

        for (int i = cr.length - 1; i >= 0; i--) {
            System.out.print(cr[i]);
        }
    }
}
