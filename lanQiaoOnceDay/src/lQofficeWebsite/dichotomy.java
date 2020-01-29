package lQofficeWebsite;

/**
 * @author Awacky
 * @date 2020/1/29 16:15
 */
//二分查找
public class dichotomy {
    public static void main(String[] args) {

    }
//    递归实现二分查找
    public static int binarySearch1(int[] arr , int low , int high,int key){
        if (low > high)
            return -1;
        int mid = low + ((high - low) >> 1); //（low+high）>>>1;//防止溢出，移位更高效
        int midval = arr[mid];
        if (midval < key)
            return binarySearch1(arr,mid+1,high,key);
        else if (mid > key)
            return binarySearch1(arr,low,high-1,key);
        else
            return mid; //key found
    }
}
