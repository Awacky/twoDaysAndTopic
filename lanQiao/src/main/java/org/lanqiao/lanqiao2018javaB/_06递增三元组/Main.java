package org.lanqiao.lanqiao2018javaB._06递增三元组;

import java.util.Scanner;

/**
 * @author Awacky
 * @date 2020/5/12 20:38
 */
public class Main {
    public static void main(String[] args) {
        int count = 0;
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] A = new int[n];
        int[] B = new int[n];
        int[] C = new int[n];
        for (int i = 0; i < n ; i++){
            A[i] = input.nextInt();
        }
        for (int i = 0; i < n ; i++){
            B[i] = input.nextInt();
        }
        for (int i = 0; i < n ; i++){
            C[i] = input.nextInt();
        }
//        然后处理。
        for (int i = 0; i < n;i++){
            int x = C[i];
            for (int j = 0;j < n;j++){
                if (x > B[j]){
                    int b = B[j];
                    for (int m = 0;m < n;m++){
                        if (b > A[m])count++;
                    }
                }
            }
        }
        System.out.println(count);
    }

}
