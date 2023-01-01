package LJY2206064123;

import java.util.Scanner;

//为鼓励居民节约用水，自来水公司采取按用水量阶梯式计价的办法，居民应交水
//        费 y（元）与当月用水量 x（吨）相关：当 x 不超过 15 吨时，每吨收费 2 元；超
//        过 15 吨后对于超出部分按每吨 3 元收取。请编写程序实现水费的计算，从键盘
//        输入用水量，打印出水费。
public class Exam5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用水量：");
        int x = scanner.nextInt();

        if (x <= 15){
            System.out.println("水费为："+x*2);
        } else {
            System.out.println("水费为："+(30+(x-15)*3));
        }
    }
}
