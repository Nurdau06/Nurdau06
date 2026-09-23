public class Course {
    private String title;
    private String code;
    private int credits;

    private static int courseCount = 0;

    public Course(String title, String code, int credits) {
        this.title = title;
        this.code = code;
        this.credits = credits;
        courseCount = courseCount + 1;
    }

    public String getTitle() {
        return title;
    }

    public String getCode() {
        return code;
    }

    public int getCredits() {
        return credits;
    }

    public void printInfo() {
        System.out.println("Курс: " + title + " (" + code + "), кредиты: " + credits);
    }

    public static int getCourseCount() {
        return courseCount;
    }
}