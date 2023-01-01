package xxgc.cn1;
//4.创建测试类TestHardware，编写static修饰的test()方法：参数为Hardware对象h，输出h.print()；编写main方法，
//
//        5.分别以键盘和显示器类为对象调用test()方法。
public class TestHardware {
    static void test(){
        Hardware h = new Hardware();
        h.print();
    }
    public static void main(String[] args) {
        Keyboard k = new Keyboard();
        k.print(1);
        Monitor m = new Monitor();
        test();
    }
}
