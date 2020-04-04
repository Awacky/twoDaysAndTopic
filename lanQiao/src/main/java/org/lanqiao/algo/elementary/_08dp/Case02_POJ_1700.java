package org.lanqiao.algo.elementary._08dp;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Integer.min;

/**
 * @author Awacky
 * @date 2020/4/4 23:12
 */
//题目大意
//有N个人要渡河，但是只有一艘船，船上每次最多只能载两个人，渡河的速度由两个人中较慢的那个决定，小船来回载人直到所有人都渡河，求最短的渡河时间。
//
//输入的第一行包含一个整数T（1<=T<=20），即测试用例的数量。接下来是T例。每种情况的第一行包含N，第二行包含N个整数，表示每个人过河的时间。每个案例前面都有一个空行。不会有超过1000人，没有人会花超过100秒的时间穿越。
//
//对于每个测试用例，打印一行，其中包含所有N个人过河所需的总秒数。
//————————————————
public class Case02_POJ_1700 {
//    暴力法、dfs
//    总是最快的带最慢的。
//    可以只顾眼前  1、2 -》 1   5/10   -》 2
//    贪心策略
//    这个题还是比较坑，考虑的很多。  2b ？ a + c;
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        int[] arr = new int[T];
        for (int j = 0;j < T;j++){
            arr[j] = input.nextInt();
        }
//        进行对数组的排序
        Arrays.sort(arr);

    }

//    过河（要求必须排序）
    private static void f(int n,int[] speed){
        int left = n;
        int ans = 0;
        while (left > 0){
            if(left == 1){
                //只有一个人
                ans += speed[0];
                break;
            }else if (left == 2){
                //只有两个人
                ans += speed[1];
                break;
            }else if (left == 3){
//                只有三个人
                ans += speed[2] + speed[0] + speed[1];
                break;
            }else {
                // 1, 2出发，1返回最后两名出发，2返回。
                int s1 = speed[1] + speed[0] + speed[left - 1] + speed[1];
//                1、3出发，1返回，1/4出发，1返回
                int s2 = speed[left - 1] + speed[left - 2] + 2 * speed[0];
                ans += min(s1,s2);
                left -= 2;//左侧是渡河的起点，left代表左侧的剩余人员。
            }
        }
        System.out.println(ans);
    }

}
