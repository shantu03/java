import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.Buffer;

public class SingleThreadedServer {
        
    public static void main(String[] args) throws IOException {
        int port=8080;
        ServerSocket socket=new ServerSocket(port);
        
        socket.setSoTimeout(10000);

        while(true)
        {
            System.out.println("Listeing on server");
            Socket acceptedConnection=socket.accept();
            PrintWriter toClient=new PrintWriter(acceptedConnection.getOutputStream(),true);
            
            
            toClient.println("Hello from server");
            BufferedReader fromClient=new BufferedReader(new InputStreamReader(acceptedConnection.getInputStream()));
            System.out.println(fromClient.readLine());
            toClient.close();
            acceptedConnection.close();
            
            
        }
        
    }
}
