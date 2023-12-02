public class Range {
    public static void main(String [] args) {
        System.out.println("4 in (2,5): " + Range.between(4, 2, 5));
        System.out.println("4 not in (2,5): " + Range.outside(4, 2, 5));

        System.out.println("4 in (5,10): " + Range.between(4, 5, 10));
        System.out.println("4 not in (5,10): " + Range.outside(4, 5, 10));
    }
    static boolean outside(int val, int min, int max) {
        // sprawdzenie czy przedział jest poprawny
        if(max < min) {
            System.out.println("Range invalid");
            return false;
        }
        // sprawdzenie czy wartość jest w przedziale
        if (val >= max || val <= min) {
            System.out.println("Number not within range");
            return true;
        } else {
            // jeśli tak jest zwracamy false
            System.out.println("Number within range");
            return false;
        }
    }

    static boolean between(int val, int min, int max) {
        // sprawdzenie czy przedział jest poprawny
        if(max < min) {
            System.out.println("Range invalid");
            return false;
        }
        // sprawdzenie czy wartość jest w przedziale
        if (val > min && val < max) {
            System.out.println("Number within range");
            return true;
        } else {
            // jeśli nie jest zwracamy false
            System.out.println("Number not within range");
            return false;
        }
    }
}
