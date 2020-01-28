package lQofficeWebsite;


import com.sun.org.apache.xpath.internal.operations.String;

/**
 * @author Awacky
 * @date 2020/1/25 3:48
 */
//题目描述：一串数，只有一个数是出现1次，其他的都是出现k次。找出这个出现一次的数。

//   我的思路：动态数组  插入。。。

//    抄郑末老师的算法
public class FindUniqueNumber {
    public static void main(String[] args) {

            int[] arr = {2,2,2,9,7,7,7,3,3,3,6,6,6,0,0,0};
            int len = arr.length;
            char[][] KRadix = new char[len][];
            int k = 3;

            int makLen = 0;
//        转成k进制字符数组
//        对于每个数字
            for(int i = 0;i<len;i++){
//            求每个数字的三进制字符串并翻转，然后转为字符数组
                KRadix[i] = new StringBuilder(Integer.toString(arr[i],k)).reverse().toString().toCharArray();
                if (KRadix.length > makLen){
                    makLen = KRadix[i].length;
                }
            }
//        不进位加法
            int[] resArr = new int[makLen];
            for(int i =0;i<len;i++){
                for (int j = 0;j<makLen;j++){
                    if (j>=KRadix[i].length)
                        resArr[j]+= 0;
                    else
                        resArr[j] += (KRadix[i][j] - '0');
                }
            }

            int res = 0;
            for (int i =0;i<makLen;i++){
                res+=(resArr[i]%k)*(int)(Math.pow(k,i));
            }
            System.out.println(res);
        }
    }

