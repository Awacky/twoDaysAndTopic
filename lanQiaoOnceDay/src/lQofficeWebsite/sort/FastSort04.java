package lQofficeWebsite.sort;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Awacky
 * @date 2020/2/4 21:07
 */
public class FastSort04 {
    public static void main(String[] args) {
        Random ran=new Random();
        int[] array=new int[100];
        for (int i = 0; i <100 ; i++) {
            array[i] = ran.nextInt(100)+1;
        }
        quicksort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void quicksort(int[] array){
        quick(array,0,array.length-1);
    }
    public static void quick(int[] array,int low,int high){
        midThree(array,low,high);
        int par=partion(array,low,high);
        if (par>low+1){
            quick(array,low,par-1);
        }
        if (par<high-1){
            quick(array,par+1,high);
        }

    }

    /*
     *功能描述
     * @author  《Boyou》
     * @Date  下午 8:36  2019/1/10 0010
     * @param [array, low, high]
     * @return void
     * 原理  中左右
     *  即：array[mid]<=array[low]<=array[high]
     */
    public static void midThree(int[] array,int low,int high){
        int mid=(low+high)/2;
     /*   if (array[mid]>array[low]){
            swap(array,low,mid);
        }
        if (array[mid]>array[high]){
            swap(array,mid,high);
        }
        if (array[low]>array[high]){
            swap(array,low,high);
        }*/

        if(array[low]<array[mid]){
            swap(array,low,mid);
        }
        if(array[low]>array[high]){
            swap(array,low,high);
        }
        if(array[mid]>array[high]){
            swap(array,mid,high);
        }

    }
    public static void swap(int[] array ,int low,int rand){
        int tmp=array[low];
        array[low]=array[rand];
        array[rand]=tmp;
    }

    public static int partion(int[] array,int low,int high){
        int tmp=array[low];
        while (low<high){
            while (low<high&&tmp<array[high]){
                high--;
            }
            if (low<high){
                array[low]=array[high];
                low++;
            }else break;

            while (low<high&&tmp>array[low]){
                low++;
            }
            if (low<high){
                array[high]=array[low];
                high--;
            }else break;
        }
        array[low]=tmp;
        return low;
    }
}
