import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number, second number and the cycle");

        int numberOne = input.nextInt();
        int numberTwo = input.nextInt();
        int cycle = input.nextInt();


        System.out.println("The fibonacci series is: ");
        System.out.println(numberOne);
        System.out.println(numberTwo);
        
        for (int i = 0; i < cycle; i++) {
            int sum = numberOne + numberTwo;
            numberOne = numberTwo;
            numberTwo = sum;
            System.out.println(numberTwo);
        }
    }
}
