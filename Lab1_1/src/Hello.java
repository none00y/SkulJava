import java.util.Scanner;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Hello {
    // punkt wejściowy dla programu
    public static void main(String[] args) {
        // tworzymy skanner używający wejścia systemowgo jako inputu
        Scanner scanner = new Scanner(System.in);

        // zbieramy dane od użytkownika
        System.out.print("Wprowadż dane studenta\n");

        System.out.print("Podaj Imie:");

        String imie = scanner.nextLine();

        System.out.print("Podaj Nazwisko:");

        String nazwisko = scanner.nextLine();

        System.out.print("Podaj Wiek:");

        int wiek = Integer.parseInt(scanner.nextLine());;

        // tworzymy studenta
        Student student = new Student(imie, nazwisko, wiek);
        // wypisujemy do konsoli
        student.displayStudent();
    }
}