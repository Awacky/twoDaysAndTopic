/**
 * 
 */
package factorial;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author Awacky
 *
 * 2020-1-8
 */
//输入一个正整数n，输出n!的值。
//其中n!=1*2*3*…*n。
//算法描述
//n!可能很大，而计算机能表示的整数范围有限，需要使用高精度计算的方法。使用一个数组A来表示一个大整数a，A[0]表示a的个位，A[1]表示a的十位，依次类推。
//将a乘以一个整数k变为将数组A的每一个元素都乘以k，请注意处理相应的进位。
//首先将a设为1，然后乘2，乘3，当乘到n时，即得到了n!的值。


//使用java的大数值+递归来完成
public class Main {

	/**
	 * @param args
	 */
	static BigInteger end = BigInteger.valueOf(1);
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		BigInteger n3 = factorial(n);
		System.out.println(n3);

	}
//	递归函数
	public static BigInteger  factorial(int n){
	    if (n == 1) {
	        return BigInteger.valueOf(1);
	    } else {
	        return factorial(n - 1).multiply(BigInteger.valueOf(n));
	    }

	}

}
