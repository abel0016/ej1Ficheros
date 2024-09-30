import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.Scanner;

public class Main {
    public static void leerFichero(String ruta,String mensaje){
        
    }
    public static void escribirFichero(String ruta,String mensaje) {
        Path rutaFichero = Paths.get(ruta);
        File fichero = new File(rutaFichero.toUri());

        if (fichero.exists()) {
            try {
                Files.write(rutaFichero, mensaje.getBytes(), StandardOpenOption.APPEND);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }else{
            try {
                fichero.createNewFile();
                Files.write(rutaFichero, mensaje.getBytes(), StandardOpenOption.APPEND);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String []args){
        Scanner teclado= new Scanner(System.in);
        System.out.println("Porfavor introduzca la ruta");

    }
}
