package package1;

import package1.package2.PackageClass2;

public class PackageClass1 extends PackageClass2{
	
	PackageClass1(String a, String b, String c){
		super(a,b,c);
	}
	PackageClass2 pc2 = new PackageClass2("a","b","c");

}