/**
 * 
 */
package hexBecomeDec;

import java.util.Scanner;

/**
 * @author Awacky
 *
 * 2020-1-5
 */
//�Ӽ�������һ��������8λ������ʮ���������ַ���������ת��Ϊ����ʮ�������������
//ע��ʮ���������е�10~15�ֱ��ô�д��Ӣ����ĸA��B��C��D��E��F��ʾ��

//�ַ��Ĳ��,Ȼ����дƥ��

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String hex = input.next();
		char[] arr = hex.toCharArray();
		int len = arr.length;
		 long sum = 0;
		for (int i = 0; i < len; i++) {
			
				if ((int) arr[i] - 48 > 9) {
					if (arr[i] == 'A')
						                     sum += 10 * Math.pow(16, len - i - 1);
						                 else if (arr[i] == 'B')
						                     sum += 11 * Math.pow(16, len - i - 1);
						                 else if (arr[i] == 'C')
						                     sum += 12 * Math.pow(16, len - i - 1);
						                 else if (arr[i] == 'D')
						                     sum += 13 * Math.pow(16, len - i - 1);
						                 else if (arr[i] == 'E')
						                     sum += 14 * Math.pow(16, len - i - 1);
						                 else if (arr[i] == 'F')
						                     sum += 15 * Math.pow(16, len - i - 1);
						             } else {
						                 sum += ((int) arr[i] - 48) * Math.pow(16, len - i - 1);
						             }
						         }
						         System.out.println(sum);
						     }
}
