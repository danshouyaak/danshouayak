package xxgc;

import java.util.Scanner;

//52、鸡兔同笼
//        题目描述
//        已知鸡兔的脚共有 80 只，鸡和兔的总数量是一个 20 到 40 的整数 s，编写一程
//        序计算鸡兔各有多少只。
//        输入格式
//        输入鸡兔总数整数 s，20≤s≤40
//        输出格式
//        输出两个整数，第一个数字为鸡的数量，第二个数字为兔的数量
//        样例输入
//        30
public class tip52 {
    public static void main(String[] args) {
        int i =1;
        System.out.println("请输入一个数字：");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n>=20&n<40){
            for ( i = 1;i<=n;i++){
                if (2*i+(n-i)*4==80){
//                    System.out.println(i);
//                    System.out.println(n-i);
                    break;
                }
            }
            System.out.println(i);
            System.out.println(n-i);
        }else {
            System.out.println("输入错误！");
        }
    }
}
