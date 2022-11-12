package Mobile223;

//public class san {
//    public static void main(String[] args) {
//        double add = 0;
//        add=add(2,3);
//        System.out.println(add);
//       add=add(2.5,3.9);
//        System.out.println(add);
//        add=add(2,3,4);
//        System.out.println(add);
//    }
//    public static int add(int x,int y){
//        return x+y;
//    }
//    public static double add(double a,double b){
//        return a+b;
//    }
//    public static int add(int a1,int b1,int c1){
//        return a1+b1+c1;
//    }
//}
/*
1、在当前类中编写两个带返回值的方法add实现重载，
2、一个方法的参数是整数和实数(double)并求和，另一个方法的参数是实数(double)和整数并求和的2倍
3、在main方法中调用add方法分别求2和3.5的和，3.5和2和并输出。
/////////////////////////////////////////////////
1、在该类中编写两个add方法，一个方法参数是int和double并求和返回，另一个方法参数是double和int并求和的2倍并返回。
2、在main方法中分别调用add方法。
3、按照输出结果输出。
 */
public class san {
    public static void main(String[] args) {
        double add=0;
        add = add(2,3.5);
        System.out.println(add);
        add = add(3.5,2);
        System.out.println(add);
    }
    public static double add(int x,double y){
        return x+y;
    }
    public static double add(double a,int b){
        return 2*(a+b);
    }
}