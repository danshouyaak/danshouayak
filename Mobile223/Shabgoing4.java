package Mobile223;
//1、定义商品类Product，属性包括商品名称name（String）、商品编号id(String)和价格price（double）三个属性，
//
//        2、定义方法computeDiscount()，其中形参percent代表打折的百分比，计算折扣价格（price*percent）并输出折扣价格；
//
//        3、编写两个构造方法，一个方法不带参数（初始化名称为投影仪，商品编号为00102，价格为8600.0)，一个方法带三个参数(参数名称与属性相同），使用this关键字分别给属性赋值；
//
//        4、在该类中编写main方法并使用两个构造方法分别创建对象p1和p2，p2初始化三个属性名称为打印机，商品编号为00101，价格为1200.0，p1和p2分别调用computeDiscount方法，并打八折。
public class Shabgoing4 {
    String name ;
    String id ;
    double price;

    public static void main(String[] args) {
        Shabgoing4 p1 = new Shabgoing4();
        p1.computeDiscount();

        Shabgoing4 p2 = new Shabgoing4();
        p2.computeDiscount("打印机","00101",1200.0 );
    }
    void computeDiscount(){
        String name = "投影仪";
        String id  = "00102";
        double price = 8600.0;

        System.out.println(name);
        System.out.println(id);
        System.out.println(price = 0.8 * price);
    }
    void computeDiscount( String name,String id,double price){
        this.name = name;
        this.id = id;
        this.price = price;
        System.out.println(name);
        System.out.println(id);
        System.out.println(price = 0.8 * price);
    }
}
