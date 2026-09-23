public class Student {
    private String name;
    private String studentId;
    private double gpa;


    public static int studentCount = 0;

    public Student(String name, String studentId, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.gpa = gpa;
        studentCount = studentCount + 1; // Простое увеличение счетчика
    }

    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }

    public double getGpa() {
        return gpa;
    }

    public void improveGpa(double delta) {
        if (delta > 0) {
            gpa = gpa + delta;
        }
    }

    public void printInfo() {
        System.out.println("Студент: " + name + ", ID: " + studentId + ", GPA: " + gpa);
    }
}
