package Mobile223.shijian;
//1、定义芒果类Mango为抽象类，包括一个颜色color属性和两个方法：
//
//        2、一个方法是无参数无返回值的公有print()方法，在该方法中输出“芒果是水果”。
//
//        3、另一个方法是抽象方法eat()，该方法是无参数无返回值的公有方法。
//
//        4、在main方法中输出：抽象类创建成功。
//1.定义芒果类Mango为abstract类，包括一个颜色color属性和两个方法：
//
//        2.一个方法是无参数无返回值的公有print()方法，在该方法中输出“芒果是水果”。
//
//        3.另一个方法是抽象方法eat()，该方法是无参数无返回值的公有方法；
//
//        4、在main方法中输出：抽象类创建成功。
public abstract class  Mango {
    String color;

    public void print(){
        System.out.println("芒果是水果");
    }
    public void eat(){

    }
    public static void main(String[] args) {
        System.out.println("抽象类创建成功");
    }
}
