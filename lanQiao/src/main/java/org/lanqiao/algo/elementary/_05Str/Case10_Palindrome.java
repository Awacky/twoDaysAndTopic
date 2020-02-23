package org.lanqiao.algo.elementary._05Str;

import org.apache.commons.lang3.StringUtils;

/**
 * @author Awacky
 * @date 2020/2/23 12:44
 */
//回文串
public class Case10_Palindrome {
    public boolean isPalindrome(String iniString){
        if (StringUtils.isEmpty(iniString)){
            return true;
        }
        return iniString.equals((new StringBuilder(iniString).reverse().toString()));
    }

    public static void main(String[] args) {
        String  str = "aba";
        System.out.println(new Case10_Palindrome().isPalindrome(str));
    }
}
