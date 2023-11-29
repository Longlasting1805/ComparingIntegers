import java.util.Scanner;

public class ComparingIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int number1 = input.nextInt();

        System.out.print("Enter second number: ");
        int number2 = input.nextInt();

        if (number1 > number2){
            System.out.println(number1 + " is larger");
        } else if (number1 < number2) {
            System.out.println(number2 + " is larger");
        } else {
            System.out.println("those numbers are equal");
        }


    }
}
