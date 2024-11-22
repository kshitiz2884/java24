import java.io.*;

public class BuffereR {
    public static void main(String[] args) {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        System.out.println("Enetr Value");
        try {
            String inp=br.readLine();
            int data=Integer.parseInt(inp);
            System.out.println(data+5);
        } catch (Exception e) {
            System.out.println(e);   
        }

    }
}
