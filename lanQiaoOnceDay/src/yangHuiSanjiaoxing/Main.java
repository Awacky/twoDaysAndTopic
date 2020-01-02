package yangHuiSanjiaoxing;

import java.util.Scanner;

/**
 * @Author Awacky
 * Date on 2019/12/30  下午10:41
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max = input.nextInt();
         int NMAX = max;

        // allocate triangular array
        int[][] odds = new int[NMAX + 1][];
        for (int n = 0; n <= NMAX; n++)
            odds[n] = new int[n + 1];

        // fill triangular array
        for (int n = 0; n < odds.length; n++)
            for (int k = 0; k < odds[n].length; k++)
            {
                /*
                 * compute binomial coefficient n*(n-1)*(n-2)*...*(n-k+1)/(1*2*3*...*k)
                 */
                int lotteryOdds = 1;
                for (int i = 1; i <= k; i++)
                    lotteryOdds = lotteryOdds * (n - i + 1) / i;

                odds[n][k] = lotteryOdds;
            }

        // print triangular array
//        for (int[] row : odds)
//        {
//            for (int odd : row)
//                System.out.printf("%4d", odd);
//            System.out.println();
//        }
        for (int i =0;i<odds.length-1;i++){
            for (int j = 0;j<odds[i].length;j++){
                System.out.print(odds[i][j]+" ");
            }
            System.out.println();
        }
    }
}
