
public class strings {

	public static void main(String[] args) {
		//Strint littral method;
		
		String name = "Max";
		System.out.println("length of the name " + name.length());

		// various ways to creat string;

		String s1 = new String("way number 2");
		System.out.println(s1);
		
		char[] c = {'h','e','l'};
		String s2 = new String(c);
		System.out.println(s2);
		
		byte[] b = {45,56,67};
		String s3 = new String(b);
		System.out.println(s3);
		
		
		

	}

}
