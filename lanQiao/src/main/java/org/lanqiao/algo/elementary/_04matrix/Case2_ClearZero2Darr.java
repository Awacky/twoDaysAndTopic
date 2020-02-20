package org.lanqiao.algo.elementary._04matrix;

import org.lanqiao.algo.util.Util;

/**
 * @author Awacky
 * @date 2020/2/20 22:26
 */
//题目描述，一个二维数组，如果所在中间有个0的数，那么把它位置所在的行和列都都变成0
public class Case2_ClearZero2Darr {
    static void clearZero(int[][] matrix){
//        第一遍扫描记录
        int M = matrix.length;
        int N = matrix[0].length;
        int[] rowRecord = new int[M];
        int[] colRecord = new int[N];
//        for (int i = 0; i < R; i++) {
//            for (int j = 0; j < C; j++) {
//                if (matrix[i][j] == 0) {
//                    rowRecord[i] = 1;
//                    colRecord[j] = 1;
//                }
//            }
//        }
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (matrix[i][j] == 0) {
                    rowRecord[i] = 1;
                    colRecord[j] = 1;
                }
            }
        }
//        清零操作
        for (int row = 0; row < M; row++) {
            for (int col = 0; col < N; col++) {
                //当前的行或者列，被标记了，这个元素就应该变为0
                if (rowRecord[row] == 1 || colRecord[col] == 1) {
                    matrix[row][col] = 0;
                }
            }
        }
    }


//        for (int row = 0; row < M;row++){
//            for (int col = 0;col < N;col++){
////                if (rowRecord[row] ==1){
//////                    for (int i = 0;i<C;i++){
//////                        matrix[row][i] = 0;
//////                    }
//////                }
//////                if (colRecord[col] == 1){
//////                    for (int i = 0;i<R;i++){
//////                        matrix[i][col] = 0;
//////                    }
//////                }
////                当前的行货列，被标记了，这块都被搞成0；
//                if (rowRecord[row] == 1 || colRecord[col] == 0){
//                    matrix[row][col] = 0;
//                }
//            }
//        }
//    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4, 100},
                {5, 6, 7, 0, 101},
                {9, 0, 11, 12, 102},
                {13, 14, 15, 16, 103},
                {104, 105, 106, 107, 103},
        };
        clearZero(matrix);
        Util.printMatrix(matrix);
    }
}
