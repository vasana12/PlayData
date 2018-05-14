package hashMap;

import java.util.HashMap;

public class HashMapEX {

	public static void main(String[] args) {
		Name obj1 = new Name("해리","포터");
		Name obj2 = new Name("게리","올드만");
		
		System.out.println("obj1 : "+obj1.hashCode()+" obj2 : "+ obj2.hashCode());
		
		HashMap <Name,Integer> hashtable = new HashMap<Name,Integer>();
		hashtable.put(new Name("abc","ABC"),new Integer(55));
		hashtable.put(new Name("cde","zzd"),new Integer(100));
		hashtable.put(new Name("qwr","xvs"),new Integer(200));
		
		System.out.print(hashtable.get(new Name("cde","zzd")));
		
	}

}
