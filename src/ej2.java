import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ej2 {
    public static void main(String[] args) {
        String texto = "Les classes de fitxers en java són un jaleo";

        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("fitxer2.txt"));
            PrintWriter writer = new PrintWriter(bufferedWriter);
            writer.println(texto);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
