package xxgc;

import java.sql.SQLOutput;
import java.util.Scanner;

public class tip7 {
    public static void main(String[] args) {
        int a;
//        int b;
//        int c;
//        int d;
//        int e;
        Scanner scanner =new Scanner(System.in);
        System.out.println("请输入一个数：");
        a = scanner.nextInt();
//        b = scanner.nextInt();
//        c = scanner.nextInt();
//        d = scanner.nextInt();
//        e = scanner.nextInt();
        if( a<100){
            System.out.println("E");
        }
        else if(a<90){
            System.out.println("D");
        }
        else if(a<80){
            System.out.println("C");
        }
        else if(a<70){
            System.out.println("B");
        }
        else if (a<60){
            System.out.println("A");
        }
    }
}
