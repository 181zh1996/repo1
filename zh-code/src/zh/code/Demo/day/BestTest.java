package zh.code.Demo.day;
/*
输出一到一百 不包括9的数字


 */
public class  BestTest{
    public static void main(String[] args) {
        int x = 0;
        for (int i = 1; i <= 100; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;
            if (ge != 9 && shi != 9 && bai != 9) {
                System.out.print(i + " ");
                x++;
            }
            if (x % 5 == 0) {
                System.out.println();
                }
            }
        }
    }

