public class Enrollment {
    private Student student;
    private Course course;
    private double grade;
    private boolean hasGrade; // Флаг, есть ли оценка (простой способ для новичков)

    public Enrollment(Student student, Course course) {
        this.student = student;
        this.course = course;
        this.hasGrade = false; // Изначально оценки нет
    }

    public void assignGrade(double grade) {
        if (grade >= 0 && grade <= 100) {
            this.grade = grade;
            this.hasGrade = true;
        } else {
            System.out.println("Ошибка! Оценка должна быть от 0 до 100.");
        }
    }

    public void printSummary() {
        System.out.print(student.getName() + " | Курс: " + course.getTitle() + " | Оценка: ");
        if (hasGrade == true) {
            System.out.println(grade);
        } else {
            System.out.println("Оценки пока нет");
        }
    }
}
