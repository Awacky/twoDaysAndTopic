package org.lanqiao.algo.elementary._03Sort;

import org.lanqiao.algo.util.Util;

import java.util.Arrays;

/**
 * @author Awacky
 * @date 2020/2/10 21:09
 */
//计数排序（最快排序）
//    思路：开辟新的空间，空间大小为max（source），就是数组里面最大的那个数
//    扫描source，将value作为辅助空间的下标，用辅助空间改变位置元素记录value的值得个数
//    如：9,7,5,3,1，helper = arr(10)
//    一次扫描，value为9，将helper[9]++,value为7，将helper[7]++...
//    如此这般之后，遍历helper，如果该位的（index）为零 ，则就说明，index不曾出现在source中
public class _08CountSort {
    public static void sort(int[] source){
        int[] helper = new int[Util.maxOf(source)+1];
        for (int e : source){
            helper[e]++;
        }
        int current = 0; //数据回填的位置
        for(int i = 1; i < helper.length; i++){
            while (helper[i]>0){
//                这儿已解决掉了重复元素
                source[current++] = i;
//                这块的作用就是，跳出while循环
                helper[i]--;
            }
        }
    }

    public static void sort2(int[] source) {
        int[] helper = new int[Util.maxOf(source) + 1];
        for (int e : source) {
            helper[e]++;
        }
        for (int i = 1; i < helper.length; i++) {
            helper[i] += helper[i - 1];
        }
        int len = source.length;
        int[] target = new int[len];
        for (int i = len - 1; i >= 0; i--) {
            target[helper[source[i]] - 1] = source[i];
            helper[source[i]]--;
        }
        System.arraycopy(target, 0, source, 0, len);
    }
    //    如果这个数组里面有非负数怎么办。
    public static void sort3(int[] source){
//        先查找出来里面的绝对值。


    }
    public static void main(String[] args){
        int[] arr = Util.getRandomArr(10,-20,20);
        System.out.println("begin"+ Arrays.toString(arr));
        sort2(arr);
        System.out.println("final"+Arrays.toString(arr));
    }

}
