package lQofficeWebsite;

/**
 * @author Awacky
 * @date 2020/1/28 20:20
// */
//求n的阶乘
//    设计递归的步骤
//    1、找重复
//    2、找变化（变化的量应该作为参数）
//    3、找边界
public class _20_1_28_1factorial {
    public static void main(String[] args) {
        int x = 10;
//        System.out.println(factorial(x));
        System.out.println(factorialArr(new int[]{1,2,3,4,5},0));
        System.out.println(fli(5));
        System.out.println(gcd(319,377));

    }
    public static int factorial(int n){
        if (n == 1){
            return 1;
        }else {
            return n*factorial(n-1);
        }
    }
//  使用递归来求数组里面元素的和
    static int factorialArr(int[]arr ,int begin){
        if (begin==arr.length-1){
            return arr[begin];
        }
        return arr[begin]+factorialArr(arr,begin+1);

    }

//    翻转字符串
//    斐波那菲数列(各求各的)（另一种是先纵后横）
    static int fli(int n){
        if (n==1||n==2){
            return 1;
        }
        return fli(n-1)+fli(n-2);
    }
//    最大公约数(这个使用的是欧几里得的辗转相除法)
    static int gcd(int m ,int n){
        if (n==0)
            return m ;
        return gcd(n,m%n);
    }

}
