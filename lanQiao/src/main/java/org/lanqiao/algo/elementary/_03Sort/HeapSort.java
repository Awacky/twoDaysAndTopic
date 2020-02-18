package org.lanqiao.algo.elementary._03Sort;

import org.lanqiao.algo.util.Util;

import java.util.Arrays;

/**
 * @author Awacky
 * @date 2020/2/18 15:05
 * 堆排序
 * 大顶堆
 */
public class HeapSort {


//    进行堆化操作
    public static int[] createHeap(int[] arr ,int len){
//        创造堆
        for (int i =len/2 -1;i >= 0;i--){
            adjustHeap(arr,i,len );
        }
//        上述结束，开始排序
        for (int j = arr.length -1;j > 0;j--){
//            把元素去掉，目的是去掉最小项
//            把小顶堆的根元素，放到数组最后；换句话说，就是每一次的堆调整后，都有一个元素找到自己位置
            Util.swap(arr,0,j);
//            把元素交换之后，就不用考虑最后一个元素了
            adjustHeap(arr,0,j);
        }
        return arr;
    }

//    调整成大顶堆也很简单
    /*
    * 让j指向子结点中最小的
    * 发现左右子结点小于根结点，则进行值交换，就好了就改两处*/
//    调整成为一个大顶堆
    public static void adjustHeap(int[] arr,int i,int len){
        for (int j = 2*i +1;j<len;j = 2*j +1){
            int temp = arr[i];
//            让j先指向子结点中最大的节点
            if (j+1<len && arr[j] < arr[j+1]){
                j++;
            }
//            如果发现结点（左右子结点）大于根结点，则进行值得交换
            if (arr[j] >= temp){
                Util.swap(arr,i,j);
//                如果子结点更换了，那么，以子节点为根的子树会受到影响，所以对子节点所在的树进行判断
                i = j;
            }else {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {67,48,52,40,38,19,23,81};
        createHeap(arr,7);
        System.out.println(Arrays.toString(arr));
    }
}
