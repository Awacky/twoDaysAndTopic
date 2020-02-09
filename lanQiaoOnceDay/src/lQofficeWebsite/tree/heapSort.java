package lQofficeWebsite.tree;

import util.Util;

import java.util.Arrays;

/**
 * @author Awacky
 * @date 2020/2/9 20:49
 */
//小顶堆
//初次接触，一个比较好的数据结构，当前测试的是小顶堆
public class heapSort {
    public static void MinHeap(int[] A){
        int n = A.length;
        for (int i = ((n/2)-1);i>=0;i--){
            MinHeapFixDown(A,i,n);
        }
    }
    public static void MinHeapFixDown(int[] A,int i ,int n){
//        找到左右孩子
        int left = 2*i+1;
        int right = 2*i+2;
//        如果左边孩子已经越界，则证明i下面没有子节点
        if (left>=n){
            return;
        }
        int min = left;
        if (right>=n){
            min = left;
        }else {
            if (A[right]<A[left]){
                 min = right;
            }
        }
//        min指向左右节点中最小的那个
//        如果A[i]比两个节点都要小，则不用调整
        if (A[i]<=A[min]){
            return;
        }else {
            int temp = A[i];
            A[i] = A[min];
            A[min] = temp;
//            孩子位发生了变化，i变为小孩子那个位置，递归调整
            MinHeapFixDown(A,min,n);
        }

    }

    public static void sort(int[] A,int n){
//        先对A进行堆化
        MinHeap(A);
        for (int x = n-1;x>=0;x--){
//            把堆顶，0号元素和最后一个元素的位置进行对调
            Util.swap(A,0,x);
//            缩小对的范围，对堆顶元素进行向下调整
            MinHeapFixDown(A,0,x);
        }
    }

    public static void main(String[] args) {
        int[] arr = {38,6,34,11,81,18,61,47,99,7};
        sort(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
