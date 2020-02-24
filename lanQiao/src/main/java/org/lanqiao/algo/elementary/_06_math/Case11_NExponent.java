package org.lanqiao.algo.elementary._06_math;

/**
 * @author Awacky
 * @date 2020/2/24 21:12
 */
//以最快的速度求a的n次方
public class Case11_NExponent {
    public static int ex(int a, int n){
        if ( n == 0) return 1;
        if (n == 1) return  a;
        int temp = a; //a的1次方
        int res = 1;
        int exponent = 1;
        while ((exponent << 1) <n){
            temp = temp * temp;
            exponent = exponent << 1;
        }
        res *= ex(a,n-exponent);
        return res * temp;
    }

    /*巧算
    * */
    public static long ex2(long n , long m){
        if (n == 0) return 1;
        long pingFangShu = n;   //n的一次方
        long result = 1;
        while (m != 0){
//            遇1累成现在的幂
            if ((m & 1) == 1)
                result *= pingFangShu;
//               每移位一次，幂累成一次
                pingFangShu = pingFangShu * pingFangShu;
//                右移一位
        }
        return result;
    }

}
