package lQofficeWebsite.practice;

import util.Util;

/**
 * @author Awacky
 * @date 2020/2/6 14:52
 */
//以尽量高的效率求出一个乱序数组中按数值顺序的第K个元素
//    使用方法，快排的一个特性，每次一遍就找到了主元的位置。
//    缺陷，改变了数组值得位置，如果不用这种方法，
public class SelectK {
//    p是数组的起点，r是数组的终点，k是要找的那个位置
    public static int selectK(int[] arr,int p ,int r ,int k){

            int q = partition(arr,p,r); //查找到的主元的下标
            int qK = q-p+1; //主元是第几个元素
            if (qK==k){
                return arr[q];
            }else if (qK>k){
                return selectK(arr,p,q-1,k);
            }else {
                return selectK(arr,q+1,r,k-qK);

        }

    }

    private static int partition(int[] arr,int p,int r){
        int pivot = arr[p];
        int sp = p+1;
        int bigger = r;
        while (sp <= bigger){
            if (arr[sp] <= pivot){
                sp++;
            }else {
                Util.swap(arr,sp,bigger);
                bigger--;
            }
        }
        Util.swap(arr,p,bigger);
        return bigger;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,12,7,8,9,10};
        System.out.println(selectK(arr,0,10,2));
    }

}
