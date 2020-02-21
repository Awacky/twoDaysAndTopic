package org.lanqiao.algo.elementary._04matrix;

/**
 * @author matrixwacky
 * @date 2020/2/21 14:51
 */
//题目描述： 给定一个N*N的矩阵matrix，在这个矩阵中，只有0和1两种值，返回边框全是1的最大正方形的边长长度

//    第一边的算法时间复杂度太高，4重循环，优化版的是动态规划和打标法
public class Case4_MaxSquare {
//    时间复杂度O（n*n*n）
    static int maxSquare(int[][] matrix){
        int N = matrix.length;
        int n = N;
        while (n > 0){
            for (int i = 0;i < N;i++){
                if (i + n > N){
                    break;
                }
                l3:
                for (int j = 0;j < N ;j++){
                    if (j + n > N){
                        break ;
                    }
//                    检查四个边
                    int r = i , c = j;
//                    while (c < j+n){
//                        if (martix[r][c++] == 0){
//                            continue l3;
//                        }
//                    }
//                    c--;
//                    while (r < i+n){
//                        if (martix[r++][c] == 0) continue l3;
//                    }
//                    r--;
//                    while (c >= j){
//                        if (martix[r][c--] == 0) continue l3;
//                    }
//                    c++;
//                    while (r >= i){
//                        if (martix[r--][c] == 0) continue l3 ;
//                    }
                     //检查四个边

                     while (c < j + n) {
                       if (matrix[r][c++] == 0) continue l3;
                     }
                     c--;
                     while (r < i + n) {
                       if (matrix[r++][c] == 0)
                         continue l3;
                     }
                     r--;
                     while (c >= j) {
                       if (matrix[r][c--] == 0)
                         continue l3;
                     }
                     c++;
                     while (r >= i) {
                       if (matrix[r--][c] == 0)
                         continue l3;
                     }
                     return n;

                }

            }
            n--;
        }
        return n;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 1, 1, 1, 1},
                {0, 0, 0, 1, 1},
                {1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1}
        };
        System.out.println(maxSquare(matrix));
    }
}
