package org.lanqiao.algo.elementary._04matrix;

import java.util.Arrays;

/**
 * @author Awacky
 * @date 2020/2/21 21:45
 */
//子矩阵的最大累加和
public class Case6_SonMatrix {
    private static int maxSum(int[][] matrix){
        int beginRow = 0;   //以它为起始行

        final int M = matrix.length;
        final int N = matrix[0].length;

        int[] sums = new int[N];    //按列来求和
        int max = 0 ;       //历史上最大的子矩阵之和

        while (beginRow<M){
            //起始行
            for (int i = beginRow; i < M ;i++){//从起始行到第i行
//
//                按列累加
                for (int j = 0;j < N;j++){
                    sums[j] += matrix[i][j];
                }
//                累加完成
                int t = Case5_SonArr.findByDp(sums);
                if (t > max)
                    max = t;
            }
//            另起一行作为起始行，把sums清零
            Arrays.fill(sums,0);    //快速地将sums的每个元素清零
            beginRow++;
        }
        return max;
    }
}
