package org.lanqiao.algo.elementary._07dfs;

import java.util.ArrayList;

/**
 * @author Awacky
 * @date 2020/3/5 18:41
 */
/*题目描述：
* 编写一个方法，确定某字符串的所有排列组合
*
* 给定一个String A，和一个int n,代表字符串和其长度，请返回所有该字符串的排列，
* 保证字符串长度小于11且字符串中字符均为大写英文字母*/
public class _9_5全排列 {
//    迭代大法
    public ArrayList<String> getPermutation0(String A){
        int n = A.length();
        ArrayList<String> res = new ArrayList<>();
//        初始化，包含第一个字符
        res.add(A.charAt(0) + "");
        if (n == 1)return res;
//        将第二个字符插入到前面生成集合的每个元素里面
        for (int i = 1;i < n;i++){
//            备用的
            ArrayList<String> res_new = new ArrayList<>();
            char c = A.charAt(i);//新字符
            for (String str : res){
//               方位上一趟集合中的每一个字符串
//                插入到每一个位置，形成一个新串
                String newStr = c + str;//加在前面
                res_new.add(newStr);
                newStr = str + c;//加在后面
                res_new.add(newStr);
                //加在中间
                for (int j = 1;j < str.length();j++){
                    newStr = str.substring(0,j) + c +str.substring(j);
                    res_new.add(newStr);
                }

            }
            res = res_new;//更新
        }
        return res;
    }
//    递归写法
    public ArrayList<String> getPermutation1(String A,int n){
        ArrayList<String> res = new ArrayList<>();
        if (n == 0){
            res.add(A.charAt(0) + "");
            return res;
        }
        ArrayList<String> res_new = getPermutation1(A,n-1);
        String c = A.charAt(n) + "";

        for (int i = 0; i < res_new.size();i++){
            int len = res_new.get(i).length();
            res.add(c + res_new.get(i));
            res.add(res_new.get(i) + c);
            for (int j = 1;j < len;j++){
                res.add(res_new.get(i).substring(0,j) + c +res_new.get(i).substring(j));
            }
        }
        return res;

    }

    public static void main(String[] args) {
//        测试
        String str = "ABCD";
        ArrayList<String> res = new _9_5全排列().getPermutation1(str,str.length()-1);
//        ArrayList<String> res = new _9_5全排列().getPermutation0("ABCD");
        System.out.println(res.size());
        System.out.println(res);
    }
}
