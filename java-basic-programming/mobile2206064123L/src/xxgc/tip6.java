package xxgc;

import java.util.Scanner;

public class tip6 {
    public static void main(String[] args) {
        int x ;
        int y ;
        System.out.println("请输入一个数：");
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        int a;

        if(x<1){
            System.out.println("结果="+x);
        } else if (x<=10) {
            a = 2*x-1;
            System.out.println("结果="+a);
        }
        else if(x>10){
            y = 3 * x -11;
            System.out.println("结果="+y);
        }

    }
}
