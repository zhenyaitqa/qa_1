public class Student {
    int ticketNumber;
    String firstName;
    String lastName;
    int course;
    int mathScore;
    int economicScore;
    int foreignLanguageScore;

    public Student(String firstName, String lastName, int course, int ticketNumber, int mathScore,int economicScore,int foreignLanguageScore) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.course =  course;
        this.ticketNumber = ticketNumber;
        this.mathScore = mathScore;
        this.economicScore = economicScore;
        this.foreignLanguageScore = foreignLanguageScore;
    }
}
