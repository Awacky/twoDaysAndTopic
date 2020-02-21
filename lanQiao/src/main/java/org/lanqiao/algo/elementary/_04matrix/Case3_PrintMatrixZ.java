package org.lanqiao.algo.elementary._04matrix;

/**
 * @author Awacky
 * @date 2020/2/21 11:44
 */
//题目描述，打印z字形
public class Case3_PrintMatrixZ {
    static void printMatrixZ(int[][] matrix){
        int r = 0 , m = matrix.length;
        int c = 0, n = matrix[0].length;
        boolean l2r = true; //从左到右
        while (r < m && c <n){
//            从左下到右上的斜线
            if (l2r){
                System.out.print(matrix[r][c] + " ");
//                现在在第一行，列末到边界，这是只能向右走
                if ( r == 0 && c < n -1){
                    l2r = !l2r; //方向切换
                    c++;
                    continue;
                }else if (r > 0 && c == n-1){
//                    现在在最后一列，只能向下走
                    l2r = !l2r;
                    r++;
                    continue;
                }else {
//                    继续向上走
                    r--;
                    c++;
                }
            }else {
//                反，走下坡
                System.out.print(matrix[r][c] + " ");
                if (c == 0  && r < m -1){
//                    走到第一列，只能往下走
                    l2r = !l2r;
                    r++;
                    continue;
                }else if ( r == m -1){
//                    走到最后一行，只能往右走
                    l2r = !l2r;
                    c++;
                    continue;
                }else {
                    r++;
                    c--;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        printMatrixZ(matrix);
    }
}
