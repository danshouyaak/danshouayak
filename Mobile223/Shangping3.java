package Mobile223;
//1、定义商品类Product，属性包括商品名称name（String）、商品编号id(String)和价格price（double）三个属性，
//
//        2、定义方法computeDiscount()，其中形参percent代表打折的百分比，计算折扣价格（price*percent）并输出折扣价格；
//
//        3、编写两个构造方法，一个方法不带参数（初始化名称为投影仪，商品编号为00102，价格为8600.0)，一个方法带三个参数，分别给属性赋值；
//
//        4、在该类中编写main方法并使用两个构造方法分别创建对象p1和p2，p2初始化三个属性名称为打印机，商品编号为00101，价格为1200.0，p1和p2分别调用computeDiscount方法，并打八折。
//1.在该类中添加三个属性。
//        2.在该类中添加computeDiscount()方法，该方法有参数无返回值。
//        3.编写两个构造方法，一个方法不带参数（初始化名称为投影仪，商品编号为00102，价格为8600.0)，一个方法带三个参数。
//        4.在该类中编写main方法并使用两个构造方法分别创建对象p1和p2，p2初始化三个属性名称为打印机，商品编号为00101，价格为1200.0，p1和p2分别调用computeDiscount方法，实参为0.8。
public class Shangping3 {
    String name;
    String id;
    double price;

    public static void main(String[] args) {
        Shangping3 p1 = new Shangping3();
        p1.name = "投影仪";
        p1.id = "00102";
        p1.price = 8600.0;
        p1.computeDiscount();

        Shangping3 p2 = new Shangping3();
        p2.computeDiscount("打印机","00101",1200.0);
    }
    void computeDiscount(String name , String id , double price){
        System.out.println(name);
        System.out.println(id);
        System.out.println(price = price*0.8);

    }
     void computeDiscount(){
        System.out.println(name);
        System.out.println(id);
        System.out.println(price = price*0.8);

    }
}
