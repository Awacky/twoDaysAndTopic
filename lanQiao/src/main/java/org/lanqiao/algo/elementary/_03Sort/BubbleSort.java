package org.lanqiao.algo.elementary._03Sort;

import org.lanqiao.algo.util.Util;

import java.util.Arrays;

/**
 * @author Awacky
 * @date 2020/2/17 14:29
 */
public class BubbleSort {
    private static int[] bublleSort(int[] arr){
        int len = arr.length-1;
        for (int i = 0;i<len;i++){
//            这块控制循环次数，应该是-i而不是-j
            for(int j =0;j<len-i;j++){
                if (j<len){
                    if (arr[j]>arr[j+1]){
                        Util.swap(arr,j,j+1);
                    }
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr ={3,5,6,12,8,6,7};
        int[] arr2 = bublleSort(arr);
        System.out.println(Arrays.toString(arr2));
    }
}
