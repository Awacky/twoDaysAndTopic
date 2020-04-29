package org.lanqiao.algo.lanqiao_2019_JAVAb省赛._04数的分解;

/**
 * @author Awacky
 * @date 2020/4/28 20:48
 */
/*
* 把2019 分解成3 个各不相同的正整数之和，并且要求每个正整数都不包
含数字2 和4，一共有多少种不同的分解方法？
注意交换3 个整数的顺序被视为同一种方法，例如1000+1001+18 和
1001+1000+18 被视为同一种。*/
public class Main {
    public static void main(String[] args) {
        int n = 2019;
        int num = 0;
        for (int i = 1;i < n;i++){
            if ((i + "").indexOf("2") != -1 || (i + "").indexOf("4") != -1)
                continue;
            for (int j = i + 1; j < n; j++){
                if ((j + "").indexOf("2") != -1 || (j + "").indexOf("4") != -1)
                    continue;
                int k = n - i - j;
                if (i == k || j == k || i == j)
                    continue;
                if (k > 0 && (k + "").indexOf("2") == -1 && (k + "").indexOf("4") == -1)
                    num++;
            }
        }
        System.out.println(num / 3);
    }
}
