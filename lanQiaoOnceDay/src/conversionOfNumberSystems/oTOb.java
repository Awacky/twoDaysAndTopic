package conversionOfNumberSystems;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Awacky
 * @date 2020/1/19 13:16
 */
//十进制转化成二进制,有点小bug，遇到零没办法
public class oTOb {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
//        进行处理
//        arraylist  动态数组，便于后面取出来数据
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (true){
            if (number==0){
//                加个if语句
                if (arrayList.size()==0){
                    arrayList.add(0);
                }
                break;
            }
            if (number%2==1){
                arrayList.add(1);
            }else {
                arrayList.add(0);
            }
            number= number/2;
        }
        for (int i = arrayList.size()-1;i>=0;i--){
            System.out.print(arrayList.get(i));
        }
    }
}
