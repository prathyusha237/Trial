package BasicJava;

public class Student
{
    int Id = 101;
    String name = "Arjun";
    static String SchoolName = "DPS";

    public static void main(String[] args)
    {
        Student s1 = new Student();
        System.out.println(s1.Id);
        System.out.println(s1.name);
        System.out.println(Student.SchoolName);
    }

}
