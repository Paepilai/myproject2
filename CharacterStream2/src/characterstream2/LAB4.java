package characterstream2;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LAB4 {

    public static void main(String[] args) {

        try {
            InputStreamReader key = new InputStreamReader(System.in);
            BufferedReader input = new BufferedReader(key);
            System.out.print("Enter your name: ");
            String name = input.readLine();
            System.out.println("Hello " + name);
            System.out.print("Enter your weight: ");
            String w = input.readLine();
            System.out.print("Enter your height: ");
            String h = input.readLine();
            System.out.println(Double.parseDouble(w) * Double.parseDouble(h));
        } catch (IOException ex) {
            Logger.getLogger(LAB4.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
