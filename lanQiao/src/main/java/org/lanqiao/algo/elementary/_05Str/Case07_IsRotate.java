package org.lanqiao.algo.elementary._05Str;

/**
 * @author Awacky
 * @date 2020/2/23 11:59
 */
/*判断A串是否和B串的旋转字符串
* defabd fabdde -- true
* fabddefabdde
* */
public class Case07_IsRotate {
    public static boolean isRotate(String a, String b){
//        if (a.length() != b.length()){
//            return false;
//        }
        StringBuilder sb = new StringBuilder(b).append(b);
        return sb.toString().contains(a);
    }

    public static void main(String[] args) {
        System.out.println(isRotate("defa", "fabdde"));
        System.out.println(isRotate("abc", "acb"));
    }
}
