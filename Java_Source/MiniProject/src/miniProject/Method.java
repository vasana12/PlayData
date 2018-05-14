package miniProject;

import static java.lang.System.out;

import java.util.ArrayList;
import java.util.Scanner;

public class Method {
	
	DataClass DC1;                                           //���۷��� ���� DC1�� ����.  �ش� ������ dataclassŸ���� "��ü"�� ����ų�� ����.
	
	public void input(Scanner sc, ArrayList<DataClass> dc) { //��� �޼ҵ�, �Ű������� ��ĳ�� "sc"��  Ŭ������ ���� Arraylist "dc"�� ����
		DC1 = new DataClass();								 // dataclass�� �ν��Ͻ� DC1 ����(��ü�� ����)
		
		out.println("=======�������Է�======= ");
		
		int a =dc.size() + 1;                    			 //dc.size�� Ŭ������ ��� �迭�� ũ�⸦ �ǹ���. 0���� �����ϱ⿡ + 1�� ����
		out.println("***DataClass"+ (a) + "*** ���� : ");   //a�� Arraylist�� ��� "������ ��ȣ"�� �ǹ���.
		DC1.data1= sc.nextLine();						     //DC1�� �ʵ忡 data1�� ���� ����

		out.println("***DataClass"+ (a) + "*** ���� : ");
		DC1.data2= sc.nextLine();
	
		out.println("***DataClass"+ (a) + "*** ���ǻ� : ");
		DC1.data3= sc.nextLine();
	
		out.println("***DataClass"+ (a) + "*** ���� : ");
		DC1.data4= sc.nextLine();
	
		out.println("***DataClass"+ (a) + "*** �ٰŸ� : ");
		DC1.data5= sc.nextLine();
		
		out.println("***DataClass"+ (a) + "*** ��ﳲ�� �۱� : ");
		DC1.data6= sc.nextLine();
		
		out.println("***DataClass"+ (a) + "*** ���� (1~5 �Է�): ");
		DC1.data7= sc.nextLine();
		
		while(	!(DC1.data7.equals("0"))&&
				!(DC1.data7.equals("1"))&&
				!(DC1.data7.equals("2"))&&
				!(DC1.data7.equals("3"))&&
				!(DC1.data7.equals("4"))&&
				!(DC1.data7.equals("5"))
			  ) 
		{
			out.println("������ ���� 1���� 5�� ���� �Է�): ");
			DC1.data7= sc.nextLine();
		}
		
		
		out.println("=======�Է�  ����======= ");
		
		dc.add(DC1);										//�Ű������� ���� Arraylist dc��   dataclass�� ��ü DC1�� ���� 
		DC1 = null;											//DC1 -> ��ü�� ����Ű�� ����. ���� ���� null�� �θ� �� �̻� ��ü�� ����Ű�� ����. �ش� ��ü�� ������ ���� ��. -> �޸� �ڵ� ����
		return;
	}
	
	public void modify(int i, ArrayList<DataClass> dc, Scanner sc) { // i�� ����ڰ� ���� �Ϸ��� ������ ��ȣ
		
		if(dc.size() < i) {									//i�� ����� �������� ������ �ʰ��ϸ� 
			out.println("�ش� �����ʹ� ���� ���� ����.");			//�ش� ������ ����
			return;											//����
		}
		
		DC1 = new DataClass();								//�׷��� �ʴٸ�  ���� �����ϱ� ���� ���ο� dataclass��ü ����

		out.println("***DataClass"+ i +"*** ���� : ");
		DC1.data1= sc.nextLine();

		out.println("***DataClass"+ i +"*** ���� : ");
		DC1.data2= sc.nextLine();
	
		out.println("***DataClass"+ i +"*** ���ǻ� : ");
		DC1.data3= sc.nextLine();
	
		out.println("***DataClass"+ i +"*** ���� : ");
		DC1.data4= sc.nextLine();
	
		out.println("***DataClass"+ i +"*** �ٰŸ� : ");
		DC1.data5= sc.nextLine();
		
		out.println("***DataClass"+ i +"*** ��ﳲ�� �۱� : ");
		DC1.data6= sc.nextLine();
		
		out.println("***DataClass"+ i + "*** ���� (1~5 �Է�): ");
		DC1.data7= sc.nextLine();
		
		while(	!(DC1.data7.equals("0"))&&
				!(DC1.data7.equals("1"))&&
				!(DC1.data7.equals("2"))&&
				!(DC1.data7.equals("3"))&&
				!(DC1.data7.equals("4"))&&
				!(DC1.data7.equals("5"))
			  ) 
		{
			out.println("������ ���� 1���� 5�� ���� �Է�): ");
			DC1.data7= sc.nextLine();
		}
		
		dc.set(i-1,DC1);                                   //Arraylist��  i-1��° �����Ϳ� DC1���� �� ����
		DC1= null;										   //DC1 -> ��ü�� ����Ű�� ����. ���� ���� null�� �θ� �� �̻� ��ü�� ����Ű�� ����. �ش� ��ü�� ������ ���� ��. -> �޸� �ڵ� ����
	
		out.println("=======����  ����======= ");
		return;
	}
	
