package AUniquePairOfNumber;
//异或运算的特点  二进制进行运算，相同为0，不相同为1；
//111-->7
//101-->5
//010-->2
/**
 * @author Awacky
 * @date 2020/1/14 19:16
 */
//题目描述，1001个数，找出1-1000，找出重复的数据,在不使用临时空间的情况下
public class Main {
    public static void main(String[] args) {
        int N = 11;
        int[] arr = {1,2,3,4,5,7,7,8,9,10,6};
//        int[] arr = new int[N];
////        构建一个新的数组，最后一个是随机变量
//        for (int i =0;i<N-1;i++){
//            arr[i] = i;
//        }
//        int index = new Random().nextInt(N);
//        arr[N-1] = index;
////        打印数组
//        for (int i: arr) {
//            System.out.print(i);
//        }
//       处理重复值
        int X1 = 0;
        for (int i = 1;i<=N-1;i++){
            X1 = (X1^i);
        }
        for (int i =0 ;i<N;i++){
            X1 = (X1^arr[i]);
        }
        System.out.println(X1);
    }

}
