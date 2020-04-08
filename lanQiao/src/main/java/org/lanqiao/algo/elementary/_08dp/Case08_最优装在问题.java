package org.lanqiao.algo.elementary._08dp;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Awacky
 * @date 2020/4/8 21:10
 */
//给出n个问题，第i个物体重量为wi，选择尽量多的物体，使得总总重量不差过C。
public class Case08_最优装在问题 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] w = new int[n];
        for (int i = 0;i < n;i++){
            w[i] = input.nextInt();

        }
        int C = input.nextInt();
        Arrays.sort(w);

    }

    private static int f(int n,int[] w,int c){
        int sum = 0;
        int cnt = 0;
        for (int i = 0; i < n;i++){
            sum += w[i];
            if (sum <= c){
                cnt++;
            }else {
                break;
            }
        }
        return cnt;
    }
}