	public void search(int i, ArrayList<DataClass> dc, Scanner sc) { // i�� ����ڰ� ���� �Ϸ��� ������ ��ȣ
		
		out.println("=======��������ȸ======= ");
		try 
		{
			printMethode(i-1,dc);                         //printMEthode �޼ҵ� ȣ��
		}
		catch(java.lang.IndexOutOfBoundsException e)      //ArrayList�� ������ �ʰ���
		{
			out.println("�ش� �����ʹ� ���� ���� ����.");

		}
		catch(java.lang.NumberFormatException e) {  	  //enter �� �ٸ� ���� �Է½�
			out.println("�ش� �����ʹ� ���� ���� ����.");
		}

		out.println("=======��ȸ   ����======= ");
		return;
	}
	
	public void output(ArrayList<DataClass> dc) {
		
		out.println("=======���������======= ");
		for(int j = 0; j < dc.size(); j ++) {
			printMethode(j, dc);							//printMEthode �޼ҵ� ȣ��
		}
		out.println("=======���   ����======= ");
		return;
	}
	
	private void printMethode(int i, ArrayList<DataClass> dc) { // �����͸� ����ϴ� �޼ҵ�
		try 
		{
			DC1 = dc.get(i);                                 //�ʵ� DC1�� ArrayList dc�� i��° dataclass ��ü�� ����.
			out.printf("\n***���� : %2s***\n"
					+ "���� : %2s\n"
					+ "���ǻ� : %2s\n"
					+ "���� : %2s\n"
					+ "�ٰŸ� : %2s\n"
					+ "��￡ ���� �۱� : %2s\n"
					,
					DC1.data1, DC1.data2, DC1.data3, 		// DC1�� ����Ű�� ��ü�� �ʵ带 ���
					DC1.data4, DC1.data5, DC1.data6 );
			
			out.printf("���� : ");
			
			int starNum = Integer.parseInt(DC1.data7);
			
			if(starNum == 0) {
				out.print("��\n\n");
				return;
			}
			for(int k = 1; k <= starNum ; k++ ) {
				
				out.print("��");
			}
			out.print("\n\n");
			
		}
		catch(java.lang.IndexOutOfBoundsException e)
		{
			out.println("�ش� �����ʹ� ���� ���� ����.");
			DC1= null;
		}
		catch(java.lang.NumberFormatException e) {
			out.println("�ش� �����ʹ� ���� ���� ����.");
		}
		finally 
		{
			DC1= null;      //DC1 -> ��ü�� ����Ű�� ����. ���� ���� null�� �θ� �� �̻� ��ü�� ����Ű�� ����. �ش� ��ü�� ������ ���� ��. -> �޸� �ڵ� ����
		}
		
		return;
	}
	
	
	public void delete(int i, ArrayList<DataClass> dc) {
		out.println("=======�����ͻ���======= ");
		try 
		{
			dc.remove(i-1);     //����ڰ� ���ϴ� i��° �����͸� ������
		}
		catch(java.lang.IndexOutOfBoundsException e)
		{
			out.println("�ش� �����ʹ� ���� ���� ����.");
			DC1= null;
		}
		catch(java.lang.NumberFormatException e) {
			out.println("�ش� �����ʹ� ���� ���� ����.");
		}
		finally 
		{
			DC1= null;
		}
		
		out.println("=======����   �Ϸ�======= ");
		return;
	}

}
