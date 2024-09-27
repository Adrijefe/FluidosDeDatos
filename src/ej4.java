import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class ej4 {
    public static void main(String[] args) {
        String texto = "Les classes de fitxers en java són un jaleo";

        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("fitxer4.txt")));
            bufferedWriter.write(texto);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
