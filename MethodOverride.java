class sup{
    void display(){
        System.out.println("Hello Sup");
    }
    void printt(){
        System.out.println("Inside print");
    }
}
class sub extends sup{
    void display(){
        System.out.println("Hello Sub");
        super.printt();
    }
}
public class MethodOverride extends sup{
    public static void main(String[] args) {
        sub ob = new sub();
        ob.display();  
        ob.printt();      
    }
}
