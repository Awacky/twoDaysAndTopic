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
        printHanoiTower(5,"A","B","C");

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

//      插入排序改成递归（把前面部分排好顺序）
    static void insertSort(int[] arr, int k){
        if(k ==0){
            return;
        }
        insertSort(arr,k-1);
        int x = arr[k];
        int index = k -1 ;
        while (x<arr[index]){
            arr[index+1] = arr[index];
            index --;
        }
        arr[index] = x;
    }

//    递归实现汉诺塔（求移动了多少步骤）
    static void  printHanoiTower(int N ,String from, String to, String help){
        if(N==1){
            System.out.println("move"+N+"from"+from+"to"+to);
            return;
        }
//        先把n-1个盘子移动到辅助空间去
        printHanoiTower(N -1,from,help,to);
//        N可以顺利到达target
        System.out.println("move"+N+"from"+from+"to"+to);
//        让n-1从辅助空间到原空间去
        printHanoiTower(N-1,help,to,from);
    }

}
