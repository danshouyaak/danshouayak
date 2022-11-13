package xxgc;

import java.util.Scanner;

//14、求和训练
//        题目描述
//        求以下三数的和,保留 2 位小数 1~a 之和 1~b 的平方和 1~c 的倒数和
public class tip14 {
    public static void main(String[] args) {
       // num1();
//       System.out.println(num1());
////       // num2();
//        System.out.println(num2());
////        //num3();
//       System.out.println(num3());
        double sum = num1()+num2()+num3();
        System.out.println(sum);
    }
    public static double num1(){
        double num1 = 0;
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for (int i = 2;i<=a;i++){
            num1 += i;
        }
        return num1;
    }
    public static double num2(){
         double num2 = 0;
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        for (int i = 2;i<=b;i++){
             num2 = 0 ;
            for (int j =2 ;j<=i;j++){
                num2 += j*j;
            }
        }
        return num2;
    }
    public static double num3(){
        double num3 = 0;
        int add= 0;
        Scanner scanner = new Scanner(System.in);
        int c = scanner.nextInt();
        for (int i =1; i<=c;i++){
            add += i;
            for(int j = 1;j<=i;j++){
                num3 += 1.0/add;
            }
        }
        return num3;
    }
}
