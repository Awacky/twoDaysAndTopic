/**
 * 
 */
package maxMinSum;

import java.util.Scanner;

/**
 * @author Awacky
 *
 * 2019-12-28
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int range = input.nextInt();//����ֵ�÷�Χ
		int max = -100001;  //���ֵ
		int min = -100001;  //��Сֵ
		int sum=0;  //�ܺ�
		int[] array1 = new int[range];
		for(int i = 0 ;i<range;i++){
			array1[i]=input.nextInt();
			if(i!=0){
				if (max<array1[i]) {
					max=array1[i];
				}
				if (min>array1[i]) {
					min = array1[i];
				}
			}else {
				max = array1[0];
				min = array1[0];
			}
			sum+=array1[i];
		}
		System.out.println(max);
		System.out.println(min);
		System.out.println(sum);
	}

}
