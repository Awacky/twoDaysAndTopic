package org.lanqiao.algo.elementary._03Sort;

import org.lanqiao.algo.util.Util;

import java.util.Arrays;

/**
 * @author Awacky
 * @date 2020/2/17 20:55
 */
public class SelectSort {
    private static void selectSort(int[] arr){
        int len = arr.length;
        int helper = 0;
        int temp;
        for (int i = 0;i < len;i++){
//            每次从第i个开始找
            temp = arr[i];
            helper = i;
//            每次我都是设置这块循环条件有错误。
            for (int j =i+1;j<len;j++){
                if (temp>arr[j]){
                    temp = arr[j];
                    helper = j;
                }
            }
            Util.swap(arr,i,helper);
        }
    }

    public static void main(String[] args) {
        int[] arr ={3,5,6,12,8,6,7};
        selectSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
