import java.util.Scanner;

public class Gugu {

	public static void main(String[] args) {
		int num1, num2, min, max;
        
		int num[] = inputGugu();
        
       
	}
	static void printGuGuDan(int min1, int max1) {
		int i=0, j =0;
		 System.out.println("");
	        for (i=min1; i <= max1; i++) 
	        {      
		        System.out.printf("* %d�� *  ", i);
	        }
	        System.out.println();

	        for(j = 1; j <= 9; j++)
	        {
	        	for(i = min1; i <= max1; i++)
	        	{
		        	System.out.printf("%d*%d=%2d  ", i, j, i*j);            
		        } 
		        System.out.println();
	        }
		
	}
	static int[] inputGugu() {
		Scanner scan = new Scanner(System.in);
		
		int num[] = new int [2];
		
		System.out.print("ù��° ���� �Է� => ");
	    num[0] = scan.nextInt();
	    System.out.print("�ι�° ���� �Է� => ");
	    num[1] = scan.nextInt();
	        
	    if (num[0] > num[1])
	     {
	       	int switchNum = num[1];
	       	num[1] = num[0];
	       	num[0] = switchNum;
	     }
	    else
	     {
	    	
	     }
	     scan.close();      
		 return num;
		
	}
}
