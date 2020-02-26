package org.lanqiao.algo.elementary._05Str;

/**
 * @author Awacky
 * @date 2020/2/24 22:38
 */
//字符串匹配，暴力匹配解法
public class Match02_Brute_Force {
//
    private static boolean slove(String str1,String pattern){
//        先将这两个字符串都存入到数组里面
        char[] mainStr = new char[str1.length()];
        char[] patternStr = new char[pattern.length()];
        for (int i = 0;i<str1.length();i++){
            mainStr[i] = str1.charAt(i);
        }
        for (int i =0;i < pattern.length();i++){
             patternStr[i] = pattern.charAt(i);
        }

        int i = 0;  //  主指针变量
        int j = 0;  //模式串变量
        int count = 0;      //到时候需要回溯的位置
        while (i < str1.length() && j < pattern.length()){
            if (mainStr[i] != patternStr[j]){

                count++;
                j = 0;
                i = count;
                continue;
            }
            i++;
            j++;
        }
        if (j == patternStr.length ) return true;
        return false;
    }

//    求next数组
//    public static int[] next(String ps){
//        int pLength = ps.length();
//        int[] next = new int[pLength + 1];
//        char[] p = ps.toCharArray();
//        next[0] = -1;
//        if (ps.length() == 1){
//            return next;
//        }
//        next[1] = 0;
//
//        int j = 1;
//        int k = next[j];    //看看位置j的最长
//    }

    public static void main(String[] args) {
        String s = "ABABABA";
        String p = "ABAv";
        System.out.println(slove(s,p));
    }
}
