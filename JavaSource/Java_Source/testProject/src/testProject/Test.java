package testProject;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, cnt=1;
		
		while(true) {
			System.out.println("*******구구단*******");
			System.out.println("***숫자를 입력하세요****");
			
			num = sc.nextInt();
			
			if(num != 0 ) {			
				while (cnt < 10) {
					System.out.printf("%d x %d = %d \n", num, cnt, (num * cnt));
					cnt++;				
				}
				cnt = 1;
			}else {
				System.out.println("*******구구단*******");
				System.out.println("********종료*******");
				break;
			}
		}
		sc.close();
	}
}
