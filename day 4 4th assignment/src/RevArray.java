/* • Reverse an array */
import java.util.Scanner;
public class RevArray {
	public static void main(String args[]) 
	{
		 		
		Scanner scan =new Scanner(System.in);
		System.out.print("Enter the Number of element=  ");
		int i = scan.nextInt();
		
		int arr[] = new int[i];
		
		System.out.print("Enter elements = ");
		for (int j = 0; j < arr.length; j++) {
			
			arr[j]=scan.nextInt();
		}
	  
		
		System.out.print("Enterd no of array element array are = ");
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j]+ "  ");
		}
		System.out.print("\nAnd the revers array is be like = ");	
		for (int j= (i-1); j>=0;j--) {
			System.out.print(arr [j]+ " ");
			scan.close();
		}
		
	}

}
