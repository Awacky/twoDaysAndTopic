package org.lanqiao.lanqiao2018javaB._02;

/**
 * @author Awacky
 * @date 2020/5/11 21:55
 */
//求方格中的圆。
public class Main {
    public static void main(String[] args) {
//        思路：看第一象限，格子左上角到圆心的距离小于半径。
        int count = 0;
        int r = 1000;
        for (int x = 1;x < r; x++){
            for (int y = 1; y < r;y++){
                if(Math.pow(x,2)+ Math.pow(y,2) <= Math.pow(r,2))
                    count++;
            }
        }
        System.out.println(4*count);
    }

}
