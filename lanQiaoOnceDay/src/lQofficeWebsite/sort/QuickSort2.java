package lQofficeWebsite.sort;

import util.Util;

import java.util.Arrays;

/**
 * @author Awacky
 * @date 2020/2/4 19:19
 */
//双向扫描法
//    快速排序，第一遍排序就是给基准进行定位，然后再对基准左右两边进行排序
public class QuickSort2 {
    public static void main(String[] args) {
        int[] arr = {7, 11, 23, 8, 2, 32, 9, 22, 11, 3};// Util.getRandomArr(6,1,100);
        // arr = new int[]{23,11,6,10,23,55};
        System.out.println("begin..." + Arrays.toString(arr));
        quickSort(arr,0,9);
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

    private static int partition2(int[] arr,int min,int max){
        int pivot = arr[min];
        int left = min + 1;
        int right = max;
        while (left <= right){
            while (left <= right && arr[left] <= pivot)left++;
            while (left <= right && arr[right] > pivot)right--;
            if (left<right){

                Util.swap(arr,left,right);
            }
        }
        Util.swap(arr,min,right);
        return right;
    }

//    进行优化，三点中值法
//    优化，在mid,min,max之间取中间值做主元
    private static int partition3(int[] arr,int min,int max){
        int midIndex = min+((max-min)>>1);  //        中间位置
        int midValueIndex = -1;     //  中值得下标
        if (arr[min] <= arr[midIndex] && arr[min] < arr[max]) {
            midValueIndex = min;
        }else if (arr[max]<=arr[midIndex]&&arr[max]>=arr[min]){
            midValueIndex = max;
        }else {
            midValueIndex = midIndex;
        }
//        交换两个值，让数组第一个数是中间那个值
        Util.swap(arr,min,midValueIndex);
        int pivot = arr[min];
        int left = min + 1;
        int right = max;
        while (left <= right){
            while (left <= right && arr[left] <= pivot)left++;
            while (left <= right && arr[right] > pivot)right--;
            if (left<right){

                Util.swap(arr,left,right);
            }
        }
        Util.swap(arr,min,right);
        return right;
    }
}
