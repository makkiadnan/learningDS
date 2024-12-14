public class LearnConstructors {
    public static void main(String args[]){
        Complex obj=new Complex();
        obj.print();
        
    }   
}
class Complex{
    int a,b;
    public Complex(){
        a=10;
        b=5;
    }
    void print(){
        System.out.println(a+"+"+b+"i");
    }
}
