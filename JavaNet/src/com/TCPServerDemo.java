package com;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * ServerSocket(int port): 在服务端注册端口号
 * Socket accept(): 使服务器端进入等待状态,当建立连接时，立刻返回Socket
 * java.net.Socket: getInputStream,getOutputStream
 */

public class TCPServerDemo {

	public static void main(String[] args) throws IOException {
		
		ServerSocket server = new ServerSocket(5005);
		while (true){
			Socket s = server.accept();
			DataInputStream in = new DataInputStream(s.getInputStream());
			System.out.println("Message from client: " + in.readUTF());
			
			DataOutputStream out = new DataOutputStream(s.getOutputStream());
			out.writeUTF("Hello!I'm server");
			
			in.close();
			out.close();
			s.close();
		}
	}

}
