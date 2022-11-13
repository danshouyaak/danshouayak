package xxgc;

import java.util.Scanner;

//输入两个正整数 m 和 n，求其最大公约数和最小公倍数。
public class tip10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
//        int s = 0;
//       for(int i = 1;i<=Math.min(m,n);i++){
//           if (m%i==0&&n%i==0){
//              s = i;
//           }
//       }
//        System.out.println("最大公约数"+s+"最小公倍数"+(m*n)/s);
        int a = m;
        int b = n;
        int s = 0;
       while (b!=0){
           s = a%b;
           a = b;
           b = s;
       }
        System.out.println("最大公约数"+a+" "+"最小公倍数"+(m*n)/a);
        System.out.println();
    }
}
