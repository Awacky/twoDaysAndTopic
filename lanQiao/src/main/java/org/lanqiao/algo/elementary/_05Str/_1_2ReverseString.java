package org.lanqiao.algo.elementary._05Str;

/**
 * @author Awacky
 * @date 2020/2/22 17:03
 */
//翻转字符串
public class _1_2ReverseString {
    public static String reverseString(String iniString){
        int len = iniString.length();
        char[] charArr = new char[len];
        int current = 0;
        for (int i = len-1;i >= 0;i--){
            charArr[current++] = iniString.charAt(i);
        }
//         生成一个字符串
        return new String(charArr);
    }

    public static void main(String[] args) {
        String iniString = "BarackObama";
         iniString = "abcdefg";
//         可以使用StringBuffer.reverse()方法，stringbuffer是一个可变的字符数组。
        System.out.println(new _1_2ReverseString().reverseString(iniString));
    }
}
