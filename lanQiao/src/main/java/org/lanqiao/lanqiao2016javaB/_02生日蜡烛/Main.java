package org.lanqiao.lanqiao2016javaB._02生日蜡烛;

/**
 * @author Awacky
 * @date 2020/5/24 13:46
 */
//2
public class Main {
//     计算生日蜡烛，暴力解法
public static void main(String[] args) {
//    假设从1岁就开始了。
    for (int i = 1;i < 1000;i++){
        int count = 2;
            if (check(i,count)){
                System.out.println(i);
                break;
            }
        }
    }
    private static boolean check(int i,int count){
    if (i == 236)return true;
    if (i > 236)return false;
    return check(i+count,count++);
}
}
