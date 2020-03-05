package org.lanqiao.algo.elementary._00Chen;

/**
 * @author Awacky
 * @date 2020/3/5 13:35
 */
//判断某个位置是否为1
//
public class _1Loction {
    private static void check1location(int n){
        for (int i = (int) Math.pow(2,n) -1;i > 0;i--){
            for (int j = n-1;j > 0;j--){
                if (((i >> j) & 1) == 1){
                    System.out.println(i);
                }
            }
        }
    }

    public static void main(String[] args) {
        check1location(2);
    }
}
