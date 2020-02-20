package org.lanqiao.algo.elementary._04matrix;

/**
 * @author Awacky
 * @date 2020/2/20 21:30
 */
//顺时针打印数组
//    具体实现思路就是层层打印下来
public class Case01_print2DArr {
    static void print(int[][] matrix){

//        定义2个点，一个是左上角，另一个是右下角
        int leftUprow = 0, leftUpCol = 0, rightDownRow = matrix.length - 1, rightDownCol = matrix[0].length - 1;

//        控制外层循环
        while (leftUprow <= rightDownRow && leftUpCol <= rightDownCol) {
            int r = leftUprow, c = leftUpCol;
            while (c <= rightDownCol) {
                System.out.print(matrix[r][c++] + " ");
            }
//      进入下一阶段需要进行的操作
            r++;
            c = rightDownCol;
            while (r <= rightDownRow) {
                System.out.print(matrix[r++][c] + " ");
            }

//        最下的一条边
            r = rightDownRow;
            c--;
//        这块这个范围：
            while (c >= leftUpCol) {
                System.out.print(matrix[r][c--] + " ");
            }

//        最后的一条边,我们首先要定义一个数来控制这是打印的第几层。
//        恢复
            c = leftUpCol;
            r--;
            while (r > leftUprow) {
                System.out.print(matrix[r--][c] + " ");
            }
            leftUprow++;leftUpCol++;rightDownCol--;rightDownRow--;
        }

    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3,4,111},
                {5,6,7,8,112},
                {9,10,11,12,113},
                {13,14,15,16,114}
        };
        print(matrix);
    }
}
