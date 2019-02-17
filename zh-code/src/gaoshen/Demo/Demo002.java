package gaoshen.Demo;
/*
①定义方法filter
要求如下：
形参：String [] arr，String  str
返回值类型：String []
实现：遍历arr，将数组中以参数str开头的元素存入另一个String 数组中并返回
PS：返回的数组长度需要用代码获取
②在main方法中完成以下要求：
定义一个String数组arr，数组元素有："itcast","itheima","baitdu","weixin","zhifubao"
调用filter方法传入arr数组和字符串”it”，输出返回的String数组中所有元素
 */
public class Demo002 {
    public static void main(String[] args) {
        String[] arr= new String[]{"itcast","itheima","baitdu","weixin","zhifubao"};
        String[] arr1 =filter(arr,"it");
        System.out.println("返回的数组中所有元素：");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+" ");
        }
    }

    public static String[] filter(String[]arr,String str){
        //String[] string=new String[]{};
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].substring(0,2).equals(str) ){
                //System.out.println(arr[i]);
                count++;
               }
        }
        int index=0;
        String[] string=new String[count];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].substring(0,2).equals(str) ){
                string[index]=arr[i];
                index++;
            }
        }

        return string;
    }
}
