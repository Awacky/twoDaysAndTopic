/**
 * 
 */
package palindromicNubmer;

/**
 * @author Awacky
 *
 * 2020-1-2
 */
//题目描述：1221是一个非常特殊的数，它从左边读和从右边读是一样的，编程求所有这样的四位十进制数。
//这就很简单嘛
//确定 i k k i就完了
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <10 ; i++) {
			for(int j =0;j<10;j++){
				System.out.println(i*1000+j*100+j*10+i);
			}
		}
		

	}

}
