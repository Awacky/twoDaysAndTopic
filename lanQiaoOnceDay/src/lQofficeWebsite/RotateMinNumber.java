package lQofficeWebsite;

/**
 * @author Awacky
 * @date 2020/2/2 19:34
 */
//求旋转数组的最小数字
public class RotateMinNumber {
    static int min(int[] arr){
        int begin = 0;
        int end = arr.length-1;
//        考虑没有这种特殊的旋转
        if(arr[begin] < arr[end])
            return arr[begin];

//        begin和end指向相同的元素，退出，输出右边那个
        while (begin+1 <end){
            int mid = begin + ((end - begin) >> 1);
//            要么在左侧有序，要么在右侧有序
            if(arr[mid] >= arr[begin]){
                //左侧有序
                begin = mid;
            }else {
                end = mid;
            }
        }
        return arr[end];
    }

    public static void main(String[] args) {
        int[] arr = {5,1,2,3,4};
        int res = min(arr);
        System.out.println(res);
    }
}
