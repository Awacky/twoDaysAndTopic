package org.lanqiao.algo.elementary._07dfs;

import java.util.ArrayList;

/**
 * @author Awacky
 * @date 2020/3/6 22:56
 */
//全排列pro版本
public class _9_5全排列_iiipro {
//    进行储存
    ArrayList<String> res = new ArrayList<>();
//    相比少了count k
    public  void permutation(String prefix,char[] arr){
        if (prefix.length() == arr.length){
            res.add(prefix);
        }
//        每次从头扫描，只要改字符可用，我们就可附加到后面，前缀变长了
        for(int i = 0;i < arr.length;i++){
            char ch = arr[i];
            //这个字符可用：（目的是解决重复的条件）
            if (count(prefix,ch) < count(arr,ch)){
                permutation(prefix +ch,arr);
            }
        }
    }
    private int count(String str,char ch){
        int cnt = 0;
        for (int i = 0;i < str.length(); i++){
            if (str.charAt(i) == ch){
                cnt++;
            }
        }
        return cnt;
    }
    private int count(char[] arr,char ch){
        int cnt = 0;
        for (char c:arr
             ) {
            if (c == ch)cnt++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        char[] arr = {'A','B','C'};
        _9_5全排列_iiipro chen= new _9_5全排列_iiipro();
        chen.permutation("",arr);
        System.out.println(chen.res.size());
        System.out.println(chen.res);
    }
}
