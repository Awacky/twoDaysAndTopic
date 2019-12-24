package SequenceSum;

import java.util.Scanner;

/**
 * @Author Awacky
 * Date on 2019/12/23  下午9:25
 */
//直接套用公式就可以了
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long n = input.nextLong();
        if (n==1){
            System.out.println(1);
        }else {
            System.out.println((long)(n+1)*n/2);
        }
    }
}
