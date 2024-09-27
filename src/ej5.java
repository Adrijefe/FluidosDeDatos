import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ej5 {
    public static void main(String[] args) {
        String texto = "Les classes de fitxers en java són un jaleo";

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("fitxer5.txt"));
            writer.write(texto);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
