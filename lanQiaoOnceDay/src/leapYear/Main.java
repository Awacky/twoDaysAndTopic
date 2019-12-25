package leapYear;

import java.util.Scanner;

/**
 * @Author Awacky
 * Date on 2019/12/25  上午9:15
 */
//错误原因就是自己把题没有看闰年判断需要满足两个条件其中之一就可以了
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int y = input.nextInt();
        if (y<1990||y>2050){
            System.out.println("no");
        }else {
            if (y%4==0&&y%100!=0||y%400==0){
                System.out.println("yes");
            }else {
                System.out.println("no");
            }
        }
    }
}
