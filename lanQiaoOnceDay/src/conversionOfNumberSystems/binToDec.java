package conversionOfNumberSystems;

import java.util.Scanner;

/**
 * @author Awacky
 * @date 2020/1/21 0:55
 */
//二进制转化成10进制
//    所有的反转换都是大同小异
public class binToDec {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String bin = input.next();
        int number = 0 ;
        int temp = bin.length()-1;
        for (int i =0;i<bin.length();i++){
//            第一步写的时候，存在缺陷，应该是第一位的值乘上总长度减一与2的幂值
//            number+= (Math.pow(2,i)*(bin.charAt(i)-48));
            number += (Math.pow(2,temp)*(bin.charAt(i)-48));
            temp--;
        }
        System.out.println(number);
    }
}
