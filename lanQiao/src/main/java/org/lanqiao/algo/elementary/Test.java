package org.lanqiao.algo.elementary;

/**
 * @author Awacky
 * @date 2020/4/28 14:26
 */
public class Test {
    public static void main(String[] args) {
        int cnt = 0;
        for (int i = 0; i < 16;i++){
            for (int j = 0;j < 16;j++){
                if (j == i){
                    System.out.print(0);
                    j++;
                }
                if (j < 16){

                    System.out.print(1);
                }

            }
            System.out.println();
        }
    }
}
