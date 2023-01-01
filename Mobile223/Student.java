package Mobile223;
//1、在学生类Student中创建两个属性（系部department初始值为软件工程系、学费tuition初始值为16000）
//
//        2、创建一个show()方法(无参数、无返回值)，该方法初始化学费tuition为20000，并输出两个属性；
//1.在该类中添加两个属性并初始化。
//        2.在该类中添加show()方法，该方法无参数无返回值。初始化学费tuition为20000，并分两行输出两个属性department和tuition的值。
//        3.编写main方法，创建对象s，对象s调用show()方法，并分析结果。


public class Student {
    String department = "软件工程系";
    int tuition = 16000;

    public static void main(String[] args) {
        Student s = new Student();
        s.show();
    }
    void show(){
        int tuition = 20000;
        System.out.println(department);
        System.out.println(tuition);
    }
}
