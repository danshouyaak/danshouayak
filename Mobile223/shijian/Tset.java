package Mobile223.shijian;

public class Tset {
    private String cardID;
    private String password;
    private double balance;

    public void BankCard(){
        System.out.println(cardID);
        System.out.println(password);
        System.out.println(balance);
    }
    public Tset(String cardId, String password,double balance){
        this.cardID = cardID;
        this.password = password;
        this.balance = balance;
    }
    public String getCardID(){
        return this.cardID;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public double getBalance(){
        return this.balance;
    }


    public static void main (String[] args) {
        Tset b1=new Tset("1001","123456",10.0);

        Tset b2=new Tset("1001","123456",10.0);
        System.out.println(b1.getBalance());
        System.out.println(b2.getBalance());
    }
    }

