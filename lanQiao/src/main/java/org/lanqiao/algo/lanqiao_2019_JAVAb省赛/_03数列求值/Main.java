package org.lanqiao.algo.lanqiao_2019_JAVAb省赛._03数列求值;

/**
 * @author Awacky
 * @date 2020/4/23 22:35
 */
//数列求值
    /*
    * 给定数列1, 1, 1, 3, 5, 9, 17, …，从第4 项开始，每项都是前3 项的和。求
第20190324 项的最后4 位数字。
//变相的告诉我们值只与后四个有关系。* */
public class Main {
    public static void main(String[] args) {
        int a = 1, b = 1, c = 1;
//        从第4列开始，则i<4，同理可以得出来20190324，则i<20190324;
        for (int i = 3;i < 20190324;i++){
            int temp = (a + b + c) % 10000;
            a = b;
            b = c;
            c = temp;
        }
        System.out.println(c);
    }

}
