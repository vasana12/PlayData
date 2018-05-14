package scoreHashMap;

import static java.lang.System.out;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;


public class MethodClass {
	   ScoreClass DC1;                                
	   
	   public void input(Scanner sc, HashMap<String, ScoreClass> dc) { 
	      out.println("=======데이터입력======= ");                                  			  
	      out.println("***DataClass*** 학번 : ");   
	      
	      String num = sc.nextLine();
	      DC1 = new ScoreClass(num);
	      
	      Set<String> keySetdata = dc.keySet();
	      for(String a : keySetdata) {
	         if(a.equals(num)) {
	        	  out.println("중복된 학번 ");
	        	  return;
	         }
	      }

	      out.println("***DataClass*** 이름 : ");
	      DC1.name = sc.nextLine();
	   
	      out.println("***DataClass*** 국어 : ");
	      String kor = sc.nextLine();
	      if( checkNum(kor)) {
	    	  DC1.kor = kor;
	      }else {
	    	  return;
	      }
      
	      out.println("***DataClass*** 영어 : ");
	      kor = sc.nextLine();
	      if( checkNum(kor)) {
	    	  DC1.eng = kor;
	      }else {
	    	  return;
	      }
	     
	      out.println("***DataClass*** 수학 : ");
	      kor = sc.nextLine();
	      if( checkNum(kor)) {
		      DC1.mat = kor;
	      }else {
	    	  return;
	      }      
      
	      out.println("=======입력  종료======= ");
	      dc.put(num,DC1);  
	      process(num,dc);
	      ChooseGrade(num,dc);
	                              
	      return;
	   }
	   
	   public boolean checkNum(String a) {
		   try { 
			   Integer.parseInt(a);
			   return true;
		   }
		   catch(java.lang.NumberFormatException e) {       
		         out.println("숫자 입력.");
		       return false;
		   }
		  
	   }
	   
	   public void modify(String hashCode, HashMap<String, ScoreClass> dc, Scanner sc) {
	      
		  if(dc.get(hashCode)==null) {
			 out.println("해당 학번 없음.");
			 return;
		  }
	                          
	      String num = hashCode;
	      DC1 = new ScoreClass(num);

	      out.println("***DataClass*** 이름 : ");
	      DC1.name = sc.nextLine();
	   
	      out.println("***DataClass*** 국어 : ");
	      String kor = sc.nextLine();
	      if( checkNum(kor)) {
	    	  DC1.kor = sc.nextLine();
	      }else {
	    	  return;
	      }
      
	      out.println("***DataClass*** 영어 : ");
	      kor = sc.nextLine();
	      if( checkNum(kor)) {
	    	  DC1.eng = kor;
	      }else {
	    	  return;
	      }
	     
	      out.println("***DataClass*** 수학 : ");
	      kor = sc.nextLine();
	      if( checkNum(kor)) {
		      DC1.mat = kor;
	      }else {
	    	  return;
	      }        
	      dc.put(num,DC1);                            
	      process(hashCode,dc);
	      ChooseGrade(num,dc);
	      out.println("=======수정  종료======= ");
	      return;
	   }
	   
	   public void process(String hashCode,HashMap<String, ScoreClass> dc) {
		   int kor = Integer.parseInt((dc.get(hashCode).kor));
		   int eng = Integer.parseInt((dc.get(hashCode).eng));
		   int mat = Integer.parseInt((dc.get(hashCode).mat));
		   int tot = kor + eng + mat;
		   float avg = tot/3.f;
		   DC1.tot = Integer.toString(tot);
		   DC1.avg = Float.toString(avg);
	   }
	   
	   public void search(String hashCode,  HashMap<String, ScoreClass> dc, Scanner sc) { 
	      
	      out.println("=======데이터조회======= ");
	      if((dc.get(hashCode)!=null)) {
	    	  
	         printMethode(hashCode,dc);                         
	      }else {
	    	    out.println("해당 데이터는 존재 하지 않음.");
	      }
	    
	      out.println("=======조회   종료======= ");
	      return;
	   }
	   
	   public void output(HashMap <String, ScoreClass> dc) {
	      Set<String> keySetdata = dc.keySet();
	      out.println("=======데이터출력======= ");
	      for(String a : keySetdata) {
	         printMethode(a, dc);                    
	      }
	      out.println("=======출력   종료======= ");
	      return;
	   }
//	   public void output(HashMap <String, ScoreClass> dc) {
//		   Set entryset = dc.entrySet();
//		   
//		   if(entryset.size() == 0) {
//			   out.println("데이터 없음");
//			   return;
//		   }
//		   
//		   Iterator it_entry = entryset.iterator();
//		   
//		   while(it_entry.hasNext()) {
//			   Map.Entry e = (Map.Entry) it_entry.next();
//			   obj = (ScroeClass)e.getValue();
//		   }
//		   
//	   }
	   InputStreamReader ipsr = new InputStreamReader(System.in);
	   BufferedReader br = new BufferedReader(ipsr);
	   
	   private void printMethode(String hasCode,  HashMap<String, ScoreClass> dc) { 
	      if(!(dc.get(hasCode)==null)) {
	    	  
	         DC1 = dc.get(hasCode);  
	         
	         out.printf("\n***학번 : %2s***\n"
	               + "이름 : %2s\n"
	               + "국어 : %2s\n"
	               + "영어 : %2s\n"
	               + "수학 : %2s\n"
	               + "총점 : %2s\n"
	               + "평균 : %2s\n"
	               + "학점 : %2s\n"
	               ,
	               DC1.num, DC1.name, DC1.kor,       
	               DC1.eng, DC1.mat, DC1.tot,
	               DC1.avg, DC1.grade );    
	      }
	      else {
	         out.println("해당 데이터는 존재 하지 않음.");
	      }
	      
	      return;
	   }
	   
	   public void delete(String hashCode,  HashMap<String, ScoreClass> dc) {
	      out.println("=======데이터삭제======= ");
	      
	      if(!(dc.get(hashCode) ==null)) {
	    	  dc.remove(hashCode);
	      }else {
	    	  out.println("해당 데이터는 존재 하지 않음.");
	      }
	      
	      out.println("=======삭제   완료======= ");
	      return;
	   }
	   
	   public void ChooseGrade(String hashCode, HashMap<String, ScoreClass> dc) {
		   int a = (int)(Float.parseFloat(dc.get(hashCode).avg)/10);
		   
		   switch(a) {
		   		case 10:
		   		case 9:
		   			dc.get(hashCode).grade = "수";
		   			break;
		   		case 8:
		   			dc.get(hashCode).grade = "우";
		   			break;
		   		case 7:
		   			dc.get(hashCode).grade = "미";
		   			break;
		   		case 6:
		   			dc.get(hashCode).grade = "양";
		   			break;
		   		default :
		   			dc.get(hashCode).grade = "가";
		   			break;
		   }
	   }

}
