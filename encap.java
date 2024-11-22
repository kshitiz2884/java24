class data{
    private int atmPin=10;
    void setAtmPin(int x){
        atmPin=x;
    }
    int getAtmPin(){
        return atmPin;
    }
}
public class encap {
    public static void main(String[] args) {
        data ob = new data();
        ob.setAtmPin(1234);
        System.out.println(ob.getAtmPin());

        System.out.println("Hello World");

    }
}
