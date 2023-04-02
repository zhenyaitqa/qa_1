public class StudentTest {
    public static void main(String[] arg) {
        Student student1 = new Student("Julia", "Leng", 5,55,100,90,90);
        Student student2 = new Student("Max", "Doling", 4,56,80,100,95);
        Student student3 = new Student("Helen", "Kittr", 2,57,90,79,88);
        System.out.println(student1.firstName + " average Score = " + (student1.mathScore+ student1.economicScore+ student1.foreignLanguageScore)/3);
        System.out.println(student2.firstName + " average Score = " + (student2.mathScore+ student2.economicScore+ student2.foreignLanguageScore)/3);
        System.out.println(student3.firstName + " average Score = " + (student3.mathScore+ student3.economicScore+ student3.foreignLanguageScore)/3);

    }
}
