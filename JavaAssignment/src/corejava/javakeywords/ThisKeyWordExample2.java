package corejava.javakeywords;

 public class ThisKeyWordExample2{
    public static void main(String[] args) {

        Account ac = new Account();
        ac.setData(8,12);
        ac.showData();

    }
    }

class Account{
    int a;
    int b;
    public void setData(int a,int b){
       this.a = a;  //delete this then run see the result
        this.b = b; ////delete this then run
    }
    public void showData(){
        System.out.println("Value of a="+ a);
        System.out.println("Value of b="+ b);
    }
}





