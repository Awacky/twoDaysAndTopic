package org.lanqiao.lanqiao2016javaB._01煤球数目;

/**
 * @author Awacky
 * @date 2020/5/24 13:39
 */
public class Main {
    public static void main(String[] args) {
        int n = 1;//每一层煤球数
        int count = 1;//计数
        for (int i = 1; i <= 100;i++){
            for (int j = 1;j <= n;j++ ){
                System.out.print(count++ + " ");

            }
            n=n+i+1;
            System.out.println();
        }
    }
}


//171700