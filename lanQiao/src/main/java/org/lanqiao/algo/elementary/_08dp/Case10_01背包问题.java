package org.lanqiao.algo.elementary._08dp;

import java.util.Arrays;

import static java.lang.Integer.max;

/**
 * @author Awacky
 * @date 2020/4/10 23:06
 */
/*
* 有n个重量和价值分别为wi，vi的物品，从这些物品中挑选出总重量不超过W的物品，求所有挑选方案中价值总和的最大值
*
* 输入：
* n = 4
* (w,v) = {(2,3),(1,2),(3,4),(2,2)}
* w = 5;
*
* 输出：
* 7选择第0,1,3号物品*/
public class Case10_01背包问题 {
    static int[] w = {2,1,3,2};
    static int[] v = {3,2,4,2};
    static int n = 4; //物品数量
    static int W = 5;//背包的载重量
    public static void main(String[] args) {
        int ww =W;//外面的尽量不要变，做一个副本。
        int ans = dfs(0,ww);
        System.out.println(ans);

        rec = new int[n][W +1];
        for (int i = 0;i < n;i++){
            Arrays.fill(rec[i],-1);

        }
        ww = W;
        ans = m(0,ww);
//        System.out.println(ans);
//        System.out.println(dp());

    }
//    2^n的复杂度
//    这个思路就是：这个东西要不要，要的话，是一个，不要的话，是另外一个。
//    i代表的是从第几个数选，ww代表的是现在距离最大承受的重量还剩多少。
//    递归树的问题
    static int dfs(int i , int ww){
        if (ww < 0) return 0;//装不进去了
        if (i == n) return 0;//没东西可以选了

        int v2 = dfs(i + 1, ww);//不选择当前的东西
        if (ww >= w[i]){
            int v1 = v[i] + dfs(i+1,ww - w[i]);//选择当前的物品
            return max(v1,v2);
        }else {
            return v2;
        }

    }
    static int[][] rec;
//    记忆性递归
    static int m(int i ,int ww){
        if (ww <= 0)return 0;
        if (i == n) return 0;
        //1、计算之前先查询
        if (rec[i][ww] >= 0)
            return rec[i][ww];

        int v2 = m(i+1,ww);//不选择当前物品
        int ans;
        if (ww >= w[i]){
            int v1 = v[i] + m(i+1,ww - w[i]);//选择为当前的物品
            ans = max(v1,v2);
        }else {
            ans = v2;
        }
//        2、计算之后保存
        rec[i][ww] = ans;
        return ans;
    }


//
    static int dp(){
        int[][] dp = new int[n][W + 1];
//        初始话dp表的第一行
        for (int i = 0;i < W + 1;i++){
            if (i >= w[0]){
                //每种容量-0号物品
                dp[0][i] = 0;
            }else {
                dp[0][i] = 0;
            }
        }
//        其他行
        for (int i = 1;i < n;i++){
            //j是列，也是背包剩余容量
            for (int j = 0;j < W + 1;j++){
                if (j >= w[j]){
                    //要的起
                    int i1 = v[i] + dp[i - 1][j - w[i]];//选择点前物品即i号物品，剩余容量
                    int i2 = dp[i - 1][j];
                    dp[i][j] = max(i1,i2);
                }else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n - 1][W];
    }
}
