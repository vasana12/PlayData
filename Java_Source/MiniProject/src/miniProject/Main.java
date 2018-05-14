package miniProject;
import static java.lang.System.in;
import static java.lang.System.out;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		int i;
		Scanner sc = new Scanner(in);		
		Method mt =  new Method();  //메소드 클래스의 객체 생성. 해당 객체를 mt가 가르킴
		ArrayList <DataClass> dc = new ArrayList <DataClass>(); //ArrayList를 생성. 
																//dc가 해당 ArrayList를 가르킴

		breakpoint:
		while(true) {
			
			out.println("========서재정리========");
			out.println("책 데이터 입력 : 1");
			out.println("데이터 조회 : 2");
			out.println("데이터 출력 : 3");
			out.println("데이터 수정 : 4");
			out.println("데이터 삭제 : 5");
			out.println("프로그램 종료 : 6");
			out.println("=====================");
				
			String answer = sc.nextLine(); //입력 저장
			
			switch (answer) { //입력에 따라 해당 case문 실행
			
				case "1":
					while (!answer.equals("exit"))  // 입력을 연속으로 받기위한 while문 exit 입력시 해당 루프 종료
					{
						mt.input(sc,dc);            //메소드 호출
						out.println("입력 종료 시 : exit ");
						answer = sc.nextLine();
					}
					break;
					
				case "2":
					out.println("=======데이터조회======= ");
					out.println("조회할 데이터 입력 : ");
					i = Integer.parseInt((sc.nextLine()));		
					mt.search(i, dc, sc); 					//메소드 호출
					break;			
					
				case "3":
					mt.output(dc);
					break;			
					
				case"4":
					out.println("=======데이터수정======= ");
					out.println("수정할 데이터 입력 : ");
					i = Integer.parseInt((sc.nextLine()));		
					mt.modify(i, dc, sc); 				  //메소드 호출
					break;			
					
				case "5":
					out.println("=======데이터삭제======= ");
					out.println("수정할 데이터 입력 : ");
					i = Integer.parseInt((sc.nextLine()));		
					mt.delete(i,dc); 					  //메소드 호출
					break;			
					
				case "6":
					out.println("종료");
					break breakpoint;
					
				default:
					out.println("다시 입력하세요"); 			 //1~6이외의 값을 입력시 다시 실행.
					continue ;
			}
		}

	}
}
