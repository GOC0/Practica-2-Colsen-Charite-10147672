import java.io.*;
import java.util.*;



public class App {
    public static void main(String[] args) throws Exception {
        

        List<String> name= new ArrayList<>();
        String n="mam";
        short i=0;

        name.add("oll");
        name.add("mam");

        for(String string: name){
            if (string == n) {
                

                System.err.println("encontrado :"+i);
                return;
            }
             i++;
        }



        
    }
}
