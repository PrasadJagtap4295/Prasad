/*Calculate average of numbers using Array*/

import java.util.Scanner;
public class arrayAvrage {
	public static void main(String args[]) 
	{
		Scanner  sc =new Scanner(System.in);
		int i, n;
		double sum=0, avg;
	
	System.out.println("Enter the array numbers :   ");
	
		int si =sc.nextInt();
		int arr [] = new int [si];
		System.out.println("you are entering no of array size  = "+ si + "  please enter the " + si + "   numbers");
		
		for (int j = 0; j < si; j++) 
		{
			
			arr [j]=sc.nextInt(); 
			sum=sum+ arr[j];
		}
		
		avg= sum/si;
		System.out.println("your average  of numbers is =  " + avg);
		
	}

}
