package lQofficeWebsite;

/**
 * @author Awacky
 * @date 2020/1/31 21:42
 * 希尔排序
 */
public class _20_1_31_shellSort {
    public static void main(String[] args) {
        int[] arr = {9,8,5,6,7,4,3,2,1};
        shellSort(arr);


    }
    private static void shellSort(int[] arr){
        for(int interval = arr.length/2;interval >0;interval = interval/2){
            for (int i = interval;i<arr.length;i++){
                int target = arr[i];
                int j = i - interval;
                while (j>-1&&target<arr[j]){
                    arr[j+interval]=arr[j];
                    j-=interval;
                }
                arr[j+interval] = target;
            }
        }
        for (int i : arr
             ) {
            System.out.println(i);

        }
    }
}
