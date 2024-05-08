package manejo_archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class ManejoArchivos {
    public static void CrearArchivo(String NombreArchivo){
        File archivo = new File(NombreArchivo);
        try (var salida = new PrintWriter(archivo)) {
            salida.close();
            System.out.println("Archivo creado");
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }

    public static void EscribirArchivo(String nombreArchivo, String contenido){
        var archivo = new File(nombreArchivo);
        try (var salida = new PrintWriter(archivo)) {
            salida.println(contenido);
            salida.close();
            System.out.println("Se ha escrito el archivo");
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }

    public static void AnexarArchivo(String nombreArchivo, String contenido){
        var archivo = new File(nombreArchivo);

        try (var salida = new PrintWriter(new FileWriter(archivo,true))) {
            salida.println(contenido);
            salida.close();
            System.out.println("Se ha escrito en el archivo");
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }

    public static void LeerArchivo(String nombreArchivo){
        var archivo = new File(nombreArchivo);

        try(var salida = new BufferedReader(new FileReader(archivo))) {
            
            String lectura = null;
            while((lectura = salida.readLine()) != null){
                System.out.println(lectura);
            }

            salida.close();
            
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }
}
