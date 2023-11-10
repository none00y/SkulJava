public class Student {
    String firstName;
    String familyName;
    int age;

    public void displayStudent() {
        System.out.println("First Name: "+ this.firstName);
        System.out.println("Family Name: "+ this.familyName);
        System.out.println("Age: "+ this.age);
    }
    public Student(String firstName, String familyName, int age) {
        this.firstName = firstName;
        this.familyName = familyName;
        this.age = age;
    }
}
