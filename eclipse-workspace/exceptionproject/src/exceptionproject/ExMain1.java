package exceptionproject;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExMain1 {
	public static void main(String[] args) {
		
		int result = 0;
		Scanner sc = new Scanner (System.in); //Scanner class is used to get input
		sc.close();
		int arr[] = {23,45};
		
		try {
			System.out.println(arr[2]); //ArrayIndexOutOfBounds Exception - Checked exception
		}
		catch(ArrayIndexOutOfBoundsException ex){
			System.out.println("Sorry element not there");
		}
		
		try {
			System.out.println("Enter two integers");
			int x = sc.nextInt();
			int y = sc.nextInt();
			result = x/y; //Arithmetic Exception- Checked exception
		System.out.println("Result : "+result);
		}
		catch(ArithmeticException ex) {
			System.out.println("Zero divide not allowed");
		}
		catch(InputMismatchException ex) {

			System.out.println("Invalid inputs");
		}

		System.out.println("Proceeding to some other activity");
		
	}

}
