import java.util.Arrays;
import java.util.Scanner;
public class Array{
	public static void main(String args[]) {
	
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter the Size of Integer Array 1");
	int num = scan.nextInt();
	int [] a1= new int[num];
	System.out.println("Enter the Array Element of Array (Press enter after every element)" );	
	for (int i = 0; i < a1.length; i++) {
	a1[i]=scan.nextInt();
	} 	
    
	System.out.println("Enter the Size of Integer Array 2");
	int numb = scan.nextInt();
	int [] a2= new int[numb];
	System.out.println("Enter the Array Element of Array 2 (Press enter after every element)");
	for (int i = 0; i < a2.length; i++) {	
	a2[i]=scan.nextInt();
	} 	
	
	System.out.print("Result = ");
	scan.close();
	boolean checking=Arrays.equals(a1,a2);
	{
	
	if(checking==true) 
	{
		System.out.print("Arrays are equal");
	}
	else {
		System.out.print("Arrays are Not Equal");
	}

}
}
}