import static java.lang.System.out;

import java.util.Scanner;

public class Loop {

	public static void main(String[] args) {
		
		int cnt =1, num;
		
		Scanner sc = new Scanner(System.in);

		out.println("숫자를 입력하세요");		
		num = sc.nextInt();
		
		out.printf("  %d의 9단\n",num);
		while (cnt <10) {
			out.printf("%d x %d = %d\n",num,cnt,num*cnt);
			cnt++;
		}
		out.print(" 9단 출력 완료");
		
		sc.close();
	}
}
