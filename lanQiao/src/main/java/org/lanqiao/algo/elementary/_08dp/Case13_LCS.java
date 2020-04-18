package org.lanqiao.algo.elementary._08dp;

import java.util.ArrayList;

/**
 * @author Awacky
 * @date 2020/4/17 23:32
 */
/*
* 最长公共子序列
*AB34C
* A1BC2
* 结果为ABC */
//    简洁来说：最长相等的序列
public class Case13_LCS {
    public static void main(String[] args) {
        Case13_LCS obj = new Case13_LCS();
        System.out.println(obj.dfs2("3563243", "513141"));
    }
//    这个思路，求以i字符开头的公共子序列，然后扫描一遍，装到list里面中。。

    ArrayList<Character> dfs(String s1,String s2){
        int len1 = s1.length();
        int len2 = s2.length();
        ArrayList<Character> ans = new ArrayList<>();
        for (int i = 0;i < len1;i++){
//            求以i字符开头的公共子序列
            ArrayList<Character> list = new ArrayList<>();
//            和s2的每个字符进行比较
            for (int j = 0;j < len2;j++){
                if (s1.charAt(i) == s2.charAt(j)){
                    //如果相同
                    list.add(s1.charAt(i));
                    list.addAll(dfs(s1.substring(i+1),s2.substring(j+1)));
                    break;
                }
            }
            if (list.size() > ans.size()){
                ans = list;
            }
        }
        return ans;
    }

//    w我默写一下
//    返回一个Arraylist<charaster>的字符串
    ArrayList<Character> dfs2(String s1,String s2){
        int len1 = s1.length();
        int len2 = s2.length();
        ArrayList<Character> ans = new ArrayList<Character>();
        for (int i = 0;i < len1;i++){
            ArrayList<Character> list = new ArrayList<>();
            for (int j = 0;j < len2;j++){
                if (s1.charAt(i) == s2.charAt(j)){
//                    如果相同
                    list.add(s1.charAt(i));
                    list.addAll(dfs2(s1.substring(i+1),s2.substring(j+1)));
                    break;
                }
            }
            if (list.size() > ans.size()){
                ans = list;
            }
        }
        return ans;
    }

//    生成动规表
    String solution(String s1,String s2){
        int len1 = s1.length();
        int len2 = s2.length();
        int[][] dp = new int[len1 + 1][len2 + 1];//动规数组
        int flag = 0;
//        初始化第一列
        for (int i = 1; i <= len1;i++){
            if (flag == 1) {
                dp[i][1] = 1;
            }else if (s1.charAt(i - 1) == s2.charAt(0)){
                dp[i][1] = 1;
                flag = 1;
            }else {
                dp[i][1] = 0;
            }
        }
        flag = 0;
//        初始化第一行
        for (int j = 1;j < len2;j++){
            if (flag == 1){
                dp[1][j] = 1;

            }else if(s1.charAt(j - 1) == s1.charAt(0) ){
                dp[1][j] = 1;
                flag = 1;
            }else {
                dp[1][j] = 0;
            }
        }
        for (int i = 2;i <= len1; i++){
            for (int j = 2;j <= len2;j++){
                int maxOfLeftAndup = Math.max(dp[i - j][j],dp[i][j -1]);
                if (s1.charAt(i - 1) == s2.charAt(j - 1)){
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                }else {
                    dp[i][j] = maxOfLeftAndup;
                }
            }
        }
        return parseDp(dp,s1,s2);
     }

    private String parseDp(int[][] dp, String s1, String s2) {
        int M = s1.length();
        int N = s2.length();
        StringBuilder sb = new StringBuilder();
        while (M > 0 && N > 0){
//            比左和上大，一定是当前位置
            if (dp[M][N] > Math.max(dp[M - 1][N] ,dp[M][N - 1]) ){
                sb.insert(0,s1.charAt(M - 1));
                M--;
                N--;
            }else {
//                一定选择的是左边和上边的大者
                if (dp[M - 1][N] > dp[M][N - 1]){
                    M--;//往上移动
                }else {
                    N--;//往左移动
                }
            }
        }
        return sb.toString();
    }
}
