import java.io.*;
import java.net.*;

public class SimpleClient {
    public static void main(String[] args) {
        String host = "127.0.0.1";
        int port = 5001;

        try (Socket socket = new Socket(host, port);
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true)) {

            String message = "Hello, server! This is a test message.";
            out.println(message);
            System.out.println("Message sent to server");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}