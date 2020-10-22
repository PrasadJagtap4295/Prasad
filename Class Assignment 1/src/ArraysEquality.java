/*
Q2. Write a java program to check the equality of two integer arrays.
Notes :
     Create two integer array by taking input from user (using Scanner)
     Check if both array contains same values */

import java.util.Scanner;

public class ArraysEquality {

	public static void main(String args[]) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Size of Integer Array 1");
		int num = scan.nextInt();
		int [] a1= new int[num];
		System.out.println("Enter the Array Element of Array 1 (Press enter after every element)");	
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
	
		boolean equalOrNot = true;
        
        if(a1.length == a2.length)
        {
            for (int i = 0; i < a1.length; i++)
            {
                if(a1[i] != a2[i])
                {
                    equalOrNot = false;
                }
            }
        }
        else
        {
            equalOrNot = false;
        }
         
        if (equalOrNot)
        {
            System.out.print(" Arrays Are Equal");
        }
        else
        {
            System.out.print(" Arrays Are Not equal");
        }
    }
		
		
}

