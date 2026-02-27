class Person 
{
    public Person() 
    {
        System.out.println("Person class");
    }
}

class Student extends Person 
{   
    public Student() 
    {
        super();
        System.out.println("Student class");
    }
}

public class SuperConstructorDemo 
{
    public static void main(String[] args) 
    {
        Student obj = new Student();
    }
}