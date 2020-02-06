package lQofficeWebsite.practice;

import java.util.Arrays;

/**
 * @author Awacky
 * @date 2020/2/6 15:21
 */
//数组中有一个数字出现的次数超过了数组长度的一半，找出这个数字。
//    解法一：排序后返回arr[N/1]     Nlg(N)
//   解法二：hash统计
//    解法三：顺序统计              O(n)
//    解法4,：不同的数，进行消除
public class SurpassAhalfNumber {
    static void slove1(int[] arr){
        Arrays.sort(arr);
        System.out.println(arr[arr.length>>1]);
    }

    //    解法三，求有序数组中中间那个元素
    static void slove3(int[] arr){
        int res = SelectK.selectK(arr,0,arr.length-1,arr.length>>1);
        System.out.println(res);
    }

    public static void main(String[] args) {
        int[] arr = {1,1,1,1,3,2,4};
//        slove1(arr);
        slove3(arr);
    }

}
