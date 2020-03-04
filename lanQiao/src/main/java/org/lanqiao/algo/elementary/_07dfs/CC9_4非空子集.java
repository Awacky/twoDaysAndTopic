package org.lanqiao.algo.elementary._07dfs;

import org.lanqiao.algo.elementary._06_math.Case11_NExponent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Awacky
 * @date 2020/3/2 23:33
 */
/*题目描述
* 编写一个方法，返回某集合的所有子集
* 给定一个int数组A和数组大小int n，请返回A的所有非空子集
* 保证A的元素个数小于等于20，且元素互异
*
* 个子集内部从大到小排序，子集之间字典逆序排序*/
public class CC9_4非空子集 {
//    迭代法
    /**
     * @Description: 迭代法
     * @Param: n
     * @return: Set<String>
     */
//    public Set<String> getList(int n){
//
//    }
    public Set<Set<Integer>> getSubsets3(int[] A,int n){
        return getSubsets3Core(A,n,n-1);
    }
    /**
     * @Description: 增量构造法
     * @Param: A
     * @return:
     */
    private Set<Set<Integer>> getSubsets3Core(int[] A,int n,int cur){

//        出口
        Set<Set<Integer>> newSet = new HashSet<>();
        if (cur == 0){
            Set<Integer> nil = new HashSet<>();
            Set<Integer> first = new HashSet<>();
            first.add(A[0]);
            newSet.add(nil);
            newSet.add(first);
            return newSet;
        }
        Set<Set<Integer>> oldSet = getSubsets3Core(A,n,cur -1);

        for (Set<Integer> s : oldSet){
//            对于每一个元素，cur这个元素可以加进去也可以不加进去
            newSet.add(s);//保留原样
//            克隆
            Set<Integer> clone = (Set<Integer>)((HashSet) s).clone();
            clone.add(A[cur]);//添加当前元素
            newSet.add(clone);
        }
        return newSet;
    }

    /*逐步生成迭代大法*/
    public Set<Set<Integer>> getSubsets2(int[] A,int n){
        Set<Set<Integer>> res = new HashSet<>();
        res.add(new HashSet<>());//初始化为空元素
//        从第一个元素处理
        for (int i = 0;i < n;i++){
            Set<Set<Integer>> res_new = new HashSet<>();    //新建一个大集合
            res_new.addAll(res);//把原来集合中的每个子集都加入到新集合中
//            遍历之前的集合
            for (Set s: res){
                Set clone = (Set)((HashSet)s).clone();
                clone.add(A[i]);//把当前元素加进去
                res_new.add(clone);//把克隆的子集加入到大集合中
            }
            res = res_new;
        }
        return res;
    }

//    二进制解法，如果算上空集的话 Math.pow(2,arr.length)-1
//    列表是集合的子类
//    元素是正序，检查从大小，从大排序。
    public ArrayList<ArrayList<Integer>> getSubsets(int[] A,int n){
        Arrays.sort(A);//正序排序
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();//大集合
        for (int i = Case11_NExponent.ex(2,n)-1;i > 0;i--){
            ArrayList<Integer> ints = new ArrayList<>();//对每一个i建立一个
            for (int j = n -1;j >=0;j--){//检查那个位上的二进制为1
                if (((i >> j) & 1) == 1){
                    ints.add(A[j]);
                }
            }
            res.add(ints);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] A = {1,2};
        CC9_4非空子集 obj = new CC9_4非空子集();
        Set<Set<Integer>> subset3 = obj.getSubsets2(A, A.length);
        ArrayList<ArrayList<Integer>> subsets = obj.getSubsets(A, A.length);
        System.out.println(subsets);
    }
}
