package zh.code.Demo.day;
//��1-100�ĺ�
public class textsum {
    public static void main(String[] args) {

        int sum=0;
        for(int i=1;i<=100;i++){
         //   if (i %2==0) {
                sum += i;
       //     }
        }
        System.out.println("��for�����1-100�ĺ�"+sum);

        int j=1;
        int a=0;
        while (j<=100){
            if (j %2==0) {
                a += j;
            }
            j++;
        }
        System.out.println("��while�����1-100�ĺ�"+a);
        int x =1;
        int y =0;
        do{
            if (x%2==0) {
                y += x;
            }
            x++;
        }while (x<=100);
        System.out.println("��do while�����1-100�ĺ�"+y);

    }
}
