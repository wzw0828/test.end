class Bank{
    private static int sum=0;
    //public static void add(int n){
    public synchronized static void add(int n){
        int tmp=sum;
        tmp=tmp+n;
        try{
            Thread.sleep((int)(1000*Math.random()));
        }
        catch(InterruptedException e){}
        sum=tmp;
        System.out.println("sum= "+sum);
    }
}
class Customer extends Thread{
    private String id;
    public Customer(String s){
        id=s;
    }
    public void run(){
        for(int i=1;i<=3;i++){
            Bank.add(100);
            System.out.println(id+" is runnig..");
        }
    }
}
public class j3{
    public static void main(String[] args){
        Customer c1=new Customer("c1");
        Customer c2=new Customer("c2");
        c1.start();
        c2.start();
    }
}
