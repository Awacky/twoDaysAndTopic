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
//����һ��������n�����n!��ֵ��
//����n!=1*2*3*��*n��
//�㷨����
//n!���ܴܺ󣬶�������ܱ�ʾ��������Χ���ޣ���Ҫʹ�ø߾��ȼ���ķ�����ʹ��һ������A����ʾһ��������a��A[0]��ʾa�ĸ�λ��A[1]��ʾa��ʮλ���������ơ�
//��a����һ������k��Ϊ������A��ÿһ��Ԫ�ض�����k����ע�⴦����Ӧ�Ľ�λ��
//���Ƚ�a��Ϊ1��Ȼ���2����3�����˵�nʱ�����õ���n!��ֵ��


//ʹ��java�Ĵ���ֵ+�ݹ������
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
//	�ݹ麯��
	public static BigInteger  factorial(int n){
	    if (n == 1) {
	        return BigInteger.valueOf(1);
	    } else {
	        return factorial(n - 1).multiply(BigInteger.valueOf(n));
	    }

	}

}
