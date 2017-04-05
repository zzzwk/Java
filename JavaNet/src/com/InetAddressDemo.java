package com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

/*
 * InetAddress,URL
 * BufferedInputeStream,BufferReader 封装输入流
 */

public class InetAddressDemo {
	
	public static void main(String[] args) throws IOException {
//		String s = "www.baidu.com";
//		InetAddress i = InetAddress.getByName(s);
//		System.out.println(s + " ip:" + i.getHostAddress());
		
		URL url = new URL("https://www.baidu.com/index.html");
		System.out.println("Protocol: " + url.getProtocol());
		System.out.println("File: " + url.getFile());
		System.out.println("Port: " + url.getPort());
		System.out.println("Ref: " + url.getRef());
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(url.openStream()));
		String s;
		while ((s = br.readLine()) != null)
			System.out.println(s);
		br.close();
	}

}
