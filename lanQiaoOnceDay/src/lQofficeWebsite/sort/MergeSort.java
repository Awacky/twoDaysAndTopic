package lQofficeWebsite.sort;

import util.Util;

/**
 * @author Awacky
 * @date 2020/2/5 16:19
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] data = {305, 65 , 7, 90 , 120 ,110, 8};
        mergeSort(data,0,6);
        Util.print(data);

    }
    private static void mergeSort(int[] data , int min , int max){
//        这块是自己调用自己
        if(min < max){
            int mid = (min + max) / 2;
            mergeSort(data, min, mid);
            mergeSort(data, mid + 1, max);
            merge(data, min, mid, max);
        }
    }
    private static void merge(int[] data,int first, int mid, int last) {
        int[] temp = data;
        int left = first;   //左侧队伍的头部指针
        int right = mid+1;   //右侧队伍的头部指针
        int current = first;    //原素组的指针，指向待填入数据的位置

        while (left<=mid&&right<=last){
            if (temp[left]<=temp[right]){
                data[current] = temp[left];
                current++;
                left++;
            }else {
                data[current] = temp[right];
                current++;
                right++;
            }
        }
//        有两种可能情况，一种是左边完了，右边没有完，但是原数组就是那些数据，可以不用管
//        第二种，右边数据进入完了，但是左边没有，这个就要重新插入了
        while (left<=mid){
            data[current] = temp[left];
            current++;
            left++;
        }
    }
}
