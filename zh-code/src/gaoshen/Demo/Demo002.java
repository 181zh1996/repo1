package gaoshen.Demo;
/*
�ٶ��巽��filter
Ҫ�����£�
�βΣ�String [] arr��String  str
����ֵ���ͣ�String []
ʵ�֣�����arr�����������Բ���str��ͷ��Ԫ�ش�����һ��String �����в�����
PS�����ص����鳤����Ҫ�ô����ȡ
����main�������������Ҫ��
����һ��String����arr������Ԫ���У�"itcast","itheima","baitdu","weixin","zhifubao"
����filter��������arr������ַ�����it����������ص�String����������Ԫ��
 */
public class Demo002 {
    public static void main(String[] args) {
        String[] arr= new String[]{"itcast","itheima","baitdu","weixin","zhifubao"};
        String[] arr1 =filter(arr,"it");
        System.out.println("���ص�����������Ԫ�أ�");
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
