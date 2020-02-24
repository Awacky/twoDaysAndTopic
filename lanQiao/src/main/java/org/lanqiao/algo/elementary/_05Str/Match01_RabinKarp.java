package org.lanqiao.algo.elementary._05Str;

import org.lanqiao.algo.elementary._06_math.Case11_NExponent;

/**
 * @author Awacky
 * @date 2020/2/24 15:02
 */
/*滚动hash法
* 对目标字符串按d进制求值，取余为其hash
* 对源串，依次求出m个字符的hash，保存到数组中（滚动计算）
* 匹配时，只需比对目标串的hash值和预存的源串的hash值表*/
public class Match01_RabinKarp {
    private static void match(String p,String s){
        long hash_p = hash(p);  //p的hash值
        long[] hashOfs = hash(s,p.length());
        match(hash_p,hashOfs);
    }

    private static void match(long hash_p, long[] hash_s){
        for (int i = 0;i < hash_s.length; i++){
            if (hash_s[i] == hash_p){
                System.out.println("match:" + i);
            }
        }
    }

    final static long seed = 31;

//    n是子串的长度
//    用滚动方法求出s中长度为N的每个子串的hash，组成一个hash数组
    static long[] hash(final String s,final int n){
        long[] res = new long[s.length() - n + 1];
//        前m个字符的hash
        res[0] = hash(s.substring(0,n));
        for (int i = n; i < s.length();i++){
            char newChar = s.charAt(i);
            char ochar = s.charAt(i - n);
//            前n个字符的hash*seed-前n字符的第一字符*seed的n次方
            long v = (res[i - n] * seed + newChar - Case11_NExponent.ex2(seed, n) * ochar) % Long.MAX_VALUE;
            res[i - n + 1] = v;
        }
        return res;
    }

/*
* 使用100000个不同的字符串产生的冲突数，大概在0-3波动，使用100百万不同的字符串，冲突数大概110+范围波动*/
    static long hash(String str){
        long h = 0;
        for (int i = 0;i != str.length();++i){
            h = seed * h +str.charAt(i);
        }
        return h % Long.MAX_VALUE;
    }
}
