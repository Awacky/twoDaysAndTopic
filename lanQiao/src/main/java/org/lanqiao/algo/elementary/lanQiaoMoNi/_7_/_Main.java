package org.lanqiao.algo.elementary.lanQiaoMoNi._7_;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Awacky
 * @date 2020/3/10 22:12
 */
//题目种草
//小明有一块空地，他将这块空地划分为 n 行 m 列的小块，每行和每列的长度都为 1。
//        　　小明选了其中的一些小块空地，种上了草，其他小块仍然保持是空地。
//        　　这些草长得很快，每个月，草都会向外长出一些，如果一个小块种了草，则它将向自己的上、下、左、右四小块空地扩展，这四小块空地都将变为有草的小块。
//        　　请告诉小明，k 个月后空地上哪些地方有草。
//        输入格式
//        　　输入的第一行包含两个整数 n, m。
//        　　接下来 n 行，每行包含 m 个字母，表示初始的空地状态，字母之间没有空格。如果为小数点，表示为空地，如果字母为 g，表示种了草。
//        　　接下来包含一个整数 k。
//        输出格式
//        　　输出 n 行，每行包含 m 个字母，表示 k 个月后空地的状态。如果为小数点，表示为空地，如果字母为 g，表示长了草。
//        样例输入
//        4 5
//        .g...
//        .....
//        ..g..
//        .....
//        2
//        样例输出
//        gggg.
//        gggg.
//        ggggg
//        .ggg.
//        评测用例规模与约定
//        　　对于 30% 的评测用例，2 <= n, m <= 20。
//        　　对于 70% 的评测用例，2 <= n, m <= 100。
//        　　对于所有评测用例，2 <= n, m <= 1000，1 <= k <= 1000。
public class _Main {
    public static ArrayList<Integer> row = new ArrayList<Integer>();
    public static ArrayList<Integer> col = new  ArrayList<Integer>();;
    public static int x = 0;
    public static int y = 0;
    public static char chr = 'g';

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        char[][] caidi = new char[n][m];
        String[] str = new String[n];
        for(int i = 0;i < n;i++){

            str[i] = input.next();
        }
        for(int i = 0;i < n;i++){
            for(int j = 0;j < m ;j++){
                caidi[i][j] = str[i].charAt(j);
            }
        }
//		几个月后菜地的变化
        int k = input.nextInt();
        findg(caidi,n,m);
        growg(k,m,n);
//		开始操作
        for(int i = 0;i < row.size();i++){
            for(int j = 0; j < col.size();j++){
                caidi[row.get(i)][j] = 'g';
            }
        }
        for(int i = 0;i < n;i++){
            for(int j = 0;j < m;j++){
                System.out.print(caidi[i][j]);
            }
            System.out.println();
        }

    }

    //	查找g在哪
    public static void findg(char[][] caidi,int n,int m){
        for(int i = 0;i < n;i++){
            for(int j = 0;j < m;j++){
                if(caidi[i][j] == chr){

                    row.add( i);
                    col.add( j);
                }
            }
        }
    }
    //	生长
    public static void growg(int k ,int m,int n){
        for(int i =0;i < k;i++){
//			改变上
            int j = 0;
            for(j = 0;j<row.size()||j<col.size();j++){
//				左
                if(row.get(j) > 0 && row.get(j) < n - 1){
                    row.add(row.get(j) -1);
                    col.add(col.get(j));
                }
//				右
                if(row.get(j) > 0 && row.get(j) < n - 1){
                    row.add(row.get(j) +1);
                    col.add(col.get(j));
                }
//				上
                if(col.get(j) > 0 && col.get(j) < m - 1){
                    row.add(row.get(j));
                    col.add(col.get(j)-1);
                }
//				下
                if(row.get(j) > 0 && row.get(j) < n - 1){
                    row.add(row.get(j) );
                    col.add(col.get(j)+1);
                }
            }
        }
    }

}
