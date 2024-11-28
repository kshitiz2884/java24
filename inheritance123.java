class parent{
    int x;
    void parentDisplay(){
        System.out.println("Parent");
    }
    void testMethhod(){
        System.out.println("Test");
    }
}
class child extends parent{
    int y;
    void childDisplay(){
        System.out.println("Child");
    }
}
public class inheritance123{
    public static void main(String[] args) {
        child obChild= new child();
        obChild.parentDisplay();
        obChild.childDisplay();
        obChild.testMethhod();
        parent obParent= new child();
        obParent.testMethhod();
        obParent.parentDisplay();
        // obParent.childDisplay();
        // child obChild2= new parent();
    }
}
