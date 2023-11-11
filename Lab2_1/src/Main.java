import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // pobieramy stringa i parsujemy integera
        System.out.println("Provide an int:");
        int integer =  Integer.parseInt(scanner.nextLine());
        // pobieramy stringa i parsujemy double'a
        System.out.println("Provide a double:");
        double dbl =  Double.parseDouble(scanner.nextLine());
        // pobieramy stringa i wybieramy pierwszy
        System.out.println("Provide a character:");
        char character = scanner.nextLine().charAt(0);
        // pobieramy stringa i parsujemy boola
        System.out.println("Provide a boolean:");
        boolean bool = Boolean.parseBoolean(scanner.nextLine());

        // castujemy double'a do inta i wypisujemy, konwersja jest stratna
        System.out.println("double to int:" + (int)dbl);

        // castujemy int'a do double'a i wypisujemy
        System.out.println("int to double:" + (double)integer);

        // castujemy char'a do int'a i wypisujemy
        System.out.println("char to int:" + (int)character);

        // castujemy char'a do string'a i wypisujemy
        String boolString = String.valueOf(bool);
        System.out.println("boolean to string:" + boolString);

    }
}