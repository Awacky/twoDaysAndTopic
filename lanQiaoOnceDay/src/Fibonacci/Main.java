package Fibonacci;


/**
 * @Author Awacky
 * Date on 2019/12/22  下午10:47
 */
/*题目描述：
* Fibonacci数列的递推公式为：Fn=Fn-1+Fn-2，其中F1=F2=1。
f3 = 1+1 = 2
* f4 = f3 + f2 = 2+1 = 3
* f5 = f4 + f3 = 5
* f6 = f5 + f4 = f4 + f3 + f2 + f1 =
当n比较大时，Fn也非常大，现在我们想知道，Fn除以10007的余数是多少。
* */
import java.util.Scanner;
public class Main {

        public static void main(String args[]) {
            Scanner scanner=new Scanner(System.in);
            int num=scanner.nextInt();
            int[] a=new int[num+2];
            a[1]=1;
            a[2]=1;
            for(int i=3;i<=num;i++) {
                a[i]=(a[i-1]+a[i-2])%10007;
            }
            System.out.println(a[num]);
        }

    }



