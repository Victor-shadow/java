package Collections;
import java.util.*;
public class CollectionsForCustomDefinedObjectsFrequency {
    public static void main(String[]args){
        // Let us create a list of Student type
        ArrayList<Student> list =
                new ArrayList<Student>();
        list.add(new Student("James", 19));
        list.add(new Student("Bjarne", 20));
        list.add(new Student("Andy", 19));
        list.add(new Student("Gaussian", 19));

        // count the frequency of the word "code"
        System.out.println("The frequency of the Developer James, 19 is: "+
                Collections.frequency(list, new Student("James", 19)));
    }
}
class Student
{
    private String name;
    private int age;

    Student(String name, int age)
    {
        this.name=name;
        this.age=age;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    @Override
    public boolean equals(Object o)
    {
        Student s;
        if(!(o instanceof Student))
        {
            return false;
        }

        else
        {
            s=(Student)o;
            if(this.name.equals(s.getName()) && this.age== s.getAge())
            {
                return true;
            }
        }
        return false;
    }
}
