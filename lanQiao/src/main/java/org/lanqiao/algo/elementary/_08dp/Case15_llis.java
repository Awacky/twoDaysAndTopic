package org.lanqiao.algo.elementary._08dp;

import java.util.Scanner;

import static java.lang.Integer.max;

/**
 * @author Awacky
 * @date 2020/4/20 16:39
 */
//最长递增子序列
    /*输入
    * 4 2 3 1 5
    * 输出3
    * 因为2 3 5 构成了最长子序列*/
public class Case15_llis {
    static int[] arr = {4 , 2 , 3 , 1 ,5};
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cnt = dp(arr);
        System.out.println(cnt);
    }
//    暴力解法
    private static int f(int[] arr){
        int maxCnt = 0;
        for(int i = 0;i < arr.length;i++){
            int p = i;
            int cnt = 1;
            for (int j =  i + 1; j < arr.length;j++){
                if (arr[j] > arr[p]){
                    cnt++;
                    p = j;
                }
            }
            maxCnt = max(maxCnt,cnt);
        }
        return maxCnt;
    }

//    动态规范解法
    static int[] dp = new int[arr.length];
    private static int dp(int[] arr){
        dp[0] = 1;
        for (int i = 1;i < arr.length;i++){
            int cnt = 1;
            for (int j = i - 1;j >= 0;j--){
                if (arr[i] > arr[j]){
                    cnt = max(cnt , dp[j] + 1);
                }
            }
            dp[i] = cnt;
        }
        int ans = -1;
        for (int  i = 0; i < dp.length; i++){
            ans = max(ans,dp[i]);
        }
        return ans;
    }
}
