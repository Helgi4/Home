public class Student {


    public static void main(String[] args) {
    }

    private int studentId;
    private String firstName;
    private String lastName;
    private int course;
    private double mathGrade;
    private double economicsGrade;
    private double foreignLanguageGrade;

    public Student(int studentId, String firstName, String lastName, int course, double mathGrade, double economicsGrade, double foreignLanguageGrade) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.course = course;
        this.mathGrade = mathGrade;
        this.economicsGrade = economicsGrade;
        this.foreignLanguageGrade = foreignLanguageGrade;
    }

    public double calculateAverageGrade() {
        return (mathGrade + economicsGrade + foreignLanguageGrade) / 3;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", course=" + course +
                ", mathGrade=" + mathGrade +
                ", economicsGrade=" + economicsGrade +
                ", foreignLanguageGrade=" + foreignLanguageGrade +
                '}';
    }
}


