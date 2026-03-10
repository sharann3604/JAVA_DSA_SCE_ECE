package Module5;
import java.io.*;

public class ThrowsExample {

    static void readFile() throws IOException {
        FileReader file = new FileReader("test.txt");
        file.read();
    }

    public static void main(String[] args) {
        try {
            readFile();
        }
        catch (IOException e) {
            System.out.println("File not found");
        }
    }
}