package org.lanqiao.algo.elementary._06_math;

/**
 * @author Awacky
 * @date 2020/2/26 22:14
 */
public class Case4_欧几里得算法 {
//欧几里得算法，即就是辗转相除法
    public static long gcd(long m,long n){
        return n == 0 ? m : gcd(n , m % n);
    }


//    最小公倍数，
    private static long lcm(long a,long b){
        return a * b / gcd(a,b);
    }
}
