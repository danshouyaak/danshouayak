package Mobile223;
//1、在冰箱类Refrigerator中创建三个属性（品牌brand初始值为西门子（字符串），容量capacity初始值为600(整型)，颜色color初始值为白色（字符串））
//        2、创建show()方法，参数无返回值，初始化品牌brand初始值为松下，容量capacity初始值为450，并按顺序输出三个属性；
//1.在该类中创建三个属性并初始化。
//        2.在该类中添加两个重载的show()方法，第一个方法无参数，第二个方法三个参数（第二个方法应根据实参顺序编写形参）。
//        3.编写main方法，创建对象r，对象r分别调用两个show()方法，按要求结果。
public class Binxiang {
    String brand = "西门子";
    int capacity = 600;
    String color = "白色";

    public static void main(String[] args) {
        Binxiang b = new Binxiang();
        b.show();

        b.show("海尔" , 550 , "黑色");
    }
    void show(){
        String brand = "松下";
        int capacity = 450;

        System.out.println(brand);
        System.out.println(capacity);
        System.out.println(color);
    }
    void show(String brand , int capacity , String color){
        System.out.println(brand);
        System.out.println(capacity);
        System.out.println(color);
    }
}
