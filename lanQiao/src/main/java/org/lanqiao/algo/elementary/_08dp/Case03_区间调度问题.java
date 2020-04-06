package org.lanqiao.algo.elementary._08dp;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Awacky
 * @date 2020/4/5 12:47
 */
//比较优秀的地方，就是在程序内部加入了
//问题主题：区间调度问题，不想交区间。
//        问题描述：
//        有n项工作，每项工作分别在si开始，ti结束。对每项工作，你都可以选择参加或不参加，但选择了参加某项工作就必须至始至终参加全程参与，即参与工作的时间段不能有重叠(即使开始的时间和结束的时间重叠都不行)。
//    此外工作的时间不能重复（即使开始的时间与结束的时间重叠是不被允许的）
//    你的目标是参与尽可能多的工作，那么最多能参加多少项工作呢？
//        限制条件：
//        1<=n<=100000
//        1<=si<=ti<=10^9
//        样例：
//        输入
//        n=5
//        s={1,2,4,6,8}
//        T={3,5,7,9,10}
//        输出
//        3(选择工作1, 3, 5)

public class Case03_区间调度问题 {
//    暴力解法，先排序吧。从第一个开始选择

//    求最。。的话，可以找东西缩小模型。
//    我们总是选择结束时间最早的。
//    对结束时间进行排序，那么怎么带动开始时间的数组呢？--面向对象的思考方式，对数据进行打包。属性打包，操作打包，
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int[] s = new int[n];
    int[] T = new int[n];
    Job[] jobs = new Job[n];
    for (int i =0; i < n;i++){
        s[i] = input.nextInt();
    }
    for (int i = 0;i < n ;i++){
        T[i] = input.nextInt();
    }
    for (int i = 0; i < n;i++){
        jobs[i] = new Job(s[i],T[i]);
    }
    Arrays.sort(jobs);
//    把两个数组里面的元素进行绑定成一个对象来进行调用。
    int res = f(n,jobs);
    System.out.println(res);

}
private static int f(int n,Job[] jobs){
    int cnt = 1;
    int y = jobs[0].t;
    for (int i = 0; i < n;i++){
        if (jobs[i].s > y){
            cnt++;
            y = jobs[i].t;
        }
    }
    return cnt;
}
//必须实现排序规则,面向对象的思想部分,必须实现一个接口
    private static class Job implements Comparable<Job>{
    int s;
    int t;
    public Job(int s, int t){
        this.s = s;
        this.t = t;
    }

    public int compareTo(Job other){
        int x = this.t - other.t;
        if(x == 0)
            return this.s - other.s;
        else
            return x;
    }
}
}
