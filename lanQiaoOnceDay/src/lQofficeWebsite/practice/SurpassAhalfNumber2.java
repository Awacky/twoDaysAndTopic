package lQofficeWebsite.practice;

/**
 * @author Awacky
 * @date 2020/2/6 19:32
 */
//这个是消除法
//    老师讲的大概思路就是，消除不同的，保留相同的，到时候，出现次数最多的那个就是要找的
//    有个问题，最后几个数，就是那几个重复的才可以用，负责没有意义。
//            int[] arr = {1,1,2,2,3,2,4};  比如这个数组，完全就是鸡肋的功能。

public class SurpassAhalfNumber2 {
    public static void slove4(int[] arr){
//        候选数，先定一个候选数
        int candidate = arr[0];
//        出现次数
        int nTimes = 1;
//        扫描数组
        for(int i = 1;i<arr.length;i++){
//           两两不同相减为零，应该把现在的元素出现候选值
            if (nTimes == 0){
                candidate = arr[i];
                nTimes = 1;
                continue;
            }
//            遇到和候选值相同的，次数加一
            if (arr[i] == candidate){
                nTimes++;
            }else {
                nTimes--;
            }
        }
        System.out.println(candidate);

    }
}
