
public class Loops {
	public static void main(String args[]) {
		// all even no b/w 22 & 98;
		/*int i=0;
		for(i=22;i<=98;i++) {
			int num=i;
			
			if(num%2 == 0) 
				System.out.println(num);
			
			else 
				System.out.println("not even");
				
			
				
		}*/
		int i=0;
		int sum =0;
		for(i=1;i<=100;i++) {
			if((i%3==0) && (i%5==0))
				sum+=i;
				System.out.println(sum);
			else
				System.out.println("not devisible");
		}
		
	}

}


