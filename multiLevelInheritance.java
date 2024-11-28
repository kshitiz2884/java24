class parent{
    int x;
    void parentDisplay(){
        System.out.println("Parent");
    }
}
class child extends parent{
    int y;
    void childDisplay(){
        System.out.println("Child");
    }
}
class grandchild extends child{
    int z;
    void grandDisplay(){
        System.out.println("Grand Child");
    }
}

public class multiLevelInheritance {
    public static void main(String[] args) {
        parent ob= new grandchild();
        ob.parentDisplay();
    }
}
