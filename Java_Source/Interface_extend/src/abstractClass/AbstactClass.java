package abstractClass;
import static java.lang.System.out;

abstract public class AbstactClass {
	String Name;
	String Title;

	AbstactClass(String title, String Name){
		this.Name = Name;
		this.Title = title;
	}
	
	abstract void sendMassage(String contents);

}