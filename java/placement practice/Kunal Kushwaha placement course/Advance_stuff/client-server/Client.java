import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.Buffer;

public class Client {

    public Runnable getRunnable(){
        return new Runnable() {
            @Override
            public void run(){
                int port=8080;
                try{
                    InetAddress address=InetAddress.getByName("localhost");
                    Socket socket=new Socket(address, port);
                    PrintWriter toSocket=new PrintWriter(socket.getOutputStream(),true);

                    BufferedReader fromSocket=new BufferedReader(new InputStreamReader(socket.getInputStream()));

                    toSocket.println("Hello from Client"+socket.getLocalSocketAddress());

                    System.out.println("Response from server : "+fromSocket.readLine());

                    toSocket.close();
                    fromSocket.close();
                    socket.close();
                }catch(IOException e)
                {
                    e.printStackTrace();
                }
            }
        };
    }
    public static void main(String[] args) throws IOException {
        Client client=new Client();
        for (int i = 0; i < 20; i++) {
            
            Thread thread=new Thread(client.getRunnable());
            thread.start();
        }
        }    
}
