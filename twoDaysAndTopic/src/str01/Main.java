/**
 * 
 */
package str01;

/**
 * @author Awacky
 *
 * 2020-1-3
 */
//题目描述
//问题描述
//对于长度为5位的一个01串，每一位都可能是0或1，一共有32种可能。它们的前几个是：
//
//00000
//
//00001
//
//00010
//
//00011
//
//00100
//
//请按从小到大的顺序输出这32种01串。
//把十进制转化成二进制
//转化办法是除二取余  （反序）
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = new int[5]; 
		for (int i = 0; i < 32; i++) {
			int index = 4;
			int temp= i;
			while (temp >= 1) {
				array1[index--] = temp % 2;
				temp = temp /2;
			}
			for (int j = 0; j < array1.length; j++) {
				System.out.print(array1[j]);
			}
			System.out.println();
		}

	}

}
