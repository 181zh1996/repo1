package day08;

public class t01 {
    public static void main(String[] args) {
        String str = "wo ai java,ni ai ma?";

        char[] ch = str.toCharArray();

        for (int i = 0; i < ch.length; i++) {

            if((ch[i]+"").equals("java")){

                System.out.println(ch[i]);

            }

        }
    }
}
