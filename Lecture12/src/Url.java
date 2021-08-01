import java.util.Scanner;

public class Url {
    public static String getServerName(String url) {
        int serverNameStartIndex = url.indexOf("://") + 3;
        int serverNameEndIndex = url.indexOf("/", serverNameStartIndex);

        if (serverNameEndIndex == -1) {
            return url.substring(serverNameStartIndex);
        }

        return url.substring(serverNameStartIndex, serverNameEndIndex);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите url: ");
        String url = scanner.nextLine();

        System.out.println("Имя сервера: " + getServerName(url));
    }
}