package org.lanqiao.algo.elementary._07dfs;

/**
 * @author Awacky
 * @date 2020/3/6 14:09
 */
/*LeetCode n个数排列组合找出字典序的第k个排列
*集合[1,2,······,n]总共包含n!独特的排列
* 我们得到如下序列（即，对于n = 3）
*   "123"
 "132"
 "213"
 "231"
 "312"
 "321"
 *
 * 给定n和k，返回第k个排列序列。
注:给定n为1到9之间，含9。*/
//这个是查找第k个字符串。
public class _9_5全排列iii {


    final static int k = 3;
    static int count = 0;

     private static void permutation(String prefix,char[] arr){
        if (prefix.length() == arr.length){
            //前缀的长度 == 字符集长度，一个排列就完成了
            count++;
            if (count == k ){
                System.out.println("----:" + prefix);
                System.out.println(0);
            }
        }
//        每次都从头扫描，只要改字符可用，我们就附加到前缀的后面，前缀变长了
        for (int i = 0; i < arr.length;i++){
            char ch = arr[i];
//            这个字符串可用：在pre中出现次数<在字符集出现的次数
            if (count(prefix,ch) < count(arr,ch)){
                permutation(prefix + ch,arr);
            }
        }
    }
    private static int count(char[] arr,char ch){
        int cnt = 0;
        for ( char c: arr
             ) {
            if (c == ch) cnt++;
        }
        return cnt;
    }
    private static int count(String str,char ch){
        int cnt = 0;
        for (int i = 0;i < str.length();i++){
            if (str.charAt(i) == ch) cnt++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        String s = "123";
        permutation("",s.toCharArray());
    }
}
