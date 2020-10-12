
public class SwapNumbers {

    public static void main(String[] args) {

        float first = 2.0f, second = 3.2f;

        System.out.println("Before swap");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);

        float temporary = first;

        first = second;
    
        second = temporary;

        System.out.println("After swap");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);
    }
}
