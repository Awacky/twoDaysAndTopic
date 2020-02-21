package org.lanqiao.algo.elementary._04matrix;

/**
 * @author Awacky
 * @date 2020/2/21 20:28
 */

//优化版：动态规划的思想，就是创建一个三维数组，进行从右下到左上角的分析，分析它的右边和下边（把它自己也算进去）有多少个1
public class Case4_MaxSquareGood {
//    储存值得三维数组
    static int[][][] record;
//    记录每个元素往右边和往下有多少个连续的1
    private static void generateHelRec(int[][] A){
        int N = A.length;
        int M = A[0].length;
        record = new int[N][M][2];
//        像这种一层一层分析的就不能这样直接二重循环了
        int row = N -1;
//        初始化最后一行
        for (int j = M - 1;j >= 0;j--){
            int value  = A[row][j];
            if (value == 1){
                if (j == M -1){
                    record[row][j][0] = 1;  //右侧连续1的个数
                }else {
//                    A的元素值为1，record在这个位置的连续1的个数=右边位置连续1的个数+1
                    record[row][j][0] = record[row][j+1][0] + 1;
                }
//                A的元素值为1，record下方的个数默认为1
                record[row][j][1] = 1;
            }
        }

//        最后一行初始化好了之后
        row--;
        for (int i = row;i >= 0;i--){
            for (int j = M -1; j >= 0;j--){
                int value = A[i][j];
                if (value==1){
                    if (j == M -1){
                        record[i][j][0] = 1;
                    }else {
                        record[i][j][0] = record[i][j+1][0] +1;
                    }
//                    向下连续1的个数
                    record[i][j][1] = record[i+1][j][0];
                }
            }
        }

    }

    private static boolean check(int i,int j ,int n){
//        左上角的数字往右数的1要大于n
//        右上角的数字往下数的1要大于n
//       左上角的数字往下数的1要大于n
//        左下角的数字往右数的1要大于n
        if (record[i][j][0] > n && record[i][j][1] > n && record[i][j+n-1][1] > n && record[i+n-1][j][0] > n ){
            return true;
        }else {
            return false;
        }
    }

    private static int solve(int[][] A){
        int N = A.length;
        int n = N;
        while (n > 0){
            for (int i = 0;i < N;i++){
                if (i + n > N) break;
                l3:
                for (int j = 0;j < N;j++){
                    if (j +n > N)break ;
                    if (check(i,j,n)){
                        return n;
                    }
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
        generateHelRec(matrix);
        System.out.println(solve(matrix));
    }
}
