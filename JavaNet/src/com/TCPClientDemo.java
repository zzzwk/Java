package com;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClientDemo {
	
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket s = new Socket("localhost", 5005);
		DataOutputStream out = new DataOutputStream(s.getOutputStream());
		out.writeUTF("Hello!I'm client");
		
		DataInputStream in = new DataInputStream(s.getInputStream());
		System.out.println("message from server: " + in.readUTF());
		
		out.close();
		in.close();
		s.close();
	}

}
