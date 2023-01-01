package Mobile223.shijian;
//1.定义椭圆类Ellipse，属性有：长半轴a=8（int）、短半轴b=6（int）、圆周率PI=3.14（final double）；
//        2.编写findArea()方法求椭圆的面积（面积公式为PI*a*b），该方法无参数有返回值，并将值返回；
//        3.在main方法中创建该类对象e，调用findArea()方法输出其面积。
public class Ellipse {
    int a = 8;
    int b = 6;
    final double PI  = 3.14;

     double findArea(){
        return PI * a * b;
    }
    public static void main(String[] args) {
        Ellipse e = new Ellipse();
        System.out.println(e.findArea());
    }
}
