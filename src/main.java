public class main {

    public static void main(String[] args) {

        Student student = new Student(
                135,
                "Abdul Samad",
                "Software Engineering"
        );

        Course course = new Course(
                "SE-305",
                "Software Engineering",
                3
        );

        Registration registration =
                new Registration(student, course);

        registration.displayRegistration();

        registration.displayConfirmation();
    }
}