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
        System.out.println(obj.dfs("3563243", "513141"));
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
}
