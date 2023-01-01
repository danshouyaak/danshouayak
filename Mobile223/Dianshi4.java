package Mobile223;
//1、在电视类TV中创建三个属性（品牌brand（字符串）、尺寸size（整型）、颜色color（字符串））和两个方法，
//
//        2、一个方法名为print打印三个属性，该方法无参数无返回值；
//3、另一个方法名为channel输出“电视能调频道”，该方法无参数无返回值；
//        4、编写两个构造方法，一个方法不带参数（初始化品牌为三星，尺寸为60，颜色为银色)，一个方法带三个参数,参数名称与属性相同，使用this关键字分别给属性赋值；
//        5、在该类中编写main方法并使用两个构造方法分别创建对象t1和t2，t2初始化品牌为索尼，尺寸为55，颜色为黑色。
//        6、t1调用channel()和print()两个方法。
//        7、t2调用channel()和print()两个方法。

public class Dianshi4 {
    String brand;
    int size;
    String color;


    public static void main(String[] args) {
        Dianshi4 t1 = new Dianshi4();

        t1.channel();
        t1.print();

        Dianshi4 t2 = new Dianshi4();

        t2.channel();
        t2.print("索尼",55 ,"黑色" );
    }
    void print(){
        String name = "三星";
        int size = 60;
        String color = "银色";

        System.out.println(name);
        System.out.println(size);
        System.out.println(color);
    }
    void print(String brand ,int size, String color){
        this.brand = brand;
        this.size = size;
        this.color = color;

        System.out.println(brand);
        System.out.println(size);
        System.out.println(color);
    }

    void channel(){
        System.out.println("电视能调频道");
    }
}
