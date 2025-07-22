import java.time.temporal.TemporalAmount;

public class Register {
    String name, course, email;
    int age;

    void registerStudent(String name,int age){
        this.name = name;
        this.age = age;
        System.out.println(name + ", " + age);
    }

    void registerStudent(String name, int age, String course){
        this.name = name;
        this.age = age;
        this.course = course;
        System.out.println(name + ", " + age + ", " + course);
    }

    void registerStudent(String name, int age, String course, String email){
        this.name = name;
        this.age = age;
        this.course = course;
        this.email = email;
        System.out.println(name + ", " + age + ", " + course + ", " + email);
    }


}
