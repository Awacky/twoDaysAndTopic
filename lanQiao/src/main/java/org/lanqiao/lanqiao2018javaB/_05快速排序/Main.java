package org.lanqiao.lanqiao2018javaB._05快速排序;

import java.util.Random;

/**
 * @author Awacky
 * @date 2020/5/12 20:25
 */
public class Main {
    public static void main(String[] args) {
        int [] a = {1, 4, 2, 8, 5, 7};
        System.out.println(quickSelect(a, 0, 5, 4));
    }
    public static int quickSelect(int a[],int l ,int r,int k){
        Random rand = new Random();
        int p = rand.nextInt(r - l + 1) + l;
        int x = a[p];
        int tmp = a[p];a[p] = a[r] ;a[r] = tmp;
        int i = l,j = r;
        while (i < j){
            while (i < j && a[i] < x)i++;
            if (i < j){
                a[j] = a[i];
                j--;
            }
            while (i < j && a[j] > x)j--;
            if (i < j){
                a[i] = a[j];
                i++;
            }
        }
        a[i] = x;
        p = i;
        if (i - l + 1 == k)return a[i];
//        if (i - l + 1 < k)return quickSelect(a,);
        else return quickSelect(a,l,i-1,k);
    }

}
