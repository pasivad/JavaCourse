import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


class Person {
    private String name;
    public Person(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
}
class Student extends Person {
    private String studyPlace; 
    private int studyYears;
    public Student(String name, String studyPlace, int studyYears)
    {
        super(name);
        this.studyPlace = studyPlace;
        this.studyYears = studyYears;
    }
    public String getStudyPlace()
    {
        return studyPlace;
    }
    public int getStudyYears()
    {
        return studyYears;
    }
}
class Worker extends Person {
    private String workPosition; 
    private int experienceYears;
    public Worker(String name, String workPosition , int experienceYears)
    {
        super(name);
        this.workPosition = workPosition;
        this.experienceYears = experienceYears;
    }
    public String getWorkPosition()
    {
        return workPosition;
    }
    public int getExperienceYears()
    {
        return experienceYears;
    }
}

class MyUtils {
    public List<Person> maxDuration(List<Person> persons) {

    }
}

public class Task2 {
   public static void main(String[] args)
   {
       List<Person> list = new ArrayList<>();
       list.add(new Person("Ivan"));
       list.add(new Student("Petro", "University", 3));
       list.add(new Worker("Andriy", "Developer", 12));
       list.add(new Student("Stepan", "College", 4));
       list.add(new Worker("Ira", "Manager", 8));
       list.add(new Student("Ihor", "University", 4));

       MyUtils obj = new MyUtils();
       System.out.println(obj.maxDuration(list));
   }
}
