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
//��������
//����һ������Ϊn�����У���������а���С�����˳�����С�1<=n<=200
//�����ʽ
//��һ��Ϊһ������n��
//�ڶ��а���n��������Ϊ�����������ÿ�������ľ���ֵС��10000��
//�����ʽ
//���һ�У�����С�����˳��������������С�

//����취��ð������
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
		
//		�����㷨
//		��һ����������һ�������ų���
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
