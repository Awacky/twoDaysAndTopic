package lQofficeWebsite.tree;

/**
 * @author Awacky
 * @date 2020/2/9 17:07
 */
public class TreeAndArray {
//    先序遍历
    public static void preOrder(int[] arr,int i){
        if (i >= arr.length){
            return;
        }else {
            System.out.println(arr[i]);  //先输出根节点
//            在输出左子树
            preOrder(arr,2*i+1);
//            输出右子树
            preOrder(arr,2*i+2);
        }
    }
//    中序遍历
    public static void middleOrder(int[] arr,int i){
        if (i >= arr.length){
            return;
        }else {
//            递归输出左子树
            middleOrder(arr,2*i+1);
            System.out.println(arr[i]);  //输出根节点
            middleOrder(arr,2*i+2); //输出右子树
        }
    }
//    后序遍历
    public static void postOrder(int[] arr,int i ){
        if (i < arr.length){
            return;
        }else {
            postOrder(arr,2*i+1);
            postOrder(arr,2*i+2);
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = {78,56,34,43,4,1,15,2,23};
        preOrder(arr,0);
        System.out.println("===============");
        middleOrder(arr,0);
//        System.out.println("===============");
//        postOrder(arr,0);
    }
}
