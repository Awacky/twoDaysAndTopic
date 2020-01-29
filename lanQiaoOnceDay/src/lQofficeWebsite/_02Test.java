package lQofficeWebsite;

/**
 * @author Awacky
 * @date 2020/1/25 2:14
 */
public class  _02Test {
    public static void main(String[] args) {
        double num = 0.625;
        StringBuilder sb = new StringBuilder("0.");
        while (num>0){
//            乘2挪整
            double r = num*2;
//            判断整数部分
            if (r>=1){
                sb.append("1");
                num = r -1;
            }else {
                sb.append("0");
                num = r;
            }
        }
        if (sb.length()>32){
            System.out.println("error");
        }else {
            System.out.println(sb);
        }
    }
}
