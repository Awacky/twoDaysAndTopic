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
//ʮ�����������ڳ������ʱ����Ҫʹ�õ���һ�������ı�ʾ��ʽ������0,1,2,3,4,5,6,7,8,9,A,B,C,D,E,F��16�����ţ��ֱ��ʾʮ��������0��15��ʮ�����Ƶļ�����������16��1������ʮ������16��ʮ����������10����ʮ���Ƶ�17��ʮ����������11���Դ����ƣ�ʮ���Ƶ�30��ʮ����������1E��
//����һ���Ǹ�������������ʾ��ʮ�����Ƶ���ʽ��

//����16ȡ��  ����
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
