package xxgc;

import java.util.Scanner;

public class tip1 {
    public static void main(String[] args) {
        int a ,b ,c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入第一个数：");
        a = scanner.nextInt();
        System.out.println("输入第二个数：");
        b = scanner.nextInt();
        c = a+b;
       if(c<=2*2*2*2*2*2*2*2*2*2){
           System.out.println("结果为："+c);
       }
       else
           System.out.println("输入错误！");
    }
}
