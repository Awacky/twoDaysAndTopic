package org.lanqiao.algo.elementary._03Sort;

import org.lanqiao.algo.util.Util;

/**
 * @author Awacky
 * @date 2020/2/18 13:07
 */
//快排
public class QuickSort {

    public static void quickSort(int[] arr,int min,int max){
        if (max > min){
            int indexOfPartition = partition(arr,min,max);
            quickSort(arr,min,indexOfPartition-1);
            quickSort(arr,indexOfPartition+1,max);
        }
    }

    public static int partition(int[] arr,int min,int max){
//        设置基准
        int partintionElement;
        int left , right;
        int mid = min +((max - min)>>1);
        partintionElement = arr[mid];
        Util.swap(arr,min,mid);
        left = min;
        right = max;
        while (left <= right){
            if (arr[left] > partintionElement){
                Util.swap(arr,left,right);
                right--;
            }else {
                left++;
            }
        }
        Util.swap(arr,min,right);
        return right;
    }

    public static void main(String[] args) {
        int[] arr = Util.getRandomArr(10, 1, 100);
        Util.print(arr);
        quickSort(arr,0,9);
        Util.print(arr);
    }
}
