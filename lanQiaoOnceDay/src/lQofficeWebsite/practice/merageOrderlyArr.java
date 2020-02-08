package lQofficeWebsite.practice;

import java.util.Arrays;

/**
 * @author Awacky
 * @date 2020/2/8 19:10
 */
//合并有序数组：给定两个排序后的数组A和B，其中A的末端有足够的缓冲空间容纳B，编写一个方法，将B合并入A并排序
//使用归并的思路来完成
public class merageOrderlyArr {

    public static void merge(int[] arr1,int[] arr2,int value ){
        int left = arr2.length-1;
        int right =  value-1;
        int allNumber = value+arr2.length-1;
        while (right>=0&&left>=0){
            if (arr1[right]>=arr2[left]){
                arr1[allNumber] = arr1[right];
                allNumber--;
                right--;
            }else {
                arr1[allNumber] = arr2[left];
                allNumber--;
                left--;
            }
        }
        if (left>0){
            for (int i = left;i>=0;i--){
                arr1[allNumber] = arr2[i];
                allNumber--;
            }
        }

    }

    public static void main(String[] args) {
        int[] A = new int[1000];
        int value  =10;
        for (int i = 0;i<value;i++){
            A[i] = i;
        }
        int[] B = {1,6,10,23,45,78,90,100};
        merge(A,B,value);
        System.out.println(Arrays.toString(A));

    }
}
