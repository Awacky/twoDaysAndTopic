package util;

/**
 * @author Awacky
 * @date 2020/2/4 15:03
 */
public class Util {
    public static int[] swap(int[] arr,int sp ,int bigger){
        int temp = arr[sp];
        arr[sp] = arr[bigger];
        arr[bigger] = temp;
        return arr;
    }
    public static void print(int[] arr){
        for (int i:arr
             ) {
            System.out.println(i);
        }
    }
    public static int[] copy (int[] arr1 , int length){
        int[] arr2 =  new int[length];
        for (int i =0;i<arr1.length;i++){
            arr2[i] = arr1[i];
        }
        return arr2;
    }
}
