/**
 * Created by Mukesh on 19-07-2017.
 */
public class Student {

    private String name="";
    private Student()
    {
        System.out.println("Default constructor.....");

    }
private Student(String name)

{

    this.name=name;
    System.out.println(name);
}
    public static void getObject(String name)
    {
        Student s1=new Student();
        Student s=new Student(name);
    }
}
