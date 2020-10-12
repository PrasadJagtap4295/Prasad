import java.util.Scanner;
public class BinaryNumbersAddition {
	

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		System.out.println("This is the binary addition Program");
		
		System.out.println("Give First binary no");
		int firstNumber = scan.nextInt();
		
		System.out.println("Give second Binary no");
		int secondNumber = scan.nextInt();
		
		int sum = (firstNumber+secondNumber);
		
		System.out.println(Integer.toBinaryString(sum));
		
		scan.close();
		
		
		
		
		
		

	}

}
