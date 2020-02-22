package org.lanqiao.algo.elementary._05Str;

/**
 * @author Awacky
 * @date 2020/2/22 17:26
 */
//请编写一个方法，将字符串中的空格全部替换为”%20“。假定该字符串有足够的空间存放新增的字符，】
//    并且知道字符串的真实长度（小于等于1000），同时保证字符串由大小写的英文字母组成
//    例子：
    /*
    * ”Hello world“，12
    * 返回结果
    * "Hello%20%20"*/
public class _1_4Replacement {
    public static String replaceSpace(String iniString ,int len){
        return iniString.replaceAll("\\s","%20");
    }
//这种使用api的办法，不能输出来按照归定的长度
    public static void main(String[] args) {
//        System.out.println(replaceSpace("Hello world",12));
        System.out.println(replaceSpace("Mr John Smith000000000000000000000".toCharArray(), 13));
    }
//    使用双指针,
    public static String replaceSpace(char[] iniString,int len){
        int count =  len;
        for (int i = 0;i <len;i++){
            if (iniString[i]==' '){
                count+=2;
            }
        }
        int p1 = len -1;
        int p2 = count - 1;
        while (p1 >= 0){
            if (iniString[p1] == ' '){
                iniString[p2--] = '0';
                iniString[p2--] = '2';
                iniString[p2--] = '%';

            }else {
                iniString[p2--] = iniString[p1];
            }
            p1--;
        }
        return new String(iniString,0,count);
    }
}
