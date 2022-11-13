package xxgc;

import java.util.Scanner;

//24、自定义函数处理最大公约数与最小公倍数
//        题目描述
//        写两个函数，分别求两个整数的最大公约数和最小公倍数，用主函数调用这两个
//        函数，并输出结果两个整数由键盘输入。
//        输入格式
//        两个数
//        输出格式
//        最大公约数 最小公倍数
public class tip24 {
    public static void main(String[] args) {
        diaoyong();
    }
    public static void diaoyong(){
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int a =m;
        int b =n;
        while (b!=0){
            sum = a%b;
            a = b;
            b = sum;
        }
        System.out.print(a+"  ");
        System.out.println((m*n)/a);

    }
}
