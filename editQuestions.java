import java.io.*;
import java.awt.*;

public class editQuestions {


    public static void main(String[] args) throws IOException{
        File file = new File("Questionbank.csv");
        
        Desktop desktop = Desktop.getDesktop();
        if(file.exists()) desktop.open(file);
        
        File wfile = new File("Questionbankwelsh.csv");
        if(wfile.exists()) desktop.open(wfile);
        
        
    }

}
