import static java.lang.System.out;

import java.util.Scanner;

public class MultipleP {

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
		while(startNum <= finalNum) {
			out.printf("  %d단                              ",startNum);
			startNum++;
		}
		startNum =init;
		i = 1;
		
		while(i < 10) {					
			startNum = init;
			out.println("");
			
			while(startNum <= finalNum) {
				out.printf("%3d x %3d = %3d  ", startNum, i, startNum * i);
				startNum++;
			}
			startNum =init;
			i++;
		}
		sc.close();
	}
}
