import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Consumer;

public class threadpoolServer {

    private ExecutorService threadpool;

    public threadpoolServer(int poolSize){
        threadpool=Executors.newFixedThreadPool(poolSize);
    }
    
   public void handleClient(Socket clientSocket)
   {
    try(PrintWriter toSocket=new PrintWriter(clientSocket.getOutputStream(),true))
    {
        toSocket.println("Hello from server : "+ clientSocket.getInetAddress());

    }catch(IOException e)
    {
        System.out.println("exception while handling client");
    }
   }
    public static void main(String[] args) {
        int port=8080;
        long count =0;
        threadpoolServer server=new threadpoolServer(10);
        try{
            ServerSocket serverSocket=new ServerSocket(port);
            serverSocket.setSoTimeout(30000);

            while(true)
            {
                System.out.println("Server Listening on "+port +" :: "+(++count));

                Socket acceptedSocket=serverSocket.accept();

                server.threadpool.execute(()->server.handleClient(acceptedSocket));
                
            }
        }catch(IOException e)
            {
                e.printStackTrace();
            }
    }
}
