import java.util.Scanner;
import java.util.Random;

public class Subtraction {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        int number1 = rand.nextInt();
        int number2 = rand.nextInt();
        if (number1 < number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }
        System.out.println("What is " + number1 + " - " + number2 + "?");
        int studentAnswer = input.nextInt();
        if (number1 - number2 == studentAnswer) {
            System.out.println("correct answer!");
        } else {
            System.out.println("incorrect Answer!");
            System.out.println(number1 + " - " + number2 + " should be " + (number1 - number2));
        }

        input.close();
    }
}
