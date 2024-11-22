public class Polymorph {
    int add(int a,int b){
        return a+b;
    }
    double add(double a, double b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
    int add(int a,int b,int c,int d){
        return a+b+c+d;
    }
    public static void main(String[] args) {
        Polymorph ob= new Polymorph();
        System.out.println(ob.add(2,3,4));
        System.out.println(ob.add(2.3, 3.3));
    }
}
