package xxgc.cn1;
//3.在子类中编写main方法，创建子类对象m，定义一个父类的引用h指向子类对象m，
//        并通过运算符instanceof(前面是对象后面是类名，判断前面的对象是不是后面类的一个实例)进行判断，
//        如果为true，则将父类引用声明h强制转换为子类引用mm，并调用print()方法。
public class Mouse extends Hardware{
    public void print(){
        System.out.println("鼠标是子类");
    }
    public static void main(String[] args) {
       Hardware h = new Mouse();
       Mouse m = (Mouse) h;
    }
}
