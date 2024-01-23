import java.util.Scanner;


public class FunctionsAndMethods {
    public static void main(String[] args){
        System.out.println("Enter three numbers to find the largest number.: ");
        Scanner input =new Scanner(System.in);
        double a = input.nextDouble();
        System.out.println("Second Number: ");
        double b =input.nextDouble();
        System.out.println("Third Number: ");
        double c=input.nextDouble();

        double maximumNumber=findMaximumNumber(a,b,c);
        System.out.print("The largest number is: ");
        System.out.println(maximumNumber);
    }

    public static double findMaximumNumber(double x,double y, double z){

        if (x>=y && x>=z){
            return x;
        }
        else if (y>=x && y>=z){
        return y;
        }

        else{
            return z;
        }
        }



}
