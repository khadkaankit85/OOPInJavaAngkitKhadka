import java.util.Scanner;

public class FindingAreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius to find the area of a circle: ");
        double radius = sc.nextFloat();
        double area = findArea(radius);
        System.out.println("The area of the circle is " + area);
    }

    public static double findArea(double a) {
        return (Math.PI * (a * a));
    }
}
