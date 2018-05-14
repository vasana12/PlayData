package sungjuk;
import java.util.Scanner;

public class SungjukEx02 {
	
	final static int MAX = 10;
	
	public static void main(String[] args) {
		String hakbun[] = new String[MAX];
		String irum[] = new String[MAX];
		int kor[] = new int[MAX];
		int eng[] = new int[MAX];
		int math[] = new int[MAX];
		int tot[] = new int[MAX];
		double avg[] = new double[MAX];
		String grade[] = new String[MAX];

		int i=0, cnt = 0;
		double total_avg = 0;
		
		double[] totCnt = inputData(hakbun,irum , kor , eng ,math, tot , avg, grade, i, cnt, total_avg);
		printOutput(hakbun,irum , kor , eng ,math, tot , avg,grade, i, totCnt);
			
		
	}
	static double[] inputData(String hakbun[],String irum[] ,int kor[] ,int eng[] ,int math[],int tot[] ,double avg[] ,String grade[],int i, int cnt, double total_avg) {

		Scanner in = new Scanner(System.in);
		double totcnt[] = new double [2];
		
		for (i=0; i < MAX; i++)
		{
			System.out.print("학번 => ");
			hakbun[i] = in.next();
			if (hakbun[i].equals("exit"))
				return totcnt;
			
			System.out.print("이름 => ");
			irum[i] = in.next();
			System.out.print("국어 => ");
			kor[i] = in.nextInt();
			System.out.print("영어 => ");
			eng[i] = in.nextInt();
			System.out.print("수학 => ");
			math[i] = in.nextInt();
			
			tot[i] = kor[i] + eng[i] + math[i];
			avg[i] = tot[i] / 3.;
			total_avg += avg[i];
			
			switch((int) avg[i] / 10)
			{
				case 10:
				case 9:
					grade[i] = "수";
					break;
				case 8:
					grade[i] = "우";
					break;
				case 7:
					grade[i] = "미";
					break;
				case 6:
					grade[i] = "양";
					break;
				default:
					grade[i] = "가";
					break;
			}
			cnt++;
			System.out.println();
			
			totcnt[0] = total_avg;
			totcnt[1] = cnt;
			
		}
		return totcnt;
	}
		static void printOutput(String hakbun[],String irum[] ,int kor[] ,int eng[] ,int math[],int tot[] ,double avg[] ,String grade[],int i, double totCnt[])
		{
			System.out.println("\n\t\t *** 성적표 ***");
			System.out.println("==============================================");
			System.out.println("학번       이름      국어      영어      수학      총합      평균      등급");
			System.out.println("==============================================");
			for (i=0; i<totCnt[1]; i++)
			{
				System.out.printf("%4s  %3s    %3d   %3d   %3d   %3d  %6.2f  %2s\n",
					hakbun[i], irum[i], kor[i], eng[i], math[i], tot[i], avg[i], grade[i]);
			}
			System.out.println("==============================================");
			System.out.printf("\t\t 총인원  : %d, 총 평균 : %5.2f\n", (int)totCnt[1], totCnt[0] /  totCnt[1]);
		}
}

