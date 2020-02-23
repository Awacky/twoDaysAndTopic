package org.lanqiao.algo.elementary._05Str;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Awacky
 * @date 2020/2/23 11:20
 */
//判断字符集是否相同
public class Case_06SameStr {
    static boolean check(String s1,String s2){
        int[] help = new int[256];
//        扫描s1
        for (int i = 0;i < s1.length();i++){
            char c = s1.charAt(i);
            if (help[c]==0){
                help[c]=1;
            }
        }
//        扫描s2
        for (int i = 0;i <s2.length();i++){
            char c = s2.charAt(i);
            if (help[c] == 0) return false;
        }
        return true;

    }

//    哈希映射（增删改查）
    static boolean check2(String s1,String s2){
        Map<Character,Integer> map = new HashMap<>();
//        扫描S1
        for(int i = 0; i < s1.length();i++){
            char c = s1.charAt(i);
            if (map.get(c) == null){
                map.put(c,1);
            }
        }
//        扫描s2
        for (int i = 0;i < s2.length(); i++){
            char c = s2.charAt(i);
            if (map.get(c) == null){    //这儿说明c不在map的列表中
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        boolean res = check("abcde", "deabccadcd");
        System.out.println(res);
    }
}
