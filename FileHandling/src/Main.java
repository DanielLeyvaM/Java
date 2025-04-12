public class Main {
    public static void main(String[] args) {
        String fileName= "new_file.txt";

        CreateFile.create(fileName);
        WriteFile.write(fileName);      //Write file creates a new file if it does not exist

        ReadFile.readAsString(fileName);
        System.out.println();
        ReadFile.readLines(fileName);
    }
}