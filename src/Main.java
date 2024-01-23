//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean t=true;
        while (true) {
            System.out.println("Enter your number to check weather it's even or odd.");
            int a = input.nextInt();

            if (a < 0) {
                System.out.println("Your number is negative. ");
            } else if (a == 0) {
                System.out.println("Your number is zero.");

            } else if (a == 1) {
                System.out.println("1 is a Prime Number.");
            } else if (a % 2 == 0) {
                System.out.println("Your number is an even number = " + a);
            } else {
                System.out.println("Your Number is an odd number = " + a);
            }
        }
    }
    }
