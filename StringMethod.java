
public class StringMethod {

	public static void main(String[] args) {
		String s = "Hellow world";
		System.out.println(s);
		System.out.println("length" +s.length());
		
		System.out.println("Index of w = " + s.indexOf('w'));
		System.out.println("Character at given index = " + s.charAt(5));
		System.out.println("to find the index of multiple same character " + s.indexOf('l',4));
		System.out.println("substring " + s.substring(3,6));
		String[] s3 = s.split("o");
		System.out.println("split by o: " + s3[0]);
		System.out.println("split by o: " + s3[1]);
		System.out.println("split by o: " + s3[2]);
	}

	
}
