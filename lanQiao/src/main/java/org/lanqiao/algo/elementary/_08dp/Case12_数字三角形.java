package org.lanqiao.algo.elementary._08dp;

import static java.lang.Math.max;
/**
 * @author Awacky
 * @date 2020/4/16 23:17
 */
/*
*//*
**
        * 数字三角形(POJ1163)<br>
 *
 在数字三角形中寻找一条从顶部到底边的路径，使得路径上所经过的数字之和最大。<br>
路径上的每一步都只能往左下或 右下走。只需要求出这个最大和即可，不必给出具体路径。<br>
三角形的行数大于1小于等于100，数字为 0 - 99<br>
输入格式：<br>
5
 //表示三角形的行数 接下来输入三角形<br>
 *      7
 *     3 8<br>
 *    8 1 0<br>
 *   2 7 4 4<br>
 *  4 5 2 6 5<br>
 * 要求输出最大和<br>
 *

*/

public class Case12_数字三角形 {
    public static void main(String[] args) {
         int[][] triangle = {
             {7},
             {3, 8},
             {8, 1, 0},
             {2, 7, 4, 4},
             {4, 5, 2, 6, 5},
             {4, 5, 2, 6, 5, 7},
             {4, 13, 12, 88, 6, 6, 5},
             {3, 8, 7, 11, 9, 22, 66, 3},
         };
        System.out.println(maxSunUsingRecursive(triangle,0,0));
    }
//    dfs深度优先搜索
    public static int maxSunUsingRecursive(int[][] triangle,int i,int j){
        int rowIndex = triangle.length;
        if (i == rowIndex - 1){
            return triangle[i][j];
        }else {
//            顶点的值，加上+max（左侧或者右侧中最大的一个
            return triangle[i][j]+max(maxSunUsingRecursive(triangle, i + 1, j) , maxSunUsingRecursive(triangle, i + 1, j + 1));

        }

    }

//    动态规划，记忆性递归
    public int triangleDp(int[][] triangle,int i ,int j){

    }

//    方法三，自底而上，迭代思想。
}
