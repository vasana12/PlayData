package classtest;

public class CalssTest {

	public static void main(String[] args) {
		StringBuffer obj;
		obj = new StringBuffer("Hey java");
		obj.deleteCharAt(1);
		obj.deleteCharAt(1);
		obj.insert(1, 'i');
		
		System.out.println(obj);
		obj.insert(3,"good ");
		System.out.println(obj);
	}

}
