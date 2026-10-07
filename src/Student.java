public class Student
{
int studentID;
String studentName;
String Department;

 Student(int studentID, String studentName, String Department)
 {
     this.studentID = studentID;
     this.studentName = studentName;
     this.Department = Department;
 }
    public static void displayStudentInfo(Student student)
    {
        System.out.println("Student Name = " + student.studentName);
        System.out.println("Student ID = " + student.studentID);
        System.out.println("Department = " + student.Department);
    }
}