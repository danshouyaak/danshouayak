package LJY2206064123;
//打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，其各位数字立方和
//        等于该本身。 例如：153 是一个水仙花数，因为 153=1^3+5^3+3^3。(输出结果
//        示例如下。
public class Exam6 {
    public static void main(String[] args) {
        for (int i = 2; i < 1000; i++) {
            int a = i/100;
            int b = i/10%10;
            int c = i%10;

            if (a*a*a + b*b*b + c*c*c == i){
                System.out.println(i);
            }
        }
    }
}
