import static java.lang.System.out;
public class Continue {

	public static void main(String[] args) {
		
outerFor : 
		for( int cnt = 0; cnt < 5; cnt++) {
			if(cnt == 3) {
				continue;
			}
			for(int i = 0; i < 5; i++) {
				out.printf("cnt= %d, i = %d\n",cnt, i);
				if(i ==2)
					continue outerFor;
			}
			
			
		}
		out.println("Done");
	}
}
