package lQofficeWebsite;

import java.util.Scanner;

/**
 * @author Awacky
 * @date 2020/2/2 19:24
 */
//小白上楼梯
//    实现递归基本是都是倒着推
//    f(n)=f(n-1)+f(n-2)+f(n-3)
public class XiaoBaiClimbTheStairs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int res = climbTheStairs(n);
        System.out.println(res);

    }
    private static int climbTheStairs(int n){
        if (n==0)return 1;
        if (n==1)return 1;
        if (n==2)return 2;

        return climbTheStairs(n-1)+climbTheStairs(n-2)+climbTheStairs(n-3);
    }
}
