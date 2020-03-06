package org.lanqiao.algo.elementary._07dfs;

/**
 * @author Awacky
 * @date 2020/3/6 12:11
 */

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 编写一个方法，确定某字符串的所有排列组合。

 给定一个string A和一个int n,代表字符串和其长度，请返回所有该字符串字符的排列，
 保证字符串长度小于等于11且字符串中字符均为大写英文字符，

 排列中的字符串按字典序从大到小排序。(不合并重复字符串)
 */

//俗称回溯法
public class _9_5全排列ii {
    ArrayList<String> res = new ArrayList<>();

    public ArrayList<String> getPermutation(String A){
        char[] arr = A.toCharArray();
//        存疑，为啥要排序
        Arrays.sort(arr);
        getPermutationCore(arr,0);
        return res;
    }
    public void getPermutationCore(char[] arr,int k){
        if (k == arr.length){
            //排好的情况，递归的支路就走到头了
            res.add(new String(arr));
        }
        //从k位开始的每个字符，都尝试放在新排列k的位置上
        for(int i = k;i < arr.length;i++){
            swap(arr,k,i);//把后面每个字符换到k位置
            getPermutationCore(arr,k+1);
            swap(arr,k,i);//回溯
        }
    }
//    交换位置
    static void swap(char[] arr,int i,int j){
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        ArrayList<String> res = new _9_5全排列ii().getPermutation("ABCD");
        System.out.println(res.size());
        System.out.println(res);

    }
}
