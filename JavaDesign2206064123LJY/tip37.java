package JavaDesign2206064123LJY;

import java.util.Scanner;

    public class tip37 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double x = scanner.nextDouble();
            int n = scanner.nextInt();
            double result = 0;
            for (int i = 1; i <= n; i++) {
                result += mypow(-1, i - 1) * mypow(x, n) / fact(i);
            }
            System.out.println(result);

        }
        static double fact(int n){
            double sum = 0;
            double temp = 1;
            for (int i = 1; i <= n; i++) {
                temp *= i;
                sum += 1.0/temp ;
            }
            return sum;
        }
        static double mypow(double x,double n){
            double add = 0;
            double getsum = 1;
            double temp = 0;
            for (int i = 1; i <= n ; i++) {
                temp = Math.pow(-1,n-1);
                add = Math.pow(x,n);
                getsum = temp*add;
            }
            return  getsum;
        }
//public static void main(String[] args) {
//fact();
//}
//static void fact(){
//    Scanner scanner = new Scanner(System.in);
//    int x = scanner.nextInt();
//    int n = scanner.nextInt();
//
//    double sum = 0;
//    double c = 1;
//    double [] arr = new double[999999999];
//
//    for (int i = 1; i <= n; i++) {
//        c *= i;
//        arr[i]= 1.0/c;
//    }
//
//    double pow = 0;
//    double temp = 0;
//    double [] gerarr = new double [999999999];
//    for (int i = 1; i <= n ; i++) {
//        temp = Math.pow(-1,n-1);
//        pow = Math.pow(x,n);
//        gerarr[i] = temp*pow;
//    }
//
//    double add = 0;
//    double getsum = 0;
//    for (int i = 1; i <= n ; i++) {
//       add =  gerarr[i]/arr[i];
//        getsum += add;
//
//    }
//    System.out.println(getsum);
//
//
//}
    }

