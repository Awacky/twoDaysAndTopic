package org.lanqiao.algo.elementary._05Str;

import org.apache.commons.lang3.StringUtils;

/**
 * @author Awacky
 * @date 2020/2/22 16:57
 */
//来源于面试题，如果一个字符串里面没有不同元素，则返回true，注意需要问面试官是ASCII型还是其他，如果是ASCII类型的话就比较简单了。
//这是我们用比较高级类型的编程语言的一个优点，可以直接使用别人封装好的API。
public class _1_1Different {
    public boolean checkDifferent(String initString){
        if (StringUtils.isEmpty(initString)){
            return true;
        }
        int[] flag = new int[128];
//        扫描字符串、
        for(int i = 0;i<initString.length();i++){
            int c = (int)(initString.charAt(i));
            if (flag[c]>0)return false;
            else flag[c]++;
        }
        return true;
    }

    public static void main(String[] args) {
        String iniString = "BarackObama";
        iniString = "abcdefg";
        System.out.println(new  _1_1Different().checkDifferent(iniString));
    }

}
