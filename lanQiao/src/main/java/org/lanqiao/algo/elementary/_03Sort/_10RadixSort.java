package org.lanqiao.algo.elementary._03Sort;

/**
 * @author Awacky
 * @date 2020/2/15 20:53
 */

import org.lanqiao.algo.util.Util;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 基数排序<br />
 *
 * 思路：是一种特殊的桶排序<br />
 *      初始化0-9号十个桶，<br>
 *      一、按个位数字，将关键字入桶，入完后，依次遍历10个桶，按检出顺序回填到数组中，如<br />
 *      321 322 331  500 423 476 926<br>
 *      0:500
 *      1:321 331
 *      2:322
 *      3:423
 *      4:无
 *      5:无
 *      6:476 926<br>
 *      检出后数组序列为： 500 321 331 423 476 926，然后取十位数字重复过程一，得到<br>
 *      0:500
 *      1:无
 *      2:321 423 926
 *      3:331
 *      4:无
 *      5:无
 *      7:476 <br>
 *      检出后数组序列为： 500 321 423 926 331 476，然后取百位数字重复过程一，得到<br>
 *      0:无
 *      1:无
 *      2:无
 *      3:321 331
 *      4:423 476
 *      5:500
 *      9:926 <br>
 *      检出后数组序列为： 321 331 423 476 500 926，已然有序<br>
 *        但是我们应该继续入桶，不过因为再高位全部是0了，这些元素会按顺序全部进入0号桶，这时0号桶的size==数组的size，这时结束标志<br>
 *      最后再回填到数组，数组就是升序排列的了<br />
 *
 * 时间复杂度： 假设最大的数有k位，就要进行k次入桶和回填，每次入桶和回填是线性的，所以整体复杂度为kN,
 * 其中k为最大数的10进制位数<br />
 * 空间复杂度：桶是10个，10个桶里面存n个元素，这些空间都是额外开辟的，所以额外的空间是N+k，k是进制<br />
 * 肯定是非原址的了<br />
 * 稳定性：假设有相等的元素，它们会次第入桶，次第回数组，不会交叉，所以是稳定的<br />
 *
 * @author zhengwei lastmodified 2017年3月14日
 *
 */
public class _10RadixSort {
//        10个桶，每个桶所装的数的个数不定，适合用数组加arraylist
        private static ArrayList[] bucket = new ArrayList[10];

//        初始化桶
    static {
        for (int i = 0;i < bucket.length;i++){
            bucket[i] = new ArrayList();
        }
}

    private static void sort(int[] arr , int d){
//      全部入桶
        for(int i = 0;i < arr.length;i++){
            putInBucket(arr[i], Util.getDigitOn(arr[i],d));
        }

//        每个桶中的元素依次压入数组
        int k = 0;
        for (int j = 0;j < bucket.length; j++){
            for (Object m : bucket[j]){
                arr[k++] = (Integer)m;
            }
        }

//        记得清空数组
        clearAll();
    }

//    判断位数，进行压入
    private static void putInBucket(int data , int digitOn){
        switch (digitOn){
            case 0:
                bucket[0].add(data);
                break;
            case 1:
                bucket[1].add(data);
                break;
            case 2:
                bucket[2].add(data);
                break;
            case 3:
                bucket[3].add(data);
                break;
            case 4:
                bucket[4].add(data);
                break;
            case 5:
                bucket[5].add(data);
                break;
            case 6:
                bucket[6].add(data);
                break;
            case 7:
                bucket[7].add(data);
                break;
            case 8:
                bucket[8].add(data);
                break;
            case 9:
                bucket[9].add(data);
                break;
        }
    }

//    清空操作
    private static void clearAll(){
//        对每个桶调用clear方法进行操作
        for(ArrayList b : bucket){
            b.clear();
        }
    }

    public static void sort(int[] arr){
        int d = 1;   //入桶的依据为1
        int max = Util.maxOf(arr);  //获得最大的值

        int dNum = 1;   //最大数据位的位数
        while (max/10 != 0){
            dNum ++;
            max = max/10; //max/=10
        }
        while (d <= dNum){
//           依据第二个参数入桶和出桶
            sort(arr,d++);
        }
    }

    public static void main(String[] args) {
        int arr[] = {2,1,73,93,43,14,1,65,28,39};
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println("整理后-----------"+Arrays.toString(arr));
    }
}
