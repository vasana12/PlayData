package example;

import static java.lang.System.out;

import java.util.Scanner;

public class PersonInfo extends Person implements Personable{
	Scanner sc;
	String phone, addr;
	public static int cnt =0;
	
	PersonInfo(String hakburn, String irum){
		super(hakburn, irum);
		this.phone = "";
		this.addr = "";
	}
	
	@Override
	public void input() {
		this.sc = new Scanner(System.in);
			
		out.println("전화 번호 입력");
		this.phone = sc.nextLine(); 
		out.println("주소 입력");
		this.addr = sc.nextLine(); 

		cnt++;
		return;
	}
	@Override
	public void output() {
	
			out.printf("%4s %3s %3s %3s \n",
					super.hakbun, super.irum, this.phone, this.addr);
		
	}

}
