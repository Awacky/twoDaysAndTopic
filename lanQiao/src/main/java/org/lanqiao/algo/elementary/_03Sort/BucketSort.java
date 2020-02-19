package org.lanqiao.algo.elementary._03Sort;

import org.lanqiao.algo.util.Util;

import java.util.ArrayList;

/**
 * @author Awacky
 * @date 2020/2/18 21:33
 * 等我复习完栈再回来写
 */
public class BucketSort {
    private static void bucketSort(int[] arr){
        int max = Util.maxOf(arr);
        int min = Util.minOf(arr);

//        计算桶的数量
        int bucketNum = (max-min) / arr.length + 1;
        ArrayList<ArrayList<Integer>> buckerArr = new ArrayList<>(bucketNum);
        for (int i = 0;i<bucketNum;i++){
            buckerArr.add(new ArrayList<Integer>());
        }
//        将每个元素放入桶
        for(int i = 0;i < arr.length;i++){
            int num = (arr[i] - min) / (arr.length);
            buckerArr.get(num).add(arr[i]);
        }
//        桶内排序
        for(int i = 0 ;i < buckerArr.size();i++){
//           随便调用一个就行

        }

//        将桶中的元素赋值到原序列
        int index = 0;
        for (int i = 0;i<buckerArr.size();i++){
            for (int j = 0;j<buckerArr.get(i).size();j++){
                arr[index++] =buckerArr.get(i).get(j);
            }
        }
    }

}
