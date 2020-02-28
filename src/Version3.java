import java.util.Scanner;
public class Version3  {
	
	//this is the method that takes the two inputs
	//and returns the corresponding table
	
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
		
		//these two variables determine the dimensions of the table
		
		System.out.print("Type in your first number: ");
		int i = in.nextInt();
		
		
		System.out.print("Type in your second number: ");
		int a = in.nextInt();
		
		System.out.println();
		//this line formats the amount of numbers on the top row
		
		System.out.printf("     ");
		for (int x = 1; x<=a; x++) {
			
			System.out.printf("%5d",x);	
			
		}
		
		
		//this formats the line under the top row of numbers based on the number
		
		System.out.println();
		System.out.print("______");
		
		for (int x = 1; x<=a; x++) {
			
		System.out.print("_____");
		
		}
		
		System.out.println();
		
		//this calls the method and prints out the table
		getProduct(i, a);
		in.close();
		
	}
}