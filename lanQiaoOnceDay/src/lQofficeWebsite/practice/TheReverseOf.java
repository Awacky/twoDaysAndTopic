package lQofficeWebsite.practice;

import util.Util;

/**
 * @author Awacky
 * @date 2020/2/9 15:56
 */
//求逆序对的个数
//    逆序对：就是左边比右边大的个数
//    使用算法，只要抓右侧的数，那么就有逆序对
//    精华部分就是抓右侧，如果左边大于右边，那么左边往下面都大于右边。
public class TheReverseOf {
    public static void merge(int[] arr, int min,int max){
        if (min < max){
            int mind = min + ((max-min)>>1);
            merge(arr,min,mind);
            merge(arr,mind+1,max);
            merage(arr,mind,min,max);

        }
    }
    static int reverse = 0;

    public static void merage(int[] arr,int mid,int min ,int max){
        int[] temp = Util.copy(arr,arr.length);
        int left = min;
        int right = mid+1;
        int current = min;      //原数组中，指向要填入数据的位置
        while (left<=mid&&right<=max){
            if (temp[left] >= temp[right]){
                arr[current] = temp[right];
                current++;
                right++;
                reverse += (mid-left+1); //  有多少对逆序数
            }else {
                arr[current] = temp[left];
                current++;
                left++;
            }
        }
        while (left<=mid){
            arr[current] = temp[left];
            current++;
            left++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {37,40,48,90,32,5,12,3,44,13};
        merge(arr,0,9);
        System.out.println(reverse);
    }
}
