import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.function.Consumer;

public class MultiThreadedServer {
    
    public static Consumer<Socket> getConsumer(){
        return (clientSocket)->{
            try{
                PrintWriter toClient=new PrintWriter(clientSocket.getOutputStream(),true);
                toClient.println("hello from server\nEND\n");

                BufferedReader fromClient=new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

                System.out.println("Client : "+clientSocket.getLocalSocketAddress()+" :: "+fromClient.readLine());
              
                    System.out.println(clientSocket.getLocalSocketAddress() + " : "+clientSocket.getRemoteSocketAddress());
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
               
                toClient.close();
                clientSocket.close();
                
            }catch(IOException e){
                e.printStackTrace();
            }
        };
    }
    public static void main(String[] args) {
        int port=8080;
        long count =0;
        try{
            ServerSocket serverSocket=new ServerSocket(port);
            serverSocket.setSoTimeout(10000);

            while(true)
            {
                System.out.println("Server Listening on "+port +" :: "+(++count));

                Socket acceptedSocket=serverSocket.accept();

                Thread thread=new Thread(()->MultiThreadedServer.getConsumer().accept(acceptedSocket));
                thread.start();
            }
        }catch(IOException e)
            {
                e.printStackTrace();
            }
    }
}
