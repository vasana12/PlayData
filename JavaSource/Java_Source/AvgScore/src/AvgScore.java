import java.util.Scanner;
import static java.lang.System.out;

public class AvgScore {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String strData[][] = new String [100][8];
		String answer;
		int kor, mat, eng, tot, grade, i = 0, j = 0;
		float avg,totavg = 0;
			
		while (true) {
			out.println("학번 :");
			strData[i][0]= sc.next();	
			out.println("이름 :");
			strData[i][1] = sc.next();		
			out.println("국어 :");
			kor = sc.nextInt();		
			out.println("수학 :");	
			mat = sc.nextInt();
			out.println("영어 :");	
			eng = sc.nextInt();

			tot = kor + mat + eng;
			avg = tot/(float)3;
			grade = (int)(avg/10);
			
			switch (grade) {
				case 10:
				case 9:
					strData[i][7] = "수";
					break;
				case 8:
					strData[i][7] = "우";
					break;
				case 7:
					strData[i][7] = "미";
					break;
				case 6:
					strData[i][7] = "양";
					break;
				default:
					strData[i][7] = "가";
					break;
			}
								
			strData[i][2] = String.valueOf(kor);
			strData[i][3] = String.valueOf(mat);
			strData[i][4] = String.valueOf(eng);
			strData[i][5] = String.valueOf(tot);
			strData[i][6] = String.valueOf(avg);
				
			out.print("항목 추가 시 알파벳 아무키 입력, 없을 시 exit\n");		
			answer = sc.next();
			
			if(answer.equals("exit")) {
				break;
			}
			i++;
		}
		
		out.println("\n\t***판매현황***");
		out.println("===================================");
		out.println("    학번           이름           국어           수학           영어           총합           평균           등급  ");
		
		for(j = 0; j <= i; j++) {
			out.printf("%4s   %4s   %4s   %4s   %4s  %4s  %4.2f  %4s \n" ,
					   strData[j][0], strData[j][1], strData[j][2], strData[j][3], strData[j][4], strData[j][5], Float.parseFloat(strData[j][6]), strData[j][7]);
		}

		for(totavg=0, j =0; j <= i ;j++) {
			totavg += Float.parseFloat(strData[j][6]);
		}
		totavg = totavg/(float)(i+1);
		
		out.println("===================================");
		out.printf("               학생 수 : %d, 총 평균 : %.2f\n", i +1, totavg);	
		sc.close();
	}
}
