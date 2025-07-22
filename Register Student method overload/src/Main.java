import javax.imageio.spi.RegisterableService;

public class Main {
    public static void main(String[] args){
        /*  A university wants to implement a system where students can be registered in differnet
            ways. implement an overloaded method registereStudent.
            - registerStudent(String name, int age): register a student with name and age
            - registerStudent(String name, int age, String course): register a studnet for a specific course
            - registerStudent(String name, int age, String course, String email): register a student with email verification.
         */
        Register stu1 = new Register();
        stu1.registerStudent("Arman", 22);

        Register stu2 = new Register();
        stu2.registerStudent("Ripon", 23, "PPS");

        Register stu3 = new Register();
        stu3.registerStudent("Kan", 30, "PPS", "ahr2024@gmail.com");
    }
}
