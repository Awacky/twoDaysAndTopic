/**
 * 
 */
package searchInteger;

import java.util.Scanner;

/**
 * @author Awacky
 *
 * 2019-12-29
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int ranage = input.nextInt();
		int[] array1 = new int[ranage];
		for (int i = 0; i < array1.length; i++) {
			array1[i] = input.nextInt();
		}
		int temp = input.nextInt();
//		�ж�ѭ��
		boolean flag = false;
		int i =0;
		while(true){
//			���ж��Ƿ������һ��
			if (i>=array1.length) {
				break;
			}
//			�ж�ֵ�Ƿ����
			if (temp==array1[i]) {
				flag=true;
				break;
			}
			i++;
		}
		if (flag) {
			System.out.println(i+1);
		}else {
			System.out.println(-1);
		}

	}

}
