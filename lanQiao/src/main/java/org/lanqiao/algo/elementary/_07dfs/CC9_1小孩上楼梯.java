package org.lanqiao.algo.elementary._07dfs;

/**
 * @author Awacky
 * @date 2020/3/2 14:28
 */
//类似于斐波拉契数组
    /*
    * 有两个小孩在上楼梯，楼梯有n阶台阶，小孩一次可以上1阶，2阶，3阶
    * 为了防止溢出，请将结果mod （求两数相除的余数）1000000007
    *
    *  给定一个正整数int n，请返回一个数，代表上楼的方式数。
 保证n小于等于100000。*/
public class CC9_1小孩上楼梯 {
    static final int mod = 1000000007;

    public static void main(String[] args) {

    }
    /*递归写法*/
    public static long recursion1(int n){
        if (n < -1)return 0;
        if (n == 0 || n == 1)return 1;
        if (n == 2)return 2;
        return recursion1(n-1) % mod + recursion1(n -2) % mod + recursion1(n -3) % mod;
    }
//    迭代写法
    public static long recursion2(int n){
        if (n < -1)return 0;
        if (n == 0 || n == 1)return 1;
        if (n == 2)return 2;
        if (n == 3)return 4;
        int x1 = 1;
        int x2 = 2;
        int x3 = 4;
        for (int i = 4 ;i <= n ;i ++){
            int temp = x1;
            x1 = x2 % mod;
            x2 = x3 % mod;
            x3 = ((x1+x2)%mod + temp)%mod;
        }
        return x3;
    }
}
