
 import java.util.Scanner;
public class Revar {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n,i;
        System.out.print("ENTER NUMBER OF ELEMENTS : ");
        n=in.nextInt();

        int arr[]=new int[n];
        System.out.print("ENTER ELEMENTS : ");
        for(i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        System.out.print("ENTERED ELEMENTS ARE :   ");
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i] + " ");
        }

        System.out.print("\n"+"REVERSE OF ELEMENTS IS : ");
        for(i=(n-1);i>=0;i--)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
