package panme;
import java.util.Scanner;
import static java.lang.System.out;

public class MenuClass {
	
	ClassP inputclass = new ClassP();
	String answer ="";
	
	public void menu() {
		
		while(!answer.equals("3")) {
			Scanner sc = new Scanner(System.in);		
			out.println("1 : 데이터 입력, 2 : 출력 , 3 : 종료\n");
			
		    answer = sc.nextLine();
		    out.print(answer);
		    
			switch (answer) {
				case "1":
					inputclass.input(sc);
					break;
				case "2":
					inputclass.output();
					break;
				case "3":
					out.println("종료");
					break;
			}
		}
	}
}

  
