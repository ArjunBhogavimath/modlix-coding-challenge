import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class PiSearch1M {

    //load pi as string from file
    public static String loadPiFromFile(String filePath) throws IOException {
        return new String(Files.readAllBytes(Paths.get(filePath)));
    }

    public static int search(String sequence) {
        try {
            String piDigits = loadPiFromFile("data/1m-pi-digit.txt");
            return piDigits.indexOf(sequence);
        } catch (IOException e) {
            System.out.println("Error loading Pi file: " + e.getMessage());
            return -1;
        }
    }
}
