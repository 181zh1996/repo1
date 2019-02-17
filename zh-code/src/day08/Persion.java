package day08;

public class Persion {
    String name;
    static String namestatic;

    public void setName(){
        System.out.println("123123");

    }
    public static void setNamestatic(){
        Persion.setNamestatic();
    }
}
