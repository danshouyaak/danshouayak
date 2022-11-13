package xxgc;

import java.util.Scanner;

//55、求出 e 的值
//        题目描述：
//        利用公式 e = 1 + 1/1! + 1/2! + 1/3! + ... + 1/n! 求 e 。
//        输入格式：
//        输入只有一行，该行包含一个整数 n（2<=n<=15），表示计算 e 时累加到 1/n！。
//        输出格式：
//        输出只有一行，该行包含计算出来的 e 的值，要求打印小数点后 10 位。
//        样例输入：
//        10
//        样例输出：
//        2.7182818011
public class tip55 {
    public static void main(String[] args) {
     double e = 1.0;

        System.out.println("请输入：");
     Scanner scanner = new Scanner(System.in);
     int sc = scanner.nextInt();
     if (sc>=2&sc<=15){
         for (int i = 1;i<=sc;i++) {
             //第几个1/n
             int k = 1;//
             for (int j = 1; j<=i;j++){
                 k *= j;
             }
             e +=1.0/k;
         }
     }else {
         System.out.println("输入错误！");
     }
        System.out.println(e);
    }
}
