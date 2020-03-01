package org.lanqiao.algo.elementary._05Str;

import java.util.Arrays;

/**
 * @author Awacky
 * @date 2020/3/1 10:11
 */
/*kmp匹配算法*/
public class Match04_Kmp {
//    求next数组
    private static int[] getNext(String ps){
        int pLength = ps.length();
        int[] next = new int[pLength];
        char[] p =  ps.toCharArray();
        next[0] = -1;//这是规定
        if (ps.length() == 1) return next;
        next[1] = 0;
        int j = 1;
        int k = next[j];//看看位置j的最长匹配前缀在哪里
//因为这是j-1的时候推j的位置。
        while (j < pLength -1 ){
//            先要推出next[j+1],检查j和k位置上的关系即可
            if ( k == -1 || p[j] == p[k]){
//                next[++j] = next[j] + 1;这个写法不对是因为前面j已经加了，默认就是零了。
                next[j+1] = ++k ;
                j++;
            }else {
                k = next[k];
            }
        }
        return next;
    }
//    O（m+n）
    public static int indexOf(String s,String t){
        if (s.length() == 0 || t.length() == 0) return -1;
        if (t.length() > s.length()) return -1;
        int count = 0;
        int[] next = getNext(t);
        int i = 0;//s位置
        int j = 0;//模式串的位置
        int sLen = s.length();
        int tLen = t.length();

        while (i < sLen){
            if (j == -1 || s.charAt(i) == t.charAt(j)){
                i++;
                j++;
            }else {
                j = next[j];
            }
            if (j == tLen){
//                匹配成功了
                i--;
                j--;
                return i-j;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String src = "babababcbabababb";
        String str = "abcac";
        String str2 = "abcdabcdabe";
        int[] next = getNext(str2);
        int index = indexOf(str2, "bab");
        System.out.println(Arrays.toString(next));
    }
}
