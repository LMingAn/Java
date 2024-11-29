package work_6_23_2;

import javax.swing.*;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try(Socket socket = new Socket("localhost", 4331))
        {
            System.out.println("连接至服务器端");
            ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
            JTextArea textArea = (JTextArea) in.readObject();
            JFrame frame = new JFrame("Client");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 200);
            frame.add(new JScrollPane(textArea));
            frame.setVisible(true);
        }
        catch (IOException | ClassNotFoundException ex)
        {
            ex.printStackTrace();
        }
    }
}
