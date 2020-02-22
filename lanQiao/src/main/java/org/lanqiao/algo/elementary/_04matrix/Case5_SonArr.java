package org.lanqiao.algo.elementary._04matrix;

/**
 * @author Awacky
 * @date 2020/2/21 21:30
 */
// 子数组最大累加和
//    暴力解法
//    精巧的解法；单向扫描求和，负数丢弃，整数保留
public class Case5_SonArr {
//    递推法O（n）
    static int findByDp(int[] arr){
        int sumJ = arr[0];  //前j个元素的最大贡献
        int max = sumJ;
        int left = 0, right = 0;
        for (int j = 1;j < arr.length;j++){
            if (sumJ >= 0){
                sumJ += arr[j];
            }else {
                sumJ = arr[j];
                left = j;
            }
            if (sumJ > max){
                max = sumJ;
                right = j;
            }

        }
        return max  ;
    }

    public static void main(String[] args) {
        int[] arr = {};

    }
}
