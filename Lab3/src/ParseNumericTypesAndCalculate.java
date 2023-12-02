// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ParseNumericTypesAndCalculate {
    public static void main(String[] args) {
        // sprawdzenie liczby argumentów
        if (args.length < 2) {
            System.out.println("Too few arguments got " + args.length + " Expected " + 2);
        }
        // zczytanie wartości
        int first = Integer.parseInt(args[0]);
        int second = Integer.parseInt(args[1]);

        // wypisanie wartości
        System.out.println("Parsed values: " + first + " " + second);

        // wypisanie wyników
        System.out.println("Addition: " + (first + second));
        System.out.println("Multiplication: " + first*second);
        System.out.println("Division: " + first/second);
        System.out.println("Substraction: " + (first - second));
    }
}