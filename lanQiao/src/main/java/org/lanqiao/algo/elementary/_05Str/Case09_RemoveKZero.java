package org.lanqiao.algo.elementary._05Str;

import org.assertj.core.api.Assertions;

/**
 * @author Awacky
 * @date 2020/2/23 12:18
 */
//移除字符串中连续出现的K个零
//    可以扫描字符数组的解法，但是使用正则表达式更为简单
public class Case09_RemoveKZero {
//    0{k}
    static String remove(String iniString,int k){
        String regexp = "0{"+ k +"}";
        return iniString.replaceAll(regexp, "");
    }

    public static void main(String[] args) {
        Assertions.assertThat(remove("A00000B", 3)).isEqualTo("A0B");
    }
}
