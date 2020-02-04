package lQofficeWebsite.sort;


import util.Util;

import java.util.Arrays;

/**
 * @author Awacky
 * @date 2020/2/4 13:59
 */
//快速排序
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {7, 11, 23, 8, 2, 32, 9, 22, 11, 3};// Util.getRandomArr(6,1,100);
        // arr = new int[]{23,11,6,10,23,55};
        System.out.println("begin..." + Arrays.toString(arr));
        quickSort(arr,0,9);
        System.out.println("final..." + Arrays.toString(arr));

    }

    private static void quickSort(int[] data,int min, int max){
        if(min < max){
            int average = partition(data,min,max);
//            这个是对基准左边进行快排
            quickSort(data,min,average-1);
//            这个是对基准右边进行快排
            quickSort(data,average+1,max);
        }
    }

//    最重要的一个方法
    private static int partition(int[] data, int min, int max){
        int pivot = data[min];
        int sp = min + 1;   //扫描指针
        int bigger = max;   //右侧扫描指针
        while(sp <= bigger){
            if(data[sp] <= pivot){
//                扫描元素小于主元，左指针向右移
                sp++;
            }else {
//                扫描元素大于主元，进行交换，右指针左移动一下
                Util.swap(data,sp,bigger);
                bigger--;
            }
        }
        Util.swap(data,min,bigger);
        return bigger;
    }

}
