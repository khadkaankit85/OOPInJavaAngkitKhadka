import java.util.Scanner;
import java.util.ArrayList;

public class PurchaseForUser {

    static class Purchase<T> {
        private ArrayList<T> items;
        private ArrayList<Double> prices;

        public Purchase() {
            items = new ArrayList<>();
            prices = new ArrayList<>();
        }

        public void addItem(T item, double price) {
            items.add(item);
            prices.add(price);
        }

        public double totalBill() {
            double finalBill = 0;
            for (Double price : prices) {
                finalBill += price;
            }
            return finalBill;
        }

        public void Bill() {
            System.out.println("Welcome to CSD121 TEST");
            System.out.println("My Name is Angkit Khadka.");
            System.out.println("My Student Id is 23058064");
            System.out.println("Your Entered Items and Prices are:");

            for (int i = 0; i < items.size(); i++) {
                System.out.println(items.get(i) + "-" + prices.get(i));
            }
            System.out.println(" Total bill: " + totalBill());
        }
    }

    public static void main(String[] args) {
        String item;
        double price;
        Scanner input = new Scanner(System.in);
        Purchase<String> purchase = new Purchase<>();
        System.out.println("Enter list of Item and Price (Type 'end' to finish) ");
        while (true) {
            System.out.print("Item: ");
            item = input.nextLine();
            if (item.equalsIgnoreCase("end")) {
                break;
            }
            System.out.print("Price: $");
            price = Double.parseDouble(input.nextLine());
            purchase.addItem(item, price);
        }
        System.out.println();
        System.out.println("Total Amount:");
        purchase.Bill();
    }
}
