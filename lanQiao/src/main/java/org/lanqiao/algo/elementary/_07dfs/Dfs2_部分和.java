package org.lanqiao.algo.elementary._07dfs;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Awacky
 * @date 2020/3/8 0:12
 */
/*
给定整数序列a1,a2,...,an,判断是否可以从中选出若干数,使它们的和恰好为k.

    1≤n≤20

    -10^8≤ai≤10^8

    -10^8≤k≤10^8

样例:

输入

    n=4
    a={1,2,4,7}
    k=13
输出:

    Yes (13 = 2 + 4 + 7)

*/


//用参数来表示状态。
//    我每一次搞不懂回溯，为什么要回溯，在哪要回溯，这是一种直觉。
public class Dfs2_部分和 {
    private static int kk;
//    识别出两种平行状态，要还是不要。
    private static void dfs(int[] a, int k , int cur , ArrayList<Integer> ints){
        if ( k == 0){
            System.out.print("Yes (" + kk + "=" );
//            打印结果
            int size = ints.size();
            for (int i = 0;i < size;i++){
                System.out.print(ints.get(i) + (i == size -1 ? "" : "+"));
            }
            System.out.println(" )");
            System.exit(0);
        }
        if ( k < 0 || cur == a.length)return;

//        不要
        dfs(a,k,cur+1,ints);
//        要这个元素
        ints.add(a[cur]);
        int index = ints.size() - 1;
        dfs(a,k - a[cur],cur+1,ints);
//        回溯这块难理解
        ints.remove(index);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] A = new int[n];
        for (int i = 0;i < n;i++){
            A[i] = input.nextInt();
        }
        int k = input.nextInt();
        kk = k;
        dfs(A,k,0,new ArrayList<Integer>());
    }
}
