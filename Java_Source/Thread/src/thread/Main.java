package thread;

public class Main {

	public static void main(String[] args) {
		Thread thread = new DigitThread();
		thread.start();
		for(char ch = 'a'; ch<='z'; ch++) {
			System.out.print(ch);
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}