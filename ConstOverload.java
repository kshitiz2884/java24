class demo{
    int x,y;
    demo(){
        System.out.println("Inside Non Parameterised const");
        x=y=10+20;
     }
     demo(int a){
        x=y=a;
     }
     demo(int a,int b){
        x=a;
        y=b;
     }
}
public class ConstOverload {
    public static void main(String[] args) {
        demo ob = new demo();
        System.out.println(ob.x);
        demo ob1 = new demo(5);
        System.out.println(ob1.x);
        demo ob2= new demo(1,2);
        System.out.println(ob2.x);
    }
}
