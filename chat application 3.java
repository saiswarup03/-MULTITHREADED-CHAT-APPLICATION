import java.io.*;
import java.net.*;
public class ChatClient {
    private static final String SERVER_IP = "localhost"; // or use server IP
    private static final int SERVER_PORT = 12345;
    public static void main(String[] args) {
        try (
            Socket socket = new Socket(SERVER_IP, SERVER_PORT);
            BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader serverReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true)
        ) {
            System.out.println("Connected to chat server.");
            System.out.print("Enter your name: ");
            String name = consoleReader.readLine();
            new Thread(() -> {
                try {
                    String serverMsg;
                    while ((serverMsg = serverReader.readLine()) != null) {
                        System.out.println(serverMsg);
                    }
                } catch (IOException e) {
                    System.out.println("Disconnected from server.");
                }
            }).start();
            String userMsg;
            while ((userMsg = consoleReader.readLine()) != null) {
                out.println(name + ": " + userMsg);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
