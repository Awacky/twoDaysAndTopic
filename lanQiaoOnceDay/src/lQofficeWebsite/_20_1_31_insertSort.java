package lQofficeWebsite;

/**
 * @author Awacky
 * @date 2020/1/31 22:14
 * 插入排序
 */
public class _20_1_31_insertSort {
    public static  void main(String[] args) {
        int[] data = {3,9,6,1,2};
        insertionSort(data);

    }

    //    private static void insertSort(int[] data){
//        for (int index = 1;index < data.length;index++){
//            int key = data[index];
//            int position = index;
//            while (position > 0&&data[position-1].c)
//        }
//    }
    public static void insertionSort(int[] data){
        for (int index = 1;index < data.length; index++){
            int key = data[index];
            int position = index;
            while (position > 0 && (data[position-1]-key) > 0){
                data[position]  = data[position-1];
                position--;
            }
            data[position] = key;
        }
        for (int value : data
             ) {
            System.out.println(value);

        }
    }
}
