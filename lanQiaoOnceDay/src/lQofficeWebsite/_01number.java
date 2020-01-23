package lQofficeWebsite;

import java.util.Scanner;

/**
 * @author Awacky
 * @date 2020/1/23 22:46
 */
//给一个10进制的数，然后输出二进制中一有多少个
public class _01number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
//        转成二进制
        System.out.println(Integer.toString(number,2));
//        计数器
        int count = 0;
        for (int i = 0;i<32 ;i++){
            if ((number&(1<<i))==(1<<i)){
                count++;
            }
        }
        System.out.println(count);
    }
}
