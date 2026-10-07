public class main
{
    public static void main(String[] args)
    {
         Student student1 = new Student(135,"Abdul Samad",
                 "Software Engineering");

         Course course1 = new Course("ENG101","Fundamentals of English",3);


       Student.displayStudentInfo(student1);

        Course.displayCourseInfo(course1);
    }
}