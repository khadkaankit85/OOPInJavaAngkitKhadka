import java.util.Scanner;

public class RpgLoan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("RPG LOAN PROVIDERS.");
        System.out.println("Loan Type\tInterest Rate");
        System.out.println("1. Home Loan\t4.2%");
        System.out.println("2. Car Loan\t3.9%");
        System.out.println("3. Gold Loan\t5.2%");
        System.out.println("4. Study Loan\t2.8%");
        System.out.println("5. Business Loan\t5.8%");
        System.out.println("6. Exit");

        System.out.println("Enter your family annual income:");
        double annualIncome = input.nextDouble();

        if (annualIncome < 80000) {
            System.out.println("You are not eligible to get the loan from RPG Loan Providers.");
        } else {
            try {
                System.out.println("Which loan are you seeking to get? (Please select at least two)");

                int loanTypeOne;
                int loanTypeTwo;

                do {
                    System.out.print("Enter first loan type (1-5): ");
                    if (!input.hasNext()) {
                        System.out.println("Error: Please enter a valid input.");
                        input.next();
                        continue;
                    }
                    loanTypeOne = input.nextInt();

                    if (loanTypeOne == 6) {
                        System.out.println("Exiting...");
                        System.out.println("Have a Good Time.");
                        break;
                    } else if (loanTypeOne < 1 || loanTypeOne > 5) {
                        System.out.println("Invalid loan type. Please enter a number between 1 and 5.");
                        continue;
                    }

                    do {
                        System.out.print("Enter second loan type (1-5): ");
                        loanTypeTwo = input.nextInt();

                        if (loanTypeTwo == 6) {
                            System.out.println("Exiting...");
                            System.out.println("Have a Good Time.");
                            break;
                        } else if (loanTypeTwo < 1 || loanTypeTwo > 5) {
                            System.out.println("Invalid loan type. Please enter a number between 1 and 5.");
                        } else if (loanTypeOne == loanTypeTwo) {
                            System.out.println("Please select a different loan type.");
                        }
                    } while (loanTypeTwo < 1 || loanTypeTwo > 5 || loanTypeOne == loanTypeTwo);

                    if (loanTypeOne == 6 || loanTypeTwo == 6) {
                        break;
                    }

                    System.out.print("Enter the number of monthly installments (6-60): ");
                    if (!input.hasNextInt()) {
                        System.out.println("Error: Please enter a valid input.");
                    } else {
                        int numInstallments = input.nextInt();

                        if (numInstallments < 6 || numInstallments > 60) {
                            System.out.println("Error: Number of monthly installments should be between 6 and 60.");
                        } else {
                            System.out.println("Loan approved! Further processing...");
                            break;
                        }
                    }
                } while (true);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        input.close();
    }
}
