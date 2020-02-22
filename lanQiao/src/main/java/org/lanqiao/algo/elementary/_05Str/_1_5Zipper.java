package org.lanqiao.algo.elementary._05Str;

/**
 * @author Awacky
 * @date 2020/2/22 21:24
 */
//字符串的压缩，这个字符串是有顺序的。
//    比如：字符串aabbccccaaa  ==>经过压缩之后会变成 a2b2c4a3
//    若压缩之后字符串长度没有变短，则返回原先的字符串。

//    除了这个逻辑之外，还有StringBuilder的使用
public class _1_5Zipper {
    public static String zipString(String src){
        int count = 0;  //  记录前一个字符串出现的次数
        char last = 0;   //上一个字符串
        StringBuilder sb = new StringBuilder();
        for (int i = 0;i < src.length();i++){
            char charAt = src.charAt(i);
            if (sb.length() == 0){
                sb.append(charAt);
                count++;
            }else {
                if (last == charAt){
//                    和上一个字符串相同
                    count++;
                }else {
//                    和上一个字符串不同
                    sb.append(count).append(charAt);
//                    重置为一
                    count = 1;
                }
            }
            last = charAt;
        }
//        考虑最后一个字符串重复的次数(上个算法是最后一个元素是没有加上的)
        if (count >= 1){
            sb.append(count);
        }
//        比较新字符串和原字符串的长度
        if (sb.length() >= src.length()) {
            return src;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String res = zipString("aaaaaaabc");
        System.out.println(res);
    }
}
