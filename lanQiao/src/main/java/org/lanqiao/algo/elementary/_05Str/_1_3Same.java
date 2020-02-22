package org.lanqiao.algo.elementary._05Str;

import java.util.Arrays;

/**
 * @author Awacky
 * @date 2020/2/22 17:11
 */
//变形词： 两个串有相同的字符及数量组成
//题目描述：给定两个字符串，请编写程序，确定其中一个字符串的字符重新排列之后，能否变成另一个字符串
//    这里规定大小不同是不同的字符串，且考虑字符串中的空格  而且限定都是ASCII码字符

public class _1_3Same {
//    /*
//    思路一：
//    转成字符数组，对他们进行排序*/
//    思路二：
//     计数排序的思路，对第一个进行计数，对二个减去，如果结果不为零，则说明条件不成立，就不能转为字符。
    private static boolean checkSum(String A,String B){
        int len1 = A.length();
        int len2 = B.length();
        if (len1 != len2){
            return false;
        }
//        转化成字符数组
        char[] arr1 = A.toCharArray();
        char[] arr2 = B.toCharArray();

//        对他们进行排序
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1,arr2);
    }

    public static void main(String[] args) {

    }
}
