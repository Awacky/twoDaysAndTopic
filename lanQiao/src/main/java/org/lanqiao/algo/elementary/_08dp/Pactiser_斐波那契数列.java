package org.lanqiao.algo.elementary._08dp;

import java.util.Scanner;

/**
 * @author Awacky
 * @date 2020/4/12 0:25
 */
//求斐波那契的前n项和
public class Pactiser_斐波那契数列 {
    static int[] rec;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        rec = new int[n + 1];
        for (int i = 0; i < n + 1; i++){
            rec[i] = -1;
        }
        long startTime = System.currentTimeMillis();
        int x = febnaqi(n);
        long endTime = System.currentTimeMillis();
        System.out.println(x);
        System.out.println(endTime - startTime);

        long startTime2 = System.currentTimeMillis();
        int m = dfs(n);
        long endTime2 = System.currentTimeMillis();
        System.out.println(m);
        System.out.println(endTime2 - startTime2);
    }
//记忆型递归
//    两步走
//    1、计算之前先查询
//    2、计算之后保存

    public static int dfs( int n ){
        if ( n == 1 || n == 2)return 1;
        if (rec[n] >= 0)
            return rec[n];
//        减一
        int v1 = dfs(n - 1) + dfs( n - 2);
        rec[n] = v1;
        return rec[n];

    }

//    递归解法

    public static int febnaqi(int n){
        if (n == 1|| n == 2){
            return 1;
        }else {
            return febnaqi(n - 1 ) + febnaqi( n - 2);
        }

    }
}
