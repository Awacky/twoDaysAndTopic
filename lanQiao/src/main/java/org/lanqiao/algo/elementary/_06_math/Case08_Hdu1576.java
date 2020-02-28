package org.lanqiao.algo.elementary._06_math;

/**
 * @author Awacky
 * @date 2020/2/28 23:41
 */
/*(A/B)%9973,求余，除法不满足交换性，可改为求B关于9973的逆元
* 这样的结果等价于Ax%9973等价于x*A%9973等价于xn%9973*/
public class Case08_Hdu1576 {

    private static class MyExGcd{
        static long x;
        static long y;

        /*求逆元
        * ax = 1 (% mo),gcd (a,mo)=1
        * ax+ mo*y = 1*/
        public static long inverseElement(long a,long mo)throws Exception{
            long d = linerEquation(a,mo,1);//ax+mo*y=1
            x = (x % mo + mo) % mo;//保证x>0;
            return d;
        }

//        线性方程
        public static long linerEquation(long a,long b,long m)throws Exception{
            long d = ext_gcd(a,b);
//            m不是gcd(a,b)的倍数，则方程无解
            if (m % d != 0) throw  new Exception("无解");
            long n = m / d;
            x *= n;
            y *= n;
            return d;
        }
//        扩展欧几里得
        public static long ext_gcd(long a,long b){
            if(b == 0){
                x =1;
                y =0;
                return a;
            }
            long res = ext_gcd(b,a%b);
            //x,y已经被下一层更新了
            long x1 = x;//备份x
            x = y; //更新x
            y = x1 - a / b * y; //更新y
            return res;
        }
    }
}
