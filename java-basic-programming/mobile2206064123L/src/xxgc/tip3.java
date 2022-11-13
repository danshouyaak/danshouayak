package xxgc;

import java.util.Scanner;
import java.util.spi.AbstractResourceBundleProvider;

public class tip3 {
    public static void main(String[] args) {
        int a ;
        int b ;
        int c ;
        int max = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入第一个字：");
        a = scanner.nextInt();
        System.out.println("输入第二个字：");
        b = scanner.nextInt();
        System.out.println("输入第三个字：");
        c = scanner.nextInt();
        max = a>b? a:b;
        max = max>c? max:c;
        System.out.println(max);
    }
}
