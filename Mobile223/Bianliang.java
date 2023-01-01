package Mobile223;
//1、在变量作用域类VariableScope中创建两个整型属性（i=3，j=5）。
//
//        2、创建一个sum()方法(求1+2+..100的和，并输出结果，该方法无参数无返回值)，
//
//        3、创建一个show()方法，该方法输出i和j的属性值；
//
//        4、在该类中编写main方法并创建对象v，对象v调用sum()和show()方法.
//1.在该类中添加两个属性i和j并初始化。
//
//        2.在该类中添加sum()方法，利用for循环求1+2+..100的和，循环变量为i，并把结果输出。
//
//        3.在该类中添加show()方法，该方法无参数无返回值，并分两行输出i和j。
//
//        4.编写main方法，创建对象v，对象v调用sum()和show()方法，按要求输出结果。
public class Bianliang {
    int i = 3;
    int j = 5;
    public static void main(String[] args) {
        Bianliang v = new Bianliang();
        v.sum();
        v.show();
    }
    void  sum(){
        int add = 0;
        for (int i = 1; i <=100 ; i++) {
            add +=i;
        }
        System.out.println(add);
    }
    void show(){
        System.out.println(i);
        System.out.println(j);
    }
}
