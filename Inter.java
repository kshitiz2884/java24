interface test{
    void game();
    void name();

}
class interfaceTest implements test{
    public void game(){
            System.out.println("Game");
        }
    public void name(){
            System.out.println("Name");
        }
}
public class Inter {
    public static void main(String[] args) {
        interfaceTest ob = new interfaceTest();
        ob.game();
        ob.name();
        
    }
}
