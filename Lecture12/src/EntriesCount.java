import java.io.*;
import java.util.Scanner;

public class EntriesCount {
    public static int getEntriesCount(String line, String searchLine) {
        line = line.toLowerCase();
        searchLine = searchLine.toLowerCase();

        int entriesCount = 0;
        int lastIndex = line.indexOf(searchLine);

        while (lastIndex != -1) {
            entriesCount++;
            lastIndex = line.indexOf(searchLine, lastIndex + searchLine.length());
        }

        return entriesCount;
    }

    public static void main(String[] args) throws IOException {
        try (Scanner scanner = new Scanner(new FileInputStream("originalFile2.txt"))) {
            String searchLine = "который построил джек";
            int entriesCount = 0;
            int linesInFileCount = 0;

            while (scanner.hasNextLine()) {
                String fileLine = scanner.nextLine();
                ++linesInFileCount;
                entriesCount += getEntriesCount(fileLine, searchLine);
            }

            if (linesInFileCount == 0) {
                System.out.println("Пустой файл.");
            } else if (entriesCount == 0) {
                System.out.println("Вхождений не найдено.");
            } else {
                System.out.println("Количество вхождений: " + entriesCount);
            }
        }
    }
}