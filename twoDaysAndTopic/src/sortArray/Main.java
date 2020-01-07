/**
 * 
 */
package sortArray;

import java.util.Scanner;

/**
 * @author Awacky
 *
 * 2020-1-7
 */
//问题描述
//给定一个长度为n的数列，将这个数列按从小到大的顺序排列。1<=n<=200
//输入格式
//第一行为一个整数n。
//第二行包含n个整数，为待排序的数，每个整数的绝对值小于10000。
//输出格式
//输出一行，按从小到大的顺序输出排序后的数列。

//解决办法，冒泡排序
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int ranage = input.nextInt();
		int[] array1 = new int[ranage];
		for (int i = 0; i < ranage; i++) {
			array1[i] = input.nextInt();
		}
		
//		排序算法
//		第一遍排序把最后一个可以排出来
		for (int i = 0; i < array1.length-1; i++) {
			for (int j = 0; j < array1.length-1-i; j++) {
				if(array1[j]>array1[j+1]){
					int temp =array1[j];
					array1[j] = array1[j+1];
					array1[j+1] = temp;
				}
			}
		}
		for (int i : array1) {
			System.out.print(i);
			System.out.print(" ");
		}

	}

}
