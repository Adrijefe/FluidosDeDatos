import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class ej3 {
    public static void main(String[] args) {
        String text = "Les classes de fitxers en java són un jaleo";

        try {
            OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream("fitxero3.txt"));
            writer.write(text);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
