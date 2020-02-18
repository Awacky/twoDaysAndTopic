package org.lanqiao.algo.elementary._03Sort;

import org.lanqiao.algo.util.Util;

/**
 * @author Awacky
 * @date 2020/2/18 12:04
 */
//归并排序
public class MergeSort {
    private static int[] helper;
    private static void merge(int[] arr,int min,int max){
        if (max > min){
            int mid = min + ((max-min)>>1);
            merge(arr,min,mid);
            merge(arr,mid+1,max);
            mergeSort(arr,min,mid,max);
        }
    }

    private static void mergeSort(int[] arr,int min, int mid,int max){
//        拷贝到辅助空间相同的位置
        helper = Util.copy(arr);
//        辅助数组的两个指针
        int left = min;
        int right = mid+1;
//        原始数组的指针
        int current = min;
//        while(left <= mid && right <= max){
//            if (helper[left] <= helper[right]){
//                arr[current++] = helper[left++];
//            }else {
////                右边小
//                arr[current++] = helper[right++];
//            }
//        }
////        这样做完毕之后，左边指针可能没有结束，右边没有什么关系
//        while (left <= mid){
//            arr[current] = arr[left];
//            left++;
//            current++;
//        }
        while (left <= mid && right <= max) {
            if (helper[left] <= helper[right]) {
                arr[current++] = helper[left++];
            } else { //右边小
                arr[current++] = helper[right++];
            }
        }
        //  这样做完后，左边指针可能没到头;右边的没到头也没关系，想想为什么？
        while (left <= mid) {
            arr[current] = helper[left];
            current++;
            left++;
        }
    }

    public static void main(String[] args) {
        int[] arr = Util.getRandomArr(10, 1, 100);
        Util.print(arr);
        merge(arr,0,9);
        Util.print(arr);
    }

}
