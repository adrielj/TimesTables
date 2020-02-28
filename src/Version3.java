import java.util.Scanner;
public class Version3  {
	
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
		
		Scanner in = new Scanner (System.in);
		
		System.out.print("Type in your first number: ");
		int i = in.nextInt();
		
		
		System.out.print("Type in your second number: ");
		int a = in.nextInt();
		
		System.out.printf("     ");
		for (int x = 1; x<=a; x++) {
			
			System.out.printf("%5d",x);	
			
		}
		
		System.out.println();
		System.out.println("_______________________________________________________");
		
		getProduct(i, a);
		
	}
}