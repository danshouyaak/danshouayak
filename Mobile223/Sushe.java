package Mobile223;
//1、在宿舍类Dormitory中创建两个属性（房间号roomNumber初始值为001(字符串)、楼层floor初始值为2（整型））
//
//        2、创建一个show()方法(无参数无返回值)，该方法初始化房间号roomNumber为002，并输出两个属性；
//1.在该类中添加两个属性并初始化。
//
//        2.在该类中添加show()方法，该方法无参数无返回值。房间号roomNumber为002，并分两行输出两个属性roomNumber和floor的值。
//
//        3.编写main方法，创建对象d，对象d调用show()方法，并按要求输出结果。
public class Sushe {
    String roomNumber = "001";
    int floor = 2;

    public static void main(String[] args) {
        Sushe d = new Sushe();
        d.roomNumber = "002";
        d.show();
    }
    void show(){
        System.out.println(roomNumber);
        System.out.println(floor);
    }

}
