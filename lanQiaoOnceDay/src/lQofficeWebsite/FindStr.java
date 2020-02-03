package lQofficeWebsite;

/**
 * @author Awacky
 * @date 2020/2/3 21:48
 */
//在有空字符串的有序字符串数组中查找给定字符串
public class FindStr {
    public static void main(String[] args) {
        String[] str = {"a","","ac","ad","b","","ba"};
        int res = findStr(str,"b");
        System.out.println(res);
    }
    private static int findStr(String[] str,String p){
        int begin = 0 ;
        int end = str.length - 1;
        while (begin <= end){
            int indexOfHid = begin + ((end-begin)>>1);
            while (str[indexOfHid].equals(""))
                indexOfHid++;
            if(indexOfHid>end){
                return -1;
            }
            if(str[indexOfHid].compareTo(p)>0){
                end=indexOfHid-1;
            }else if (str[indexOfHid].compareTo(p)<0){
                begin=indexOfHid+1;
            }else {
                return indexOfHid;
            }
        }
        return -1;
    }
}
