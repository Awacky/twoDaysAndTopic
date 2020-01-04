/**
 * 
 */
package decBecomehex;

import java.util.Scanner;

/**
 * @author Awacky
 *
 * 2020-1-4
 */
//十六进制数是在程序设计时经常要使用到的一种整数的表示方式。它有0,1,2,3,4,5,6,7,8,9,A,B,C,D,E,F共16个符号，分别表示十进制数的0至15。十六进制的计数方法是满16进1，所以十进制数16在十六进制中是10，而十进制的17在十六进制中是11，以此类推，十进制的30在十六进制中是1E。
//给出一个非负整数，将它表示成十六进制的形式。

//按除16取余  倒数
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int temp = input.nextInt();
		System.out.printf("%X", temp);
	}
}
