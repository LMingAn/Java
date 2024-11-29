package work_6_23_2;

import javax.swing.*;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server
{
    public static void main(String[] args) throws IOException {
        try (ServerSocket serverSocket = new ServerSocket(4331))
        {
            System.out.println("服务器端口：4331");
            while (true)
            {
                Socket socket = serverSocket.accept();
                System.out.println("新客户端连接");
                new ServerThread(socket).start();
            }
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }
    }
}

class ServerThread extends Thread
{
    Socket socket;

    public ServerThread(Socket socket)
    {
        this.socket = socket;
    }

    public void run()
    {
        try(ObjectOutputStream out = new ObjectOutputStream((socket.getOutputStream())))
        {
            JTextArea textArea = new JTextArea("欢迎来到服务器端");
            out.writeObject(textArea);
            out.flush();
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }
    }
}