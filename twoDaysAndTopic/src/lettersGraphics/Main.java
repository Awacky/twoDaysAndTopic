/**
 * 
 */
package lettersGraphics;

import java.util.Scanner;

/**
 * @author Awacky
 * @date 2019/12/27 19:38
 */
public class Main {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        int n = 0;
        int m = 0;
        n = input.nextInt();
        m = input.nextInt();
		int[][] array1 = new int[n][m];
//		可以利用程序给数组里面赋值
        char[] array2 = new char[26];
        for (int i = 0; i < 26; i++) {
            array2[i]=(char) ('A'+i);
        }
        for (int i =0;i<n;i++){
            function1(i,m,array1,array2);
            function2(i,m,array1,array2);
        }
        for (int i =0;i<n;i++){
            for (int j =0;j<m;j++){
                System.out.print((char) array1[i][j]);
            }
            System.out.println();
        }

    }
    public static void function1(int i, int m, int array1[][],char array2[]){
        int temp =0 ;
        for (int j =i ;j<m;j++){
            array1[i][j] = array2[temp];
            temp++;
        }
    }
    public static void function2(int i, int m, int array1[][],char array2[]){
        int temp = 1;
        for (int j = i-1;j>=0;j--){
            array1[i][j] = array2[temp];
            temp++;
        }
    }
}

