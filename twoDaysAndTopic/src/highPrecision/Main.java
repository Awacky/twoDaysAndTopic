/**
 * 
 */
package highPrecision;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author Awacky
 *
 * 2020-1-9
 */
//����a��b���Ƚϴ����Բ���ֱ��ʹ�������еı�׼�����������洢�������������⣬һ��ʹ������������
//����һ������A��A[0]���ڴ洢a�ĸ�λ��A[1]���ڴ洢a��ʮλ���������ơ�ͬ��������һ������B���洢b��
//����c = a + b��ʱ�����Ƚ�A[0]��B[0]��ӣ�����н�λ��������ѽ�λ�����͵�ʮλ��������r���Ѻ͵ĸ�λ������C[0]����C[0]����(A[0]+B[0])%10��Ȼ�����A[1]��B[1]��ӣ���ʱ��Ӧ����λ��������ֵrҲ����������C[1]Ӧ����A[1]��B[1]��r�������ĺͣ�������н�λ���������Կɽ��µĽ�λ���뵽r�У��͵ĸ�λ�浽C[1]�С��������ƣ��������C������λ��
//���C������ɡ�


//
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		BigInteger b1 = input.nextBigInteger();
		BigInteger b2 = input.nextBigInteger();
		BigInteger b3 = b1.add(b2);
		System.out.println(b3);

	}

}
