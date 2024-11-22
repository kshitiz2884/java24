class test{
    int x;
    void myMethod(){
        System.out.println("My Method");
    }
}
class poly extends test{
     void display(){
        System.out.println(x);
    }
    public static void main(String args[]){
        poly ob = new poly();
        ob.display();
        ob.myMethod();
    }
}