package arrayTest;

public class ArrayTest {

	public static void main(String[] args) {
		int a [] = new int [2];
	    int b [];
	    a = array(a);
	    b = array2(a);
	    
	    for(int i = 0; i < a.length; i++){
	        System.out.println(a[i]);
	    }
	    for(int i = 0; i < b.length; i++){
	        System.out.println(b[i]);
	    }
	}
	static int[] array(int arr [] ){
	    arr[0] = 1;
	    arr[1] = 2;
	    return arr;
	}
	static int[] array2(int num[]){
	    num[0] = 3;
	    num[1] = 4;
	    return num;

	}

}
