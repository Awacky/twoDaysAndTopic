package lQofficeWebsite.tree;

import util.Util;

import java.util.Arrays;

/**
 * @author Awacky
 * @date 2020/2/9 21:41
 */
public class heapSort2 {
    static void makeMinHeap(int[] A) {
        int n = A.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            MinHeapFixDown(A, i, n);
        }
    }

    static void MinHeapFixDown(int[] A, int i, int n) {
        // 找到左右孩子
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        //左孩子已经越界，i就是叶子节点
        if (left >= n) {
            return;
        }
        int min = left;
        if (right >= n) {
            min = left;
        } else {
            if (A[right] < A[left]) {
                min = right;
            }
        }
        //min指向了左右孩子中较小的那个

        // 如果A[i]比两个孩子都要小，不用调整
        if (A[i] <= A[min]) {
            return;
        }
        //否则，找到两个孩子中较小的，和i交换
        int temp = A[i];
        A[i] = A[min];
        A[min] = temp;
        //小孩子那个位置的值发生了变化，i变更为小孩子那个位置，递归调整
        MinHeapFixDown(A, min, n);
    }

    //
    // public static void sortDesc(int[] arr) {
    //   makeMinHeap( arr );  // 1.建立小顶堆
    //   int length = arr.length;
    //   for (int i = length - 1; i >= 1; i--) {
    //     Util.swap( arr, i, 0 ); // 堆顶（最小）元素换到元素末尾，末尾元素到了堆顶
    //     MinHeapFixDown( arr, 0, i );// 调整堆顶，边界递减
    //   }
    // }
    static void sort(int[] A) {
        //先对A进行堆化
        makeMinHeap(A);
        for (int x = A.length - 1; x >= 0; x--) {
            //把堆顶，0号元素和最后一个元素对调
            Util.swap(A, 0, x);
            //缩小堆的范围，对堆顶元素进行向下调整
            MinHeapFixDown(A, 0, x);
        }
    }
    public static void main(String[] args) {
        int[] arr = {38,6,34,11,81,18,61,47,99,7};
        System.out.println( "begin..." + Arrays.toString( arr ) );
        sort(arr);
        System.out.println( "final..." + Arrays.toString( arr ) );
    }
}
