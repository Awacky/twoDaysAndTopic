package org.lanqiao.algo.elementary._07dfs;

/**
 * @author Awacky
 * @date 2020/3/2 21:36
 */
/*
* 有一个x*y的网格，一个机器人只能走格点且只能向右或向下走，要从左上角走到右下角
* 设计一个算法，机器人有多少种走法
* 给定两个正整数int x,int y,请返回机器人的走法数目。保证x+y小于等于12*/
public class CC9_2机器人走方格 {
//    dp
//     边界是推理的起点。
    public static int slove(int x,int y){
        if (x ==1 || y ==1){
            return 1;
        }
        return slove(x-1,y) + slove(x,y-1);
    }
//    iteration
//    看变化的f(x,y) = f(x,y-1)+f(x-1,y)
//    这需要一个二维数组来表示
    public static int slove2(int x,int y){
        int[][] state = new int[x+1][y+1];
        for (int i = 1;i <= x;i++){
            state[i][1] = 1;
        }
        for (int i = 1;i <= y ;i++){
            state[1][i] = 1;
        }
        for (int i = 2;i <= x;i++){
            for (int j = 2;j <= y;j++){
                state[i][j] = state[i - 1][j] + state[i][j-1];
            }
        }
        return state[x][y];
    }

    public static void main(String[] args) {
        System.out.println(slove2(2,3));
    }
}
