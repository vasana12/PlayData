import java.util.Scanner;
import static java.lang.System.out;

public class Prime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int first, second, min, max,j, count = 0, num = 0;
		
		out.println("첫 번째 수 :");
		first = sc.nextInt();
		
		out.println("두 번째 수 :");
		second = sc.nextInt();
		
		if(first > second) {
			min = second;
			max = first;
		}else {
			min = first;
			max = second;
		}
		
		for( ; min <= max; min++) {
			for(j = 2; j < min; j++ ) {
				if(min == 2) {
					out.printf("%3d",min);
					num++;
				}
				if(min % j == 0) {	
					break;				
				}
			}
			if((j == (min))) {
				out.printf("%3d",min);
				num++;
				
				if(num % 10==0)
				 out.print("\n");
				}
		}
		
		if(num%10==0) {
			out.println("총 개수 : "+ num);
		}else {
			out.print("\n총 개수 : "+ num);
		}
		
		sc.close();
	}
}
