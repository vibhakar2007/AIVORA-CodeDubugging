import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        int port = 5001;

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server listening on port " + port);

            Socket clientSocket = serverSocket.accept();
            System.out.println("Connected by " + clientSocket.getInetAddress());

            BufferedReader in = new BufferedReader(
                    new InputStreamReader(clientSocket.getInputStream()));

            String message = in.readLine();
            System.out.println("Received message: " + message);

            clientSocket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}