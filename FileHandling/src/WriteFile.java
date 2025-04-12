import java.io.IOException;
import java.nio.file.*;

import static java.nio.file.StandardOpenOption.APPEND;

public class WriteFile {

    public static void write(String name) {
        Path path = Paths.get(name);

        String newContent = "Nuevo contenido para\nInsertar en archivo\nTexto de Prueba";
        try {
            if(Files.size(path) > 0){
                newContent="\n"+newContent;
                Files.write(path,newContent.getBytes(),StandardOpenOption.APPEND);
                System.out.println("Contenido Agregado(No override)");
            }
            else{
                Files.write(path,newContent.getBytes());
                System.out.println("Contenido escrito (Override)");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
