package org.lanqiao.algo.elementary._08dp;

/**
 * @author Awacky
 * @date 2020/4/18 22:49
 */
/*
* 题目描述：
* 有n种体积和价值分别为wi,vi的物品
​
 的物品。有一个容量为W(体积)的背包。求出背包能装下的最大价值，每种物品的数量是无限的。

*  * 首先在初始化最后一行的时候有所不同：初始化时，当只考虑一件物品a时，state[row][j] = values[row]*j/weight[row]
 * 然后在递推的时候有些不同：state[row][j] = max{state[row+1][j],state[row][j-weight[row]]+values[row]}，即不抓时用现在的容量去匹配下面行
 * 要抓的时候，先抓到这个物品的价值，然后用剩下的容量去匹配同一行，为什么匹配同一行，这是因为剩下的容量可以重复抓当前物品（不限数量）
 *
 * 同时必须理解，抓一个之后用剩余的容量重新考虑当前可选的所有物品其实包含了抓2个甚至更多的情况！！！*/
public class Case14_完全背包问题 {
    public static void main(String[] args) {

    }


//    kmp思路，对应的大前面的数，然后它对应下面的数字。

}
