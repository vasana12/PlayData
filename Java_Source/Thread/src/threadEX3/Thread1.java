package threadEX3;

public class Thread1 extends Thread{
	public DataClass dc;
	public void run() {
		double total = 0.;
		for(int cnt = 1; cnt < 1000000; cnt++) {
			if(cnt/2%2 == 0) {
				total += 1.0/cnt;
			}else {
				total -= 1.0/cnt;
			}
		}
		dc.result = total;
		dc.controler =true;
	}
}
