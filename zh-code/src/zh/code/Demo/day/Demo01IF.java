package zh.code.Demo.day;

public class Demo01IF {
    public static void main(String[] args) {
        int x=10;
        int y;
        if(x >= 3){
            y=2 * x + 1;
        }else if(x > -1 && x < 3){
            y=2 * x;
        }else {
            y=2* x -1;
        }
        System.out.println("y="+y);
    }
}
