import java.io.PrintStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ej6 {
    public static void main(String[] args) {
        String texto = "Les classes de fitxers en java són un jaleo";

        try {
            PrintStream printStream = new PrintStream(new FileOutputStream("fitxer6.txt"));
            printStream.println(texto);
            printStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
