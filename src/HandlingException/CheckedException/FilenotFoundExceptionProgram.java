package HandlingException.CheckedException;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class FilenotFoundExceptionProgram {
    public static void main(String[] args) {
        try {
            File f = new File("file.txt");
            PrintWriter pw = new PrintWriter(new FileWriter(f),true );
            pw.println("This is File Not Found Exception in java ");
            pw.close();
            f.setReadOnly();
            PrintWriter pw1 = new PrintWriter(new FileWriter("file.txt"));
            pw1.println("Hello Huda");
        }catch (Exception ex ) {
            ex.printStackTrace();
        }
    }
}
