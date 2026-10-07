public class Registration {

    private Student student;
    private Course course;

    public Registration(Student student, Course course) {
        this.student = student;
        this.course = course;
    }

    public void displayRegistration() {
        System.out.println("===== Registration Details =====");

        Student.displayStudentInfo(student);
        Course.displayCourseInfo(course);

        System.out.println("================================");
    }
}