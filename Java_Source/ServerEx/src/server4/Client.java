package server4;

import java.net.Socket;

public class Client {

	public static void main(String[] args) {
		if(args.length != 1) {
			System.out.println("usag : java Client <user-name>");
			return;
		}
		
		Socket socket;
		Thread thread1;
		Thread thread2;
		
		try {
			socket = new Socket("192.168.0.110", 9002);
			thread1 = new SenderThread(socket,args[0]);
			thread2 = new ReceiverThread(socket);
			thread1.start();
			thread2.start();
		}catch(Exception e) {
			System.out.println("err -> Client :24 "+e.getMessage());
		}

	}

}
