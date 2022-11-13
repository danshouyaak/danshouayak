package xxgc;

import java.util.Scanner;
import java.util.spi.AbstractResourceBundleProvider;

public class tip5 {
    public static void main(String[] args) {
        double F ;
        double c ;
        System.out.println("请输入一个数：");
        Scanner scanner = new Scanner(System.in);
        F = scanner.nextDouble();
        c = 5*(F-32)/9;
        System.out.println("c="+c);
    }
}
