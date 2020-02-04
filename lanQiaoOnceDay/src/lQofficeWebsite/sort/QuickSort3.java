package lQofficeWebsite.sort;

import util.Util;

import java.util.Arrays;

/**
 * @author Awacky
 * @date 2020/2/4 20:51
 */
//三指针的快排，进行四分区
//    融合单向扫描法
public class QuickSort3 {
    public static void main(String[] args) {
        int[] arr = {7, 11, 23, 8, 2, 7, 32, 9, 22, 11, 3};// Util.getRandomArr(6,1,100);
        // arr = new int[]{23,11,6,10,23,55};
        System.out.println("begin..." + Arrays.toString(arr));
        quickSort(arr,0,10);
        System.out.println("final..." + Arrays.toString(arr));

    }

    private static void quickSort(int[] data,int min, int max){
        if(min < max){
            int average = partition3(data,min,max);
//            这个是对基准左边进行快排
            quickSort(data,min,average-1);
//            这个是对基准右边进行快排
            quickSort(data,average+1,max);
        }
    }
    public static int partition3(int[] arr,int min,int max){
        int pivoid = arr[min];
        int sp = min+1;
        int ep = sp;
        int bigger = max;
        while (sp <= bigger){
            if (arr[sp]<pivoid){
//                如果扫描指针小于主元，sp++
                Util.swap(arr,ep,sp);
                ep++;
                sp++;
            }else if (arr[sp] == pivoid){
                sp++;
            }else {
                Util.swap(arr,sp,bigger);
                bigger--;
            }
        }
        Util.swap(arr,min,bigger);
        return bigger;
    }
}
