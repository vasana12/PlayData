package accountEX;

public class CalThread extends Thread{
	DataClass dc;
	CalThread(DataClass dc){
		this.dc = dc;
	}
	
	public void run() 
	{
		for(int i = 0; i <12;i++) 
		{
			synchronized(dc)
			{
				int money = 1000000;
				dc.ac1.stock = Integer.toString((Integer.parseInt((dc.ac1.stock)) -  money));
				System.out.print("ac1 계좌에서 1000000 인출\n");
				dc.ac2.stock = Integer.toString((Integer.parseInt((dc.ac2.stock)) +  money));
				System.out.print("ac2 계좌에  1000000 송금\n");		
			}
		}
	}
}
