import static java.lang.System.out;
//import java.util.Scanner;

import java.util.Scanner;

public class Dowhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int startNum, finalNum, i, init;	
		
		{
			int first, second;
			out.println("1번 수 : ");
			first = sc.nextInt();
			out.println("1번 수 : ");
			second = sc.nextInt();
		
			if(first < second) {
				startNum =first;
				finalNum = second;
			
			}else {
				startNum = second;
				finalNum = first;			
			}
		}	
		
		init = startNum;	
		do {
			out.printf("  %d단                              ",startNum);
			startNum++;
		}
		while(startNum <= finalNum);
		
		i = 1;
		do {	
			startNum =init;
			i++;
			out.println("");
			do {
				out.printf("%3d x %3d = %3d  ", startNum, i, startNum * i);
				startNum++;
			}
			while(startNum <= finalNum);
		}
		while(i < 9);
		sc.close();
	}
}
