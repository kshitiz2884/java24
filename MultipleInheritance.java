interface A {
    void ADisplay();
}

interface B {
    void BDisplay();
}
interface C extends A,B{
    
}
abstract class X{
    void XDisplay(){
        System.out.println("XDisplay");
    }
}
class C extends X implements A, B {
    public void ADisplay() {
        System.out.println("ADisplay");
    }

    public void BDisplay() {
        System.out.println("BDisplay");
    }
}
public class MultipleInheritance {
    public static void main(String[] args) {
        C ob= new C();
        ob.ADisplay();
        ob.BDisplay();
        ob.XDisplay();
    }
}
