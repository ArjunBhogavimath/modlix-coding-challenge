import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PiSearch1B {

    //for efficiently search through the 1B characters of pi
    //we need to search the sequence in chunks, and search in 1 chunk at a time
    public static int searchIn1BillionPi(String sequence) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("data/1b-pi-digit.txt"));
            int chunkSize = 10_000_000; // Reads 10 million characters at a time
            char[] buffer = new char[chunkSize];
            int indexOffset = 0;
            String remaining = "";

            while (reader.read(buffer) != -1) {
                String chunk = remaining + new String(buffer);
                int index = chunk.indexOf(sequence);
                if (index != -1) {
                    reader.close();
                    return indexOffset + index;
                }
                remaining = chunk.substring(chunk.length() - sequence.length());
                indexOffset += chunkSize;
            }

            reader.close();
        } catch (IOException e) {
            System.out.println("Error reading Pi file: " + e.getMessage());
        }
        return -1; // Not found
    }
}
