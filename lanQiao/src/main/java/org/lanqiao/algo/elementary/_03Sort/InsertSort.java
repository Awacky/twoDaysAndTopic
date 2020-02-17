package org.lanqiao.algo.elementary._03Sort;

import java.util.Arrays;

/**
 * @author Awacky
 * @date 2020/2/17 21:33
 */
public class InsertSort {
    private static void insertSort(int[] arr){
        int len = arr.length;
        int temp,helper ;
        for (int i = 1;i<len;i++){
            temp = arr[i];
            helper = i - 1;
//            经典写法,helper一定是大于等于0，否则第一遍那块过不去
            while (helper >= 0 && arr[helper]>temp){
                arr[helper + 1] = arr[helper];
                helper--;
            }
            arr[helper + 1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr ={2,1,6,4,5,3};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }
static void sort(int[] arr){
    sort(arr,0,arr.length-1);
}
    static void sort(int[] arr,int left,int right){
        for (int j = 1; j<arr.length ; j++) {
            int key = arr[j];
            int i = j - 1;
            while(i>=left&&arr[i]>key){
                arr[i+1] = arr[i];
                i--;
            }
            arr[i+1] = key;
        }
    }
//    public static void main(String[] args) {
//        int[] arr = {2,1,6,4,5,3};
//        sort(arr);
//        System.out.println(Arrays.toString(arr));
//    }
}

