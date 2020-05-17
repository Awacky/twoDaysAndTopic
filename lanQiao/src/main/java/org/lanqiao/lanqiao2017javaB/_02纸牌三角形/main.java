package org.lanqiao.lanqiao2017javaB._02纸牌三角形;

/**
 * @author Awacky
 * @date 2020/5/17 16:54
 */
public class main {
    public static void main(String[] args) {
        f(0);
//        除以6是考虑不同的情况。
        System.out.println(ans/6);
    }
    static int[] a = {1,2,3,4,5,6,7,8,9};
    static int ans = 0;

    static void f(int k){
        if (k == 9){
            int x1 = a[0] + a[1] + a[3] + a[5];
            int x2 = a[0] + a[2] + a[4] + a[8];
            int x3 = a[5] + a[6] + a[7] + a[8];
            if ( x1 == x2 && x2 == x3){
                ans++;
            }

        }
//            这是对数组进行全排列
        for (int i = k; i < 9;i++){
            int t = a[k];
            a[k] = a[i];
            a[i] = t;
            f(k+1);
            t = a[k];
            a[k] = a[i];
            a[i] = t;
        }
    }
}
