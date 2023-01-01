package Mobile223.neu;

public class Office extends Software{
    public void print(){
        System.out.println("Office是子类");
    }

    public static void main(String[] args) {
        Office o = new Office();
        Software s = new Office();

        if (true == o instanceof Software){
            Office oo = (Office)s;
            oo.print();
        }
    }
}
