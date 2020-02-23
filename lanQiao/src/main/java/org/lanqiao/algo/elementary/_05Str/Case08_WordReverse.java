package org.lanqiao.algo.elementary._05Str;

/**
 * @author Awacky
 * @date 2020/2/23 12:05
 */
//将字符串按照单词翻转，如here you are --> are you here
public class Case08_WordReverse {
//    首先将整个字符串按照字符翻转，再找到每个单词，将单词翻转
    static String reverse(String src){
        String s1 = _1_2ReverseString.reverseString(src);
//        切割单词
        String[] words = s1.split("\\s");
        StringBuilder sb = new StringBuilder();
        for (int i = 0;i < words.length;i++){
            sb.append(_1_2ReverseString.reverseString(words[i]) + " ");
        }
        return sb.deleteCharAt(sb.length()-1).toString();
    }

    public static void main(String[] args) {
        String res = reverse("here you are");
        System.out.println(res);
    }
}
