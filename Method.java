public class Method {
    //without static keyword we can not a function or method only by its name ex welcome() it gives error
    //but we can call it by making object and call it ex object.welcome()
    static void welcome(){
        System.out.println("WELCOME TO ADNAN MAKKI HOUSE");
    }
    public static void main(String[] args) {
        //Method obj=new Method();
        welcome();
        System.out.println(Math.floor(4.91));//all 3 value have data type double;
        System.out.println(Math.ceil(4.01));
        System.out.println(Math.sqrt(36));
        System.out.println("nothing happen");
    }
    
}
