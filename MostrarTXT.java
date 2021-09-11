import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MostrarTXT {
    public static void main(String[] args) throws IOException {
        FileReader miarchivo = new FileReader("ejemplocc.txt");

        try (BufferedReader LectorDeArchivo = new BufferedReader(miarchivo)) { 
            String linea;

            while ((linea = LectorDeArchivo.readLine()) != null) { // "linea" se imprime mientras las líneas de texto existan
                System.out.println(linea);
            }
            miarchivo.close();
        }
    }
}
