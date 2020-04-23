package org.lanqiao.algo.lanqiao_2019_JAVAb省赛._03数列求值;

/**
 * @author Awacky
 * @date 2020/4/23 22:35
 */
//数列求值
public class Main {
    public static void main(String[] args) {
//使用迭代法，每次对10000取余
//        面对大规模数据时候，两种办法解决问题，一种是初始化扩大范围，另一种就是变小。
//        这道题就是斐波那契数列的变形。
//        int n = 20190324;
//        int a = 1;
//        int b = 1;
//        int c = 1;
//        for (int i = 4;i <= n ;i++){
//            if (i % 3 ==1){
//                a = (a+b+c) % 10000;
//            }else if (i % 3 == 2){
//                b = (a+b+c) % 10000;
//            }else {
//                c = (a+b+c) % 10000;
//            }
//        }
        System.out.println(fbnq(20190324));

    }

    public static long fbnq(long n){
        if (n <= 3){
            return 1;
        }else {
            return fbnq(n - 1) % 1000000 + fbnq(n -2)%1000000 + fbnq(n -3)%1000000;
        }
    }

}
