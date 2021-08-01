import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileToUpperCase {
    public static void main(String[] args) throws FileNotFoundException {
        try (PrintWriter writer = new PrintWriter("resultFile.txt");
             Scanner scanner = new Scanner(new FileInputStream("originalFile.txt"))) {
            while (scanner.hasNextLine()) {
                String string = scanner.nextLine();
                writer.println(string.toUpperCase());
            }
        }
    }
}