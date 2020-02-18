package org.lanqiao.algo.elementary._03Sort;

import org.lanqiao.algo.util.Util;

import java.util.Arrays;

/**
 * @author Awacky
 * @date 2020/2/18 21:19
 */
public class CountSort {
    private static void countSort(int[] arr){
        int[] helper = new int[Util.maxOf(arr)+1];
        for (int e : arr){
            helper[e]++;
        }
//        根据计的数回填位置
        int current = 0;
        for (int i = 0 ;i < helper.length;i++){
            while (true){
                if (helper[i]!=0){
                    arr[current] = i;
                    current++;
                    break;
                }
                break;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {2,1,73,93,43,14,1,65,28,39};
        countSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
