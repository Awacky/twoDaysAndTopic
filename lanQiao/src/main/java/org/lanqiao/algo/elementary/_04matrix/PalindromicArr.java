package org.lanqiao.algo.elementary._04matrix;

import org.lanqiao.algo.util.Util;

/**
 * @author Awacky
 * @date 2020/2/21 11:00
 */
//把正常的数组变成回文数组
    /*
    * 正常的二维数组
    * {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        }*/
    /*
    * 回文数组
    * {{1,2,3,4},
    * {12,13,14,5},
    * {11,16,15,6}
    * {10,9,8,7}}*/

//    思路，我先把给出的二维数组转化成一维数组，然后设置个光标，跟着走赋值就行。
public class PalindromicArr {
    static void palindromicArr(int[] helper,int[][] arr){
        int leftUpRow = 0 , leftUpCol = 0, rightDownRow = arr.length -1, rightDownCol = arr[0].length -1, current = 0;
        while (leftUpRow <= rightDownRow && leftUpCol <= rightDownCol){
            int r = leftUpRow ,  c = leftUpCol;
//            上边一条边
            while ( c <= rightDownCol){
                arr[r][c++] = helper[current++];
            }
            r++;
            c=rightDownCol;
            while (r <= rightDownRow){
                arr[r++][c] = helper[current++];
            }
//            最下边的一条边
            r = rightDownRow;
            c--;
            while (c >= leftUpCol){
                arr[r][c--] = helper[current++];
            }

//            最左边的一条边
            c = leftUpCol;
            r--;
            while (r > leftUpRow) {
                arr[r--][c] = helper[current++];
            }
            leftUpRow++;leftUpCol++;rightDownCol--;rightDownRow--;
        }
    }

//    进行二维数组转化为一维操作
    static int[] changeArr(int[][] matrix){
        int[] helper = new int[(matrix.length+1)*(matrix[0].length+1) ];
        int current = 0;
        for (int i = 0;i < matrix.length;i++){
            for (int j = 0; j < matrix[i].length;j++){
                helper[current++] = matrix[i][j];
            }
        }
        return helper;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        int[] helper = changeArr(matrix);
        palindromicArr(helper,matrix);
        Util.printMatrix(matrix);
    }
}
