package Mobile223;

import java.util.Scanner;

//1、在该类中编写Triangle方法，该方法有参数无返回值。
//        2、双层for循环，外层变量i控制行，内层变量j控制列，注意换行。
//        3、在main方法中调用Triangle方法。
//在该类中编写方法Triangle（有参数无返回值），可打印任意长度的三角形，比如n=3时，打印三角形（每行数字间用一个空格隔开）
//        1
//        1 2
//        1 2 3
//        在main方法中调用该方法打印n=5时的三角形。
public class jikou {
//    int i = 0;
    public static void Triangle(int n){
        for(int i = 1;i<=n;i++ ){
            System.out.print("1");
            for ( int j = 2;j<=i;j++){
              //  System.out.print(i);
                System.out.print(j);
                //System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Triangle(5);
    }
}

