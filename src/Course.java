public class Course
{
    String courseCode;
    String courseTitle;
    int creditHours;

    Course(String courseCode, String courseTitle, int creditHours)
    {
        this.courseCode = courseCode;
        this.courseTitle = courseTitle;
        this.creditHours = creditHours;
    }

    public static void displayCourseInfo(Course course)
    {
        System.out.println("Course Title = " + course.courseTitle);
        System.out.println("Course Code = " + course.courseCode);
        System.out.println("Credit Hours = " + course.creditHours);
    }
}