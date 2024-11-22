class sup{
    int x;
    sup(int a){
        x=a;
    }
}
class sub extends sup{
    int y;
    sub(int a){
        super(b);
        y=b;
    }
} 
public class ConstOverride {
    public static void main(String[] args) {
        sub ob = new sub(10);
        System.out.println(ob.y);
    }
}
