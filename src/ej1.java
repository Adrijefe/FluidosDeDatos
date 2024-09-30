import java.io.PrintWriter;
import java.io.File;
import java.io.IOException;

public class ej1 {
    public static void main(String[] args) {
        String texto = "Les classes de fitxers en java són un jaleo";

        try {
            PrintWriter writer = new PrintWriter(new File("fitxero1.txt"));
            writer.println(texto);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
