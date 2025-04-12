import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReadFile {
    public static void readAsString(String name){
        Path path= Paths.get(name);

        try {
            String content = Files.readString(path);
            System.out.println("\nContenido:\n" + content);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void readLines(String name){
        Path path = Paths.get(name);

        try {
            List<String> allLines = Files.readAllLines(path);
            for(String lines : allLines){
                String[] elements = lines.split(" ");
                System.out.println(elements[0]);
                System.out.println(elements[2]);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
