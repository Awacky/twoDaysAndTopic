package org.lanqiao.algo.elementary._06_math;

import java.util.Scanner;

/**
 * @author Awacky
 * @date 2020/2/27 15:45
 */
//这个题直接理解成为了取余问题了。。。
public class Case07_Poj1061青蛙的约会 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long x = input.nextInt();
        long y = input.nextInt();
        long m = input.nextInt();
        long n = input.nextInt();
        long l = input.nextInt();

        /*x+m*k = y+n*k mod L
        * (m - n) * k = y - x mod L
        * (m - n) * xx + l* yy = y -x*/
        long a = m - n;
        long b = l;
        m = y -x;
        long d = 0;

    }

    private static class Case05_ExtGcd{
        static long x;
        static long y;

//        调用完成之后xy是ax+by = gcd(a,b)的解
        public static long ext_gcd(long a, long b){
            if (b == 0){
                y = 0;
                x = 1;
                return a;
            }
            long res = ext_gcd(b,a%b);
            long x1 = x;//备份x
            x = y; //更新x
            y = x1 - a / b * y;
            return  res;
        }

//        ax+by = m ,当m时，gcd(a,b)倍数有解，等价于ax = m mod b
        public static long linerEquation(long a,long b,long m)throws Exception{
            long d = ext_gcd(a,b);
            if (m % d != 0) throw new  Exception("无解");
            long n = m / d;//约一下，考虑m是d的倍数
            x *= n;
            y *= n;
            return d;
        }
    }

}
