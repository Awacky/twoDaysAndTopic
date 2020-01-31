package towersOfHanoi;

/**
 * @author Awacky
 * @date 2020/1/31 14:21
 */
public class TowerOfHanoi {
    private int totalDisks;
    public TowerOfHanoi(int totalDisks){
        this.totalDisks = totalDisks;
    }
    private void moveTower(int numDisks, int start, int end, int temp){
        if (numDisks==1){
            moveOneDisk(start,end);
        }else {

//        第一步先进行把n-1个盘子移动到临时位置上
            moveTower(numDisks-1,start,temp,end);
//        把第n个盘子移动到位置上
            moveOneDisk(start,end);
//        再把n-1个盘子移动回来
            moveTower(numDisks-1,temp,end,start);
        }
    }
//    移动的单个盘子
    private void moveOneDisk(int start , int end){
        System.out.println("Move one disk from "+start+"to"+end);
    }
    public void solve(){
        moveTower(totalDisks,1,3,2);
    }

}
