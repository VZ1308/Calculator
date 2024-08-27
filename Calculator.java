import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char choice;

        System.out.println("----Willkommen beim Taschenrechner----");

        // Schleife für die Auswahl des Operators
        while (true) {
            System.out.println("Bitte wählen Sie die Rechenart (+, -, *, /) aus: ");
            choice = scanner.next().charAt(0);

            if (choice == '+' || choice == '-' || choice == '*' || choice == '/') {
                break;
            } else {
                System.out.println("Ungültiger Operator! Bitte erneut versuchen.");
            }
        }

        double number1;
        // Schleife für die Eingabe der ersten Zahl
        while (true) {
            System.out.println("Bitte geben Sie die erste Zahl ein: ");
            if (scanner.hasNextDouble()) {
                number1 = scanner.nextDouble();
                break;
            } else {
                System.out.println("Ungültige Eingabe! Bitte geben Sie eine Zahl ein.");
                scanner.next();  // Eingabe überspringen, um die Schleife zu bereinigen
            }
        }

        double number2;
        // Schleife für die Eingabe der zweiten Zahl
        while (true) {
            System.out.println("Bitte geben Sie die zweite Zahl ein: ");
            if (scanner.hasNextDouble()) {
                number2 = scanner.nextDouble();
                break;
            } else {
                System.out.println("Ungültige Eingabe! Bitte geben Sie eine Zahl ein.");
                scanner.next();  // Eingabe überspringen, um die Schleife zu bereinigen
            }
        }

        double result = 0;

        switch (choice) {
            case '+':
                result = addieren(number1, number2);
                break;
            case '-':
                result = subtrahieren(number1, number2);
                break;
            case '*':
                result = multiplizieren(number1, number2);
                break;
            case '/':
                if (number2 != 0) {
                    result = dividieren(number1, number2);
                } else {
                    System.out.println("Division durch Null ist nicht erlaubt.");
                    return;
                }
                break;
        }

        System.out.printf("Das Ergebnis der Berechnung ist: %.2f\n", result);
        scanner.close();
    }

    // Methode für die Addition von zwei Zahlen (überladen für int)
    public static int addieren(int a, int b) {
        return a + b;
    }

    // Methode für die Addition von zwei Zahlen (überladen für double)
    public static double addieren(double a, double b) {
        return a + b;
    }

    // Methode für die Subtraktion von zwei Zahlen (überladen für int)
    public static int subtrahieren(int a, int b) {
        return a - b;
    }

    // Methode für die Subtraktion von zwei Zahlen (überladen für double)
    public static double subtrahieren(double a, double b) {
        return a - b;
    }

    // Methode für die Multiplikation von zwei Zahlen (überladen für int)
    public static int multiplizieren(int a, int b) {
        return a * b;
    }

    // Methode für die Multiplikation von zwei Zahlen (überladen für double)
    public static double multiplizieren(double a, double b) {
        return a * b;
    }

    // Methode für die Division von zwei Zahlen (überladen für int)
    public static int dividieren(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division durch Null ist nicht erlaubt.");
        }
        return a / b;
    }

    // Methode für die Division von zwei Zahlen (überladen für double)
    public static double dividieren(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division durch Null ist nicht erlaubt.");
        }
        return a / b;
    }
}
