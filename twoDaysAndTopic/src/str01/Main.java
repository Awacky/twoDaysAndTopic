/**
 * 
 */
package str01;

/**
 * @author Awacky
 *
 * 2020-1-3
 */
//��Ŀ����
//��������
//���ڳ���Ϊ5λ��һ��01����ÿһλ��������0��1��һ����32�ֿ��ܡ����ǵ�ǰ�����ǣ�
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
//�밴��С�����˳�������32��01����
//��ʮ����ת���ɶ�����
//ת���취�ǳ���ȡ��  ������
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
