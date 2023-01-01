package Mobile223.neu;

import java.util.ArrayList;
import java.util.Iterator;

//        1. 创建一个ArrayList集合对象；
//
//        2. 使用add方法逐个添加学生姓名；
//
//        3. 使用add方法添加一个元素“王明”；
//
//        4. 使用set方法第1个学生改成张振；
//
//        5. 使用循环遍历输出所有的学生名单；
//        Tom
//        Alice
//        George
//        Mark
public class TestList1 {
    public static void main(String[] args) {
        ArrayList list= new ArrayList();
        list.add("Tom");
        list.set(0,"张振");
        list.add("Alice");
        list.add("George");
        list.add("Mark");
        list.add("王明");

        Iterator i = list.iterator();

        while (i.hasNext()){
            System.out.println(i.next());
        }
    }
}
