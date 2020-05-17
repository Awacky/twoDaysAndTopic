package org.lanqiao.lanqiao2018javaB._02;

/**
 * @author Awacky
 * @date 2020/5/15 20:49
 */
public class B2方格计数2 {
    public static void main(String[] args) {
        int r = 0;
        int n = 1000;
        int y = n;
        for (int x = 1;x <= n;x++){
            while (x*x + y*y > n*n&&y>0)y--;
            r+=y;
        }
        System.out.println(r*4);
    }


}
