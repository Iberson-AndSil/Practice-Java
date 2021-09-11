import java.io.BufferedWriter;
import java.io.FileWriter;

class crearTXT {
  
    public static void main(String[] args) {

      try {    
        BufferedWriter miarchivo = 
        new BufferedWriter(new FileWriter("ejemplojava.txt"));

        miarchivo.write("J primera linea \n");
        miarchivo.write("J segunda linea \n");
        miarchivo.write("J tercera linea \n");
        
        miarchivo.close();
        System.out.println("El archivo guardado exito");
      } catch (Exception e) {
        System.out.println("hubo problemas al guardar");
      }

    }
}