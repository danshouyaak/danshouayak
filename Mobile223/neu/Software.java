package Mobile223.neu;
//        1.定义父类软件类Software，编写一个无参数无返回值的public修饰的print()方法，在该方法中输出“软件是父类”；
//        2.创建子类Office类Office继承父类，并覆盖print()方法，在该方法中输出“Office是子类”；
//        3.在子类中编写main方法，创建子类对象o，定义一个父类的引用s指向子类对象o，并通过运算符instanceof
//        (前面是对象后面是类名，判断前面的对象是不是后面类的一个实例)进行判断，如果为true，则将父类引用声明s强制转换为子类引用oo，并调用print()方法。
public class Software {
    public void print(){
        System.out.println("软件是父类");
    }

}
