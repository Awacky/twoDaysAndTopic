package conversionOfNumberSystems;

import java.util.Scanner;

/**
 * @author Awacky
 * @date 2020/1/21 1:39
 */
//10进制转成16进制
public class hexToDec {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dec = input.nextInt();
        String str = "";
        while (true){
            if (dec<16){
                switch (dec){
                    case 0:
                        str += "0";
                        break;
                    case 1:
                        str += "1";
                        break;
                    case 2:
                        str += "2";
                        break;
                    case 3:
                        str += "3";
                        break;
                    case 4:
                        str += "4";
                        break;
                    case 5:
                        str += "5";
                        break;
                    case 6:
                        str += "6";
                        break;
                    case 7:
                        str += "7";
                        break;
                    case 8:
                        str += "8";
                        break;
                    case 9:
                        str += "9";
                        break;
                    case 10:
                        str += "A";
                        break;
                    case 11:
                        str += "B";
                        break;
                    case 12:
                        str += "C";
                        break;
                    case 13:
                        str += "D";
                        break;
                    case 14:
                        str += "E";
                        break;
                    case 15:
                        str += "F";
                        break;
                    default:
                        break;
                }

            }
        }
    }
}
