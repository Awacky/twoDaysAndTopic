/**
 * 
 */
package hexBecomeBin;

import java.util.Scanner;

/**
 * @author Awacky
 *
 * 2020-1-6
 */
//给定n个十六进制正整数，输出它们对应的八进制数。
//按照官网给的提示，把十六进制转化成二进制。

//1、我的思路是，先转化成十进制，再转八进制
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		double[] array1 = new double[num];
		for (int j = 0; j < num; j++) {
			String hex = input.next();
			
			char[] arr = hex.toCharArray();
			int length = arr.length;
//			因为数字范围可能很大，所以需要double型
			double sum =0;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i]-48>9) {
					switch (arr[i]) {
					case 'A':
//						lenth-i表示它是第多少位数，-1表示它的值
						sum += 10*Math.pow(16, length-i-1);
						break;
					case 'B':
						sum += 11*Math.pow(16, length-i-1);
						break;
					case 'C':
						sum += 12*Math.pow(16, length-i-1);
						break;
					case 'D':
						sum += 13*Math.pow(16, length-i-1);
						break;
					case 'E':
						sum += 14*Math.pow(16, length-i-1);
						break;
					case 'F':
						sum += 15*Math.pow(16, length-i-1);
						break;
					default:
						break;
					}
					
				}else {
//					这块这个数字要减去48才是十进制中要找的哪一个
					sum+= (arr[i]-48)*Math.pow(16, length-i-1);
				}
			}
			array1[j] = sum;

		}
////		将十进制处理成八进制，采用取余反序法
//		for (int i = 0; i < array1.length; i++) {
//			double oct = array1[i];
//			int j =0;
////			new 一个数组  存放  值
//			double temp = oct;
//			while (temp>=8) {
//				j++;
//				temp = temp / 8;
//			}
//			double[] arry2 = new double[j+1];
//			for (int k = 0; k < arry2.length; k++) {
//				if (oct>=8) {
//					arry2[k] = oct%8;
//					oct = oct / 8;
//				}else {
//					arry2[k] = oct;
//					break;
//				}
//				
//				
//			}
//			for (int k2 = j; k2 >=0; k2--) {
//				System.out.print(arry2[k2]);
//			}
//			System.out.println();
//
//		}

		
	}

}
