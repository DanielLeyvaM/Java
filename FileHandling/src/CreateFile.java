import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateFile {

    public static void create (String name){
        Path path = Paths.get(name);

        if(!Files.exists(path)){
            try {
                Files.createFile(path);
                System.out.println("File created");

            } catch (IOException e) {
                System.out.println(e.getMessage());
            }

        } else{
            System.out.println("File already exists");
        }
    }
}
