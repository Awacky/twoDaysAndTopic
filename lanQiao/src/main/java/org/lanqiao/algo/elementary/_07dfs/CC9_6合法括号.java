package org.lanqiao.algo.elementary._07dfs;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Awacky
 * @date 2020/3/2 22:57
 */
/*题目描述
* 实现一种算法，打印n对括号的有效组合（即左右括号正确匹配）
* 示例
* 输入 3
* 输出： ()()(), (()()), ()(()), (())(), ((()))*/
//set集合
//解法，对s(3)中的每个元素进行改变，添左，添右，添外
public class CC9_6合法括号 {

//    public boolean chkParenthesis(String A,int n){}

    //    set集合不允许重复,String类型的意思是里面只能存放string类型
//    逐步生成值递归解法
    public Set<String> parenthesis(int n){
        Set<String> s_n = new HashSet<>();
        if (n==1){
            s_n.add("()");
            return s_n;
        }
        Set<String> s_n_1 = parenthesis(n -1);
        for (String eOFfn_1: s_n_1) {
            s_n.add("()"+eOFfn_1);
            s_n.add(eOFfn_1+"()");
            s_n.add("("+eOFfn_1+")");
        }
        return s_n;
    }
//    这道题用迭代怎么做
    public Set<String> parenthesis2(int n){
        Set<String> s_n = new HashSet<>();
        s_n.add("()");
        if (n == 1){

            return s_n;
        }
        for (int i = 2; i <= n; i++) {
            Set<String> s_n2 = new HashSet<>();
            for (String eOFfn_1 : s_n) {
                s_n2.add("()" + eOFfn_1);
                s_n2.add(eOFfn_1 + "()");
                s_n2.add("(" + eOFfn_1 + ")");
            }
            s_n = s_n2;
        }
        return s_n;

    }

    public static void main(String[] args) {
        CC9_6合法括号 Obj = new CC9_6合法括号();
        Set<String> parenthesis = Obj.parenthesis2(3);
        System.out.println(parenthesis);
    }
}
