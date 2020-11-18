package basic.io;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {

    public static void main(String[] args) throws IOException {

     //服务端
        ServerSocket server = new ServerSocket(8009);
        Socket client = null;
        boolean f= true;
        while (f){
            //等待客户端的连接
            client = server.accept();

            System.out.println("与客户端连接成功！");


        }

    }
}
