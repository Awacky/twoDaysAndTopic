package org.lanqiao.algo.elementary._06_math;

/**
 * @author Awacky
 * @date 2020/3/1 22:28
 */
//扩展欧几里得的练习
public class Case05_01_ExtGcd {
//    求最大公约数模板
    public static long gcd(long a,long b){
        return b == 0 ? a : gcd(a,b);
    }

//    扩展欧几里得求线性方程
//        调用完之后xy是ax+by = gcd(a,b)的解
//    本质上就是一个递归函数
    static long x;
    static long y;
    public static long ext_gcd(long a,long b){
//递归头
        if (b == 0){
            x = 1;
            y = 0;
            return a;
        }
        long res = ext_gcd(a,a%b);
        long x1 = x;    //备份x
//        这里的xy已经被下一层递归更新了利用公式 x = x1,y = x1 - a/b*y
        x = y;
        y = x1 - a /b * y; //更新y
        return res;
    }
}
