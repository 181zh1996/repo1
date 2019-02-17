package test;

public class T002 {
    public static void main(String[] args) {
 /*
 for语句打印水仙花数
    for (int i=100;i<=999;i++){
        int ge = i%10;
        int shi = i /10%10;
        int bai = i /100%10;
        if(ge*ge*ge+shi*shi*shi+bai*bai*bai==i){
            System.out.println(i);
        }
    }
 */

 /*
 while语句打印水仙花数
    int i = 100; //初始化语句
    while (i<=999){ ←判断条件语句
      循环体语句↓
        int ge = i%10;
        int shi = i /10%10;
        int bai = i /100%10;
        if(ge*ge*ge+shi*shi*shi+bai*bai*bai==i){
            System.out.println(i);
        }
        控制条件语句↓
        i++;
    }
    */

 /*
 do while语句打印水仙花
 初始化语句↓
    int i=100;
    do{
        int ge = i%10;
        int shi = i /10%10;
        int bai = i /100%10;
        if(ge*ge*ge+shi*shi*shi+bai*bai*bai==i){
            System.out.println(i);
        }
        i++;
    }while (i<=999);

    */
    }
}
