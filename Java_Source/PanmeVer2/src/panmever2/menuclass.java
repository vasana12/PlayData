package panmever2;
import static java.lang.System.out;
import java.util.Scanner;

public class menuclass {
	
	String userOrder="";
	Panme02 pclass = new  Panme02();
	 
	void mainMenu(Panme02 obj[]) {

		while(!this.userOrder.equals("3")) {
			
			obj[Panme02.numberOfData] = new Panme02();
			Scanner sc = new Scanner(System.in);		
			
			out.println("1 : 데이터 입력, 2 : 출력 , 3 : 종료");
			out.println("4 : 데이터 코드 조회, 5 : 데이터 수정 , 6 : 데이터 삭제\n");
			
			this.userOrder = sc.next();
			
			switch (this.userOrder) {
				case "1": //제품 데이터 입력
					pclass.input(sc,obj);
					Panme02.numberOfData++;
					break;
				case "2": // 제품 데이터 모두 출력
					pclass.output(obj);
					break;
				case "3": //프로그램 종료
					out.println("***종료***\n");
					break;
				case "4"://하나의 데이터 조회
					pclass.select(sc,obj);
					break;
				case "5"://하나의 데이터 수정
					pclass.modify(sc,obj);
					break;
				case "6"://하나의 데이터 삭제
					pclass.delete(sc,obj);
					break;
			}
		}
	}
}
