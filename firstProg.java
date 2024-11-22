public class firstProg {
    public static void test() {
        System.out.println("Test");
    }

    public static void main(String fun[]) {
        // firstProg ob1= new firstProg();
        // ob1.test();
        test();
        B ob = new B();
        ob.x = 10;
        ob.y = 20;
        ob.display();
    }
    // main();
}

class A {
    int a, b;

    void disp() {
        System.out.println("A");
    }
}

class B {
    int x, y;

    void display() {
        System.out.println("B");
        A ob = new A();
        ob.a = 10;
        ob.disp();
        // B ob1= new B();
        // ob1.display();
    }
}

class C {
    int x;
}