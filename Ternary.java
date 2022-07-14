
public class Ternary {

	public static void main(String[] args) {
		int age = 19;
		boolean hasLicence = true;
		
		Boolean carDrive = (age>=18) ? true : false ;
		
		String carRent = carDrive ? (hasLicence ? "true" : "false") : "CantReant";
		
		System.out.println("Age = " + age);
		System.out.println("Has Licence : " + hasLicence);
		System.out.println("Can Drive the Car : " + carDrive );
		System.out.println("Can rent the car : " + carRent);
		

	}

}
