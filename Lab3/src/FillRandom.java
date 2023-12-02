import java.util.Random;
public class FillRandom {
    //generator losowyp
    static Random rand = new Random();
    public static void main(String [] args) {
        // stworzenie tablic
        int [][] arr2D = new int[5][20];
        int [] arr1D = new int[20];
        // wypełnienie tablic
        fillRandom1D(arr1D);
        fillRandom2D(arr2D);
        // wypisanie tablic
        System.out.println(java.util.Arrays.toString(arr1D));
        System.out.println(java.util.Arrays.deepToString(arr2D));
    }
    static void fillRandom1D(int [] arr) {
        // sprawdzenie czy długość tablicy jest wystarczająca
        assert(arr.length>= 20);

        for(int i = 0; i < 20; i++) {
            // losowanie kolejnych wartości
            arr[i] = rand.nextInt(20);
        }
    }

    static void fillRandom2D(int [][] arr) {
        for(int i = 0; i < arr.length; i++) {
            // wywołanie funkcji losującej dla tablic zawartych w tablicy dwuwymiarowej
            fillRandom1D(arr[i]);
        }
    }
}
