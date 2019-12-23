package circleArea;

import java.util.Scanner;

//要求输入一个整数，输出一个7位有效值
    /*
    * 输入格式
输入包含一个整数r，表示圆的半径。
输出格式
输出一行，包含一个实数，四舍五入保留小数点后7位，表示圆的面积。*/


//  很有特色的一的就是Stirng.format....
public class Main {
    public static void main(String[] args) {
        double Pi =Math.PI;
        Scanner input = new Scanner(System.in);
        double r = input.nextDouble();
        double area = r*r*Pi;
//        取余100000
        System.out.println(String.format("%.7f", area));
    }
}
