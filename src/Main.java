public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        int[] scores = {78, 91, 65, 88, 73, 95, 54, 82, 69, 91};

        int min = scores[0];
        int max = scores[0];
        int sum = 0;
        int count80 = 0;
        int countEven = 0;

        for (int i = 0; i < scores.length; i++) {
            System.out.println("Индекс " + i + ": " + scores[i]);

            if (scores[i] < min) {
                min = scores[i];
            }
            if (scores[i] > max) {
                max = scores[i];
            }

            sum = sum + scores[i];

            if (scores[i] >= 80) {
                count80 = count80 + 1;
            }
            if (scores[i] % 2 == 0) {
                countEven = countEven + 1;
            }
        }

        double average = (double) sum / scores.length;
        System.out.println("Мин: " + min + ", Макс: " + max);
        System.out.println("Сумма: " + sum + ", Среднее: " + average);
        System.out.println("Студентов с 80+ баллами: " + count80);
        System.out.println("Четных оценок: " + countEven);
        System.out.println();


        System.out.println("Задание 2");
        int[][] grades = {
                {78, 91, 88},
                {65, 72, 70},
                {90, 94, 89},
                {81, 76, 85}
        };

        int globalMax = grades[0][0];
        int maxRow = 0;
        int maxCol = 0;

        double bestAvg = 0;
        int bestStudent = 0;

        for (int i = 0; i < grades.length; i++) {
            int studentSum = 0;
            System.out.print("Студент " + i + ": ");

            for (int j = 0; j < grades[i].length; j++) {
                System.out.print(grades[i][j] + " ");
                studentSum = studentSum + grades[i][j];

                if (grades[i][j] > globalMax) {
                    globalMax = grades[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }

            double stAvg = (double) studentSum / grades[i].length;
            System.out.println("| Средний балл: " + stAvg);

            if (stAvg > bestAvg) {
                bestAvg = stAvg;
                bestStudent = i;
            }
        }


        for (int j = 0; j < 3; j++) {
            int subjectSum = 0;
            for (int i = 0; i < grades.length; i++) {
                subjectSum = subjectSum + grades[i][j];
            }
            double subjAvg = (double) subjectSum / grades.length;
            System.out.println("Среднее по предмету " + j + ": " + subjAvg);
        }

        System.out.println("Максимум в таблице: " + globalMax + " на позиции [" + maxRow + "][" + maxCol + "]");
        System.out.println("Лучший средний балл у студента " + bestStudent);
        System.out.println();


        System.out.println("Задание 3");
        String text = " Java, Python, java, C++, Kotlin, JAVA, Python ";
        String textTrim = text.trim();
        String[] words = textTrim.split(",");

        int countJava = 0;
        int countLongWords = 0;
        StringBuilder longString = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String w = words[i].trim();
            System.out.println("Слово: " + w + " (длина " + w.length() + ")");

            if (w.equalsIgnoreCase("Java")) {
                countJava = countJava + 1;
            }
            if (w.length() > 4) {
                countLongWords = countLongWords + 1;
            }
            if (w.length() >= 5) {
                longString.append(w);
                longString.append(" ");
            }
        }
        System.out.println("Слово Java встречается: " + countJava);
        System.out.println("Слов длиннее 4 символов: " + countLongWords);
        System.out.println("Новая строка: " + longString.toString());
        System.out.println();

        // --- Часть А. Задание 4 ---
        System.out.println("Задание 4");
        StringBuilder sb = new StringBuilder();
        sb.append("ОТЧЁТ ПО ГРУППЕ\n");
        sb.append("Количество: ");
        sb.append(scores.length);
        sb.append("\nСредний балл: ");
        sb.append(average);
        sb.append("\nМаксимум: ");
        sb.append(max);
        sb.append("\nМинимум: ");
        sb.append(min);
        sb.append("\nСтуденты 80+: ");
        sb.append(count80);

        System.out.println(sb.toString());
        System.out.println();


        System.out.println("Часть B");

        Student s1 = new Student("Султан", "123", 3.0);
        Student s2 = new Student("Нурдаулет ", "456", 3.5);

        Course c1 = new Course("Математика", "MATH1", 3);
        Course c2 = new Course("Физика", "PHYS1", 4);

        Enrollment e1 = new Enrollment(s1, c1);
        Enrollment e2 = new Enrollment(s2, c1);
        Enrollment e3 = new Enrollment(s1, c2);

        e1.assignGrade(85);
        e2.assignGrade(90);
        e3.assignGrade(150); // Проверка ошибки

        s1.printInfo();
        c1.printInfo();

        e1.printSummary();
        e2.printSummary();
        e3.printSummary();

        System.out.println("Количество курсов: " + Course.getCourseCount());
        System.out.println("Количество студентов: " + Student.studentCount);
    }
}