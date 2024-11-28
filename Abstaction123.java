//  Abstract Class 1
abstract class InnerAbstaction123 {
    void normal(){
        System.out.println("Normal");
    }
    abstract void abstr();
    abstract void main();
}
// Abstract class 2
abstract class InnerAbstaction123_1 {
    void normal1(){
        System.out.println("Normal 1");
    }
    abstract void newAbstr();
}
// Interface 1
interface myInterface{
    void disp();
    static void test(){
        System.out.println("test");
    }
}
//  interface 2
interface myNewInterface{
    void newDisp();
}
interface myNewInterface1{
    void newDisp();
}
class Normal extends InnerAbstaction123 implements myInterface, myNewInterface{
    void abstr(){
        System.out.println("My implementation");
    }
    public void disp(){
        System.out.println("Display");
    }
    public void newDisp(){
        System.out.println("New Disp");
    }
    public void main(){
        System.out.println("Main Method");
    }
}
abstract public class Abstaction123 {
    public static void main(String[] args) {
        Normal ob = new Normal();
        ob.main();
        System.out.println("Hello WOrld");
    }
}
