public class ReverseTable {
    public static void main(String[] args) {
        // stworzenie tablicy
        int[] table = {1,2,3,4,5,6,7,8,9,10};
        // wypisanie zmienionych tablic
        System.out.println("Array: " + java.util.Arrays.toString(table));
        System.out.println("Reversed array: " + java.util.Arrays.toString(reverseTable(table)));
    }
    static int [] reverseTable(int [] table) {
        for(int i=0; i < table.length/2; i++) {
            // podmienienie elementów tablicy
            int tmp = table[i];
            table[i] = table[table.length - 1 - i];
            table[table.length - 1 - i] = tmp;
        }
        return table;
    }
}
