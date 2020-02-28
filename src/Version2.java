
public class Version2  {
	
	public static void getProduct (int x, int y ) {
		
			for (int i = 1; i <= x; i++) {
			
				System.out.printf("%2d | ",i);
			
				for (int a = 1; a <= y; a++) {
				
					System.out.printf("%5d",(a * i));
				}
			
			System.out.println(); 
			
		}
	}
	
	public static void main(String args[]) {
		
		System.out.printf("     ");
		
		int i = 10;
		int a = 10;
		
		
		for (int x = 1; x<=10;x++) {
			
			System.out.printf("%5d",x);	
			
		}
		
		System.out.println();
		System.out.println("_______________________________________________________");
		
		getProduct(i, a);
		
	}
}
