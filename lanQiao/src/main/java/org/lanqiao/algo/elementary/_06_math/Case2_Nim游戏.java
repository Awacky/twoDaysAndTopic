package org.lanqiao.algo.elementary._06_math;

/**
 * @author Awacky
 * @date 2020/2/26 19:59
 */

/*
* Nim游戏
* 把各种堆转化成二进制进行异或运算，得出来的结果有一个特点
* 如果结果非0  先动的人赢
* 如果结果为0  先动的人输
**/
public class Case2_Nim游戏 {

    static boolean slove(int[] A){
        int res = 0;
        for (int i = 0;i < A.length;i++){
            res ^= A[i];
        }
        return res != 0;
    }

    public static void main(String[] args) {
        int[] A = {5,10,16};
        boolean res = slove(A);
        System.out.println(res);
    }

}
