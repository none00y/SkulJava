// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ParseNumericTypes {
    public static void main(String[] args) {
        // sprawdzenie liczby argumentów
        if (args.length < 4) {
            System.out.println("Too few arguments got " + args.length + " Expected " + 4);
        }
        // wypisanie rezultatów konwersji
        System.out.println(Double.parseDouble(args[0]));
        System.out.println(Integer.parseInt(args[1]));
        System.out.println(Long.parseLong((args[2])));
        System.out.println(Float.parseFloat(args[3]));
    }
}