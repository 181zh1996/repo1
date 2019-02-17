package test;

public class T011 {
    public static void main(String[] args) {
        int x = 0;
        for (int i = 1000; i <= 9999; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;
            int qian = i / 1000 % 10;
            if (ge + bai == shi + qian) {
                x++;

                System.out.print(i+" ");
                for (int count = x; count <= x; count++) {
                    if (count % 5 == 0) {
                        System.out.println();

                    }
                }
            }
        }
        System.out.println("一共有"+x+"个");
    }
}
