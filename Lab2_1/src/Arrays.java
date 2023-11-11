public class Arrays {
    public static void main(String[] args) {
        int [] array = {2, 4,5,6,7};
        int [] array2 = {4,7,4,5,5,22};

        System.out.println("Lengths\n first:" + array.length + ", second:" + array2.length);
        System.out.println("Min\n first:" + java.util.Arrays.stream(array).min().getAsInt() + ", second:" + java.util.Arrays.stream(array2).min().getAsInt());
        System.out.println("Max\n first:" + java.util.Arrays.stream(array).max().getAsInt() + ", second:" + java.util.Arrays.stream(array2).max().getAsInt());
        System.out.println("Average\n first:" + java.util.Arrays.stream(array).average().getAsDouble() + ", second:" + java.util.Arrays.stream(array2).average().getAsDouble());
        int [] arrayClone   = array.clone();
        int [] array2Clone  = array2.clone();
        System.out.println("Copy\n first:" + java.util.Arrays.toString(arrayClone) + ", second:" + java.util.Arrays.toString(array2Clone));
        // tworzymy warunek dla filtra
        java.util.function.IntPredicate greaterThan3 = el -> el > 3;
        //filtrujemy tablice i tworzymy nowe
        int [] filteredArray = java.util.Arrays.stream(array).filter(greaterThan3).toArray();
        int [] filteredArray2 = java.util.Arrays.stream(array2).filter(greaterThan3).toArray();
        System.out.println("All numbers which meet the condition " + "i > 3" + " \nfirst:" + java.util.Arrays.toString(filteredArray)  + ", second:" + java.util.Arrays.toString(filteredArray2));

        //tworzymy nowe tablice
        int [] removedArray = new int[array.length -1];
        int [] removedArray2 = new int[array2.length -1];
        // filtrujemy i kopiujemy wszystkie poza pierwszym elementem
        for(int i = 1, j = 0; i < array.length; i++) { removedArray[j++] = array[i]; }
        for(int i = 1, j = 0; i < array2.length; i++) { removedArray2[j++] = array2[i]; }

        System.out.println("All numbers except the first one \n first:" + java.util.Arrays.toString(removedArray)  + ", second:" + java.util.Arrays.toString(removedArray2));
        // tworzymy nową tablicę
        int [] sumArray = java.util.Arrays.copyOf(array, array.length + array2.length);
        // kopiujemy obie tablice do nowej
        System.arraycopy(array2, 0, sumArray, array.length, array2.length);
        System.out.println("MergedArray\n" + java.util.Arrays.toString(sumArray));

        //tworzymy warunek dla filtra
        java.util.function.IntPredicate equalTo4 = el -> el == 4;
        System.out.println("Count of 4's\n" + java.util.Arrays.stream(array2).filter(equalTo4).count());
    }
}
