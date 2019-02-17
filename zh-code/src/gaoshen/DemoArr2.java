package gaoshen;
//静态初始化（指定内容）不直接指定数据个数多少，直接将具体的数据内容进行指定
//格式  数据类型[] = new 数据类型[] ｛元素1，元素2，元素3……｝；
public class DemoArr2 {
    public static void main(String[] args) {
    //直接创建一个数组，里面装的int数 数为 5，10，15，20
        int [] arr = new int[] {5,10,15,20};
       //简约格式
        int [] arr01 = {5,10,15,20};
        //标准格式拆分两个步骤， 简约格式不能
        int [] arr001;
        arr001 = new int[] {5,10,15,20};
    //直接创建一个数组，里面装的字符串，为"Hello","World","java"
        String [] arr2 = new String[] {"Hello","World","java"};
        //简约格式
        String [] arr02 = {"Hello","World","java"};
    }
}
