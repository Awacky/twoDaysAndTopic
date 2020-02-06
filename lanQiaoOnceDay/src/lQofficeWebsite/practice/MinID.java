package lQofficeWebsite.practice;

/**
 * @author Awacky
 * @date 2020/2/6 19:54
 */
//最小可用ID 在非负数数组（乱序）中找到最小的可分配id(从1开始编号)，数据量1000000
//    题目意思就是：这个顺序中，少哪个是最小的，哪个就是最小可用id
//    方法一：开辟辅助空间，辅助数组的下标是有意义的。
public class MinID {
    public static int minID(int[] arr){
        int[] temp = new int[arr.length+1];
        for (int i =0;i<arr.length;i++){
            if (arr[i]<= arr.length){
                temp[arr[i]]=1;
            }
        }
        for (int i = 1;i <= arr.length;i++){
            if (temp[i]==0){
                return i;
            }
        }
        return arr.length+1;
    }

//    解决办法二，使用快排，如果第50个元素对应的是50，则前面就很正常那么就在左侧

    public static void main(String[] args) {
        int[] arr = { 1,2,3,4,5,6,7,8,9,10};
        System.out.println(minID(arr));
    }

}
