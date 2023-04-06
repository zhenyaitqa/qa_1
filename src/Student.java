public class Student {
    private String name;
    private int course;
    private int grade;


    public String getName() {
        return name;
    }

    public void setName(String s) {
        if (s.length() >= 3)
            name = s;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int i) {
        if (1 >= i && i <= 4)
            course = i;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int j) {
        if (1 >= j && j <= 10)
            grade = j;
    }

    public static void main(String[] args) {
        showInfo();


    }

    public static void showInfo() {
        Student s1 = new Student();
        s1.setName("Mark");
        s1.getName();
        System.out.println(s1.getName());
        s1.setCourse(3);
        s1.getCourse();
        System.out.println(s1.getCourse());
        s1.setGrade(8);
        s1.getGrade();
        System.out.println(s1.getGrade());


    }


}

class TestStudent {
    String name;
    int course;
    int grade;


}
