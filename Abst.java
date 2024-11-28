// Abstract Class
abstract class InnerAbst {
    void show(){
        System.out.println("Show");
    }
    abstract void disp();
}
class add{
    int sum(int x, int y){
        int z;
        z= x+y;
        return z;
    }
}
public class Abst extends InnerAbst {
    void disp(){
        System.out.println("Display");
    }
    public static void main(String[] args) {
        // InnerAbst ob = new InnerAbst();
        // int x=20;
        // System.out.println("Hello World "+x);
        // add ob= new add();
        // int ans=ob.sum(3,4);
        // System.out.println(ans);
        //  anlksanfnsalflasmcmasdlmfcla
        Abst ob = new Abst();
        ob.show();
        ob.disp();
    }
    
}

