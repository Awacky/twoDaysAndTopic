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
//����n��ʮ��������������������Ƕ�Ӧ�İ˽�������
//���չ���������ʾ����ʮ������ת���ɶ����ơ�

//1���ҵ�˼·�ǣ���ת����ʮ���ƣ���ת�˽���
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
//			��Ϊ���ַ�Χ���ܴܺ�������Ҫdouble��
			double sum =0;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i]-48>9) {
					switch (arr[i]) {
					case 'A':
//						lenth-i��ʾ���ǵڶ���λ����-1��ʾ����ֵ
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
//					����������Ҫ��ȥ48����ʮ������Ҫ�ҵ���һ��
					sum+= (arr[i]-48)*Math.pow(16, length-i-1);
				}
			}
			array1[j] = sum;

		}
////		��ʮ���ƴ���ɰ˽��ƣ�����ȡ�෴��
//		for (int i = 0; i < array1.length; i++) {
//			double oct = array1[i];
//			int j =0;
////			new һ������  ���  ֵ
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
