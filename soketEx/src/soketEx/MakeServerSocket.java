package soketEx;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MakeServerSocket {
	
	ServerSocket serverSocket = null;
	Socket socket = null;
	PrintWriter writer = null;
	BufferedReader reader = null;
	String lineStr;
	
	public MakeServerSocket() {
		// TODO Auto-generated constructor stub
		
		try {
			serverSocket = new ServerSocket(2000);//port번호 2000 으로 서버 소켓 만들기
			
			while (true) {
				socket = serverSocket.accept();//클라이언트와 통신하기 위한 소켓
				System.out.println("Client 요청");
				
				writer = new PrintWriter(socket.getOutputStream(),true);
				reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				
				while ((lineStr = reader.readLine()) != null) {//클라이언트로부터 들어온 정보를 다시 출력함
					writer.write(lineStr);
					System.out.println("input : " + lineStr);
				}
				
				writer.close();
				reader.close();
				socket.close();
			}
			
		} catch (Exception e) {}
	}
	
	public static void main(String[] args) {
		new MakeServerSocket();
	}

}
