public class ParametryProgramu {
    public static void main(String[] args) {
    // args to parametry programu przekazane z wiersza poleceń
    // args.length to liczba przekazanych parametrów
        System.out.println("Liczba parametrów: " + args.length);
        // Wyświetlenie wszystkich przekazanych parametrów
        for (int i = 0; i < args.length; i++) {
            System.out.println("Parametr " + i + ": " + args[i]);
        }
    }
}