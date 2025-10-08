import java.util.Scanner;

class Calculator {
    double add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    double add(int a, int b, int c) {
        return a + b + c;
    }

    double subtract(int a, int b) {
        return a - b;
    }

    double multiply(double a, double b) {
        return a * b;
    }

    double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero!");
            return 0;
        } else {
            return (double) a / b;
        }
    }
}

class UserInterface {
    Scanner sc = new Scanner(System.in);
    Calculator calc = new Calculator();

    void performAddition() {
        System.out.println("Choose Addition Type:");
        System.out.println("1. Two integers");
        System.out.println("2. Two doubles");
        System.out.println("3. Three integers");
        System.out.print("Enter your choice: ");
        int ch = sc.nextInt();

        if (ch == 1) {
            System.out.print("Enter two integers: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Result: " + calc.add(a, b));
        } else if (ch == 2) {
            System.out.print("Enter two double values: ");
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            System.out.println("Result: " + calc.add(x, y));
        } else if (ch == 3) {
            System.out.print("Enter three integers: ");
            int p = sc.nextInt();
            int q = sc.nextInt();
            int r = sc.nextInt();
            System.out.println("Result: " + calc.add(p, q, r));
        } else {
            System.out.println("Invalid choice!");
        }
    }

    void performSubtraction() {
        System.out.print("Enter two integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Result: " + calc.subtract(a, b));
    }

    void performMultiplication() {
        System.out.print("Enter two double values: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("Result: " + calc.multiply(a, b));
    }

    void performDivision() {
        System.out.print("Enter two integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        double result = calc.divide(a, b);
        if (b != 0) {
            System.out.println("Result: " + result);
        }
    }

    void mainMenu() {
        int choice;
        do {
            System.out.println("\n===== Calculator Application =====");
            System.out.println("1. Add Numbers");
            System.out.println("2. Subtract Numbers");
            System.out.println("3. Multiply Numbers");
            System.out.println("4. Divide Numbers");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 1)
                performAddition();
            else if (choice == 2)
                performSubtraction();
            else if (choice == 3)
                performMultiplication();
            else if (choice == 4)
                performDivision();
            else if (choice == 5)
                System.out.println("Exiting... Thank you!");
            else
                System.out.println("Invalid choice!");
        } while (choice != 5);
    }

    public static void main(String[] args) {
        UserInterface ui = new UserInterface();
        System.out.println("Welcome to the Calculator Application!");
        ui.mainMenu();
    }
}
