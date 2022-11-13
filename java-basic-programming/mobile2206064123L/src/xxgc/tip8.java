package xxgc;

import java.util.Scanner;

public class tip8 {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        System.out.println("请输入一个不大于五位数的正整数:");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        while (a>10000 || a<0){//判断是否是正数
            System.out.println("输入错误!");
            System.out.println("请输入不大于5位数的正整数");
            a = scanner.nextInt();
        }
        String len = String.valueOf(a);//先转换成字符串，然后计算它的长度
        System.out.println("它是"+len.length()+"位数");
        while (a>0){
            b = b*10 + a%10;
            a = a/10;
        }
        System.out.println("逆序输出"+b);
    }
}
