public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student(1, "John", "Doe", 2, 8, 9, 7);
        Student student2 = new Student(2, "Jane", "Smith", 3, 7, 8, 9);
        Student student3 = new Student(3, "Bob", "Johnson", 1, 9, 9, 8);

        System.out.println("Average grade for " + student1.toString() + " is " + student1.calculateAverageGrade());
        System.out.println("Average grade for " + student2.toString() + " is " + student2.calculateAverageGrade());
        System.out.println("Average grade for " + student3.toString() + " is " + student3.calculateAverageGrade());
    }
}


