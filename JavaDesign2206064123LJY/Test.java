package JavaDesign2206064123LJY;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//       String str  = scanner.next();
//
//       int a = 0;
//       int b = 0;
//       int c = 0;
//        for (int i = 0; i < str.length(); i++) {
//
//            if (str.charAt(i) >=48 & str.charAt(i)<=57){
//                a++;
//            }else if (str.charAt(i)>=65 & str.charAt(i)<=90){
//                b++;
//            } else if (str.charAt(i)>=33 & str.charAt(i)<=47) {
//                c++;
//            }
//        }
//
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//        System.out.println(str.length()-(a+b+c));

        char [] chars =null;
        int f=0;
        String s = scanner.nextLine();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)== ' '){
                f++;
            }
        }
        System.out.println(f);
    }
}
