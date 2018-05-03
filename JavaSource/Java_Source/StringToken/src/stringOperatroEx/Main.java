package stringOperatroEx;
import static java.lang.System.out;
import static java.lang.System.in;
import java.util.*;

public class Main {

	static int cnt = 1 ;
	
	public static void main(String[] args) {
		int num1 = 0 , num2 = 0;
		float tot=0.f;
		StringTokenizer op;
		String oper;

		Scanner sc = new Scanner(in);
		
		System.out.println("수식 입력 =>");
		oper = sc.nextLine();
		op = new StringTokenizer(oper,"+-/*",true);
		
		if(check(op)) {
			op = new StringTokenizer(oper,"+-/*",true);
			for(int i = 1; i < cnt ; i ++) {
				if(i == 1) {
					tot = Integer.parseInt(op.nextToken());
				}else if(i % 2 == 1) {
					switch (op.nextToken()) {
					case "+":  
						num2 = Integer.parseInt(op.nextToken());
						tot  += num2;
						break;
					case "-" : 
						num2 = Integer.parseInt(op.nextToken());
						tot -= num2;
						break;
					case "*":  
						num2 = Integer.parseInt(op.nextToken());
						tot *= num2;
						break;
					case "/": 
						num2 = Integer.parseInt(op.nextToken());
						tot  /= (float)num2;				
						break;
				}
			}
		}
			out.println(oper + " = " + tot);
	}else {
		out.println("연산 불가");
	}
}
	static boolean check(StringTokenizer op) {
		while(op.hasMoreTokens()) {
			String str = op.nextToken();
//			System.out.println( str);
			int checknum = 0;

			if(cnt % 2 == 1) {
				try {
					//System.out.println("숫자 변환 cnt :" + cnt);
					checknum = Integer.parseInt(str);
					cnt++;
				}catch(java.lang.NumberFormatException e){
					//System.out.println("숫자 변환 실패  cnt :" + cnt);
					cnt = 1;
					return false;
				}
				//System.out.println("숫자 변환 성공  cnt :" + cnt);
			}else {
				if((str.equals("+")|| str.equals( "-") || str.equals("*") || str.equals("/"))){
					cnt++;
				}else {
					System.out.println("잘못된 연산자" + str);
					cnt = 1;
					return false;
				}
			}
		}
		System.out.println("정삭 적인 수식");
		return true;
	}

}