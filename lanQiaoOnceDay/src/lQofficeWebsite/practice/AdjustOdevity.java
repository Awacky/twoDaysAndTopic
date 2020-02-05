package lQofficeWebsite.practice;

import util.Util;

import java.util.Arrays;

/**
 * @author Awacky
 * @date 2020/2/6 7:18
 */
/*调整奇偶数,输入一个整数数组，调整数组中数字的顺序，使得所有奇数位于数组的前半部分，所有偶数位于数组的后半部分，要求时间复杂度
* O(n)*/
//使用快排
public class AdjustOdevity {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6,12,7,8,9,10};
        System.out.println(Arrays.toString(arr));
        quickSort(arr,0,arr.length-1);
        System.out.println("end");
        System.out.println(Arrays.toString(arr));

    }
    public static void quickSort(int[] data,int min,int max){
        if (min < max){
            int average = partition(data,min,max);
////            这个是对基准左边进行快排
//            quickSort(data,min,average-1);
////            这个是对基准右边进行快排
//            quickSort(data,average+1,max);
        }
    }
    public static int partition(int[] data,int min,int max){
//        左指针
        int sp = min;
//        有指针
        int bigger = max;
        while (sp <= bigger){
            if (data[sp] %2  ==0){
                Util.swap(data,sp,bigger);
                bigger--;
            }else {
                sp++;
            }
        }
        return bigger;

    }
}
