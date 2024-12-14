class Algebra{
    //1. Class level variable access everywhere inside the class
    int x=5; int y=20;
    void sum(){
        System.out.println(x+y);
        //Block level variable
        {   int a=35;
            System.out.println("Block level variable: "+a);
        }
    }
    int diff(){
        //2. Method level variable declared inside the method and cannot access from outside the method  
        int p=6;
        int q=3;
        return p-q;
    }
    int prod(){
        return x*y;
    }
}
public class ScopeVariablePW {  
    static void num(int a){
        a*=100;
        System.out.println("changing value: "+a);
    }
    public static void main(String[] args) {
        Algebra obj=new Algebra();
        obj.sum();
        System.out.println("diff function : "+obj.diff());
        System.out.println(obj.prod());
        int a=10;
        //a directly not pass but copy of a is passed
        System.out.println("before changing value: "+a);
        num(a);
        System.out.println("after changing value: "+a);
       
        
       
    }
    
}
