package org.lanqiao.lanqiao2018javaB._03;

import java.math.BigInteger;

/**
 * @author Awacky
 * @date 2020/5/11 22:10
 */
public class Main {
//    这道题就是考大数嘞。

    public static void main(String[] args) {
        int n = 123456;
        BigInteger a = new BigInteger("2");
        BigInteger b = new BigInteger("3");
        BigInteger a1 = new BigInteger("2");
        BigInteger b1 = new BigInteger("3");
        BigInteger ta;
        for (int i = 0; i < n;i++){
            ta = a;
            a = a.multiply(a1).subtract(b.multiply(b1));
            b = ta.multiply(b1).add(b.multiply(a1));
        }
//        System.out.println(a + "+" + b + "i");
//        for(int i=1;i<n;i++) {
//            BigInteger ta=a;
//            a=a.multiply(a1).subtract(b.multiply(b1));//a=a*a1-b*b1;
//            b=ta.multiply(b1).add(b.multiply(a1));//b=a*b1+b*a1
//        }
        System.out.println(a+"+"+b+"i");
    }
}
