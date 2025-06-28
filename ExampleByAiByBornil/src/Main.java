
import java.util.ArrayList;

// Department class: Represents a university department
class Department {
    private int deptid;  // Unique department ID
    private ArrayList<Professor> professors = new ArrayList<>();  // List of professors in this department

    public Department(int deptid) {
        this.deptid = deptid;
    }

    // Adds a professor to this department (if not already added)
    void addProfessor(Professor p) {
        if (!professors.contains(p)) {
            professors.add(p);          // Add professor to department
            p.addDepartment(this);      // Also add this department to professor (one-way link to prevent recursion)
        }
    }

    // Display all professors in this department
    public void display() {
        System.out.println("Department ID: " + deptid);
        for (Professor p : professors) {
            System.out.println("  - " + p); // Uses toString() from Professor
        }
    }

    @Override
    public String toString() {
        return "Department ID: " + deptid;
    }
}

// Professor class: Represents a university professor
class Professor {
    private int id;  // Unique professor ID
    private ArrayList<Course> courses = new ArrayList<>();      // Courses taught by this professor
    private ArrayList<Department> departments = new ArrayList<>(); // Departments this professor belongs to

    public Professor(int id) {
        this.id = id;
    }

    // Adds a course to this professor (if not already added)
    void addCourse(Course c) {
        if (!courses.contains(c)) {
            courses.add(c);         // Add course to professor
            c.addProfessor(this);   // Add professor to course (one-way link)
        }
    }

    // Adds a department to this professor (if not already added)
    void addDepartment(Department d) {
        if (!departments.contains(d)) {
            departments.add(d);     // Add department to professor
            // DO NOT call d.addProfessor(this); to prevent infinite recursion
        }
    }

    // Display professor’s info: courses and departments
    public void display() {
        System.out.println("Professor ID: " + id);
        System.out.println("  Courses:");
        for (Course c : courses) {
            System.out.println("    - " + c); // Uses Course.toString()
        }
        System.out.println("  Departments:");
        for (Department d : departments) {
            System.out.println("    - " + d); // Uses Department.toString()
        }
    }

    @Override
    public String toString() {
        return "Professor ID: " + id;
    }
}

// Course class: Represents a university course
class Course {
    private int code;         // Unique course code
    private double credit;    // Course credit
    private ArrayList<Professor> professors = new ArrayList<>(); // Professors who teach this course

    public Course(int code, double credit) {
        this.code = code;
        this.credit = credit;
    }

    // Adds a professor to this course (if not already added)
    void addProfessor(Professor p) {
        if (!professors.contains(p)) {
            professors.add(p); // Add professor to course
            // DO NOT call p.addCourse(this); to prevent infinite recursion
        }
    }

    // Display course information and list of professors
    public void display() {
        System.out.println("Course Code: " + code + ", Credit: " + credit);
        System.out.println("  Professors:");
        for (Professor p : professors) {
            System.out.println("    - " + p); // Uses Professor.toString()
        }
    }

    @Override
    public String toString() {
        return "Course Code: " + code + ", Credit: " + credit;
    }
}

// Main class to test the system
public class Main {
    public static void main(String[] args) {
        // Create departments
        Department CSE = new Department(101);
        Department EEE = new Department(103);
        Department SWE = new Department(221);

        // Create professors
        Professor SNK = new Professor(1001);
        Professor luffy = new Professor(1003);
        Professor Zoro = new Professor(1005);

        // Create courses
        Course onepiece = new Course(221, 3);  // 3 credit course
        Course naruto = new Course(441, 3);    // 3 credit course
        Course bleach = new Course(2, 6);      // 6 credit course

        // Assign professors to departments and courses
        CSE.addProfessor(SNK);                // SNK is in CSE
        SNK.addCourse(onepiece);              // SNK teaches onepiece
        SNK.addCourse(bleach);                // SNK teaches bleach

        SWE.addProfessor(luffy);              // luffy is in SWE
        luffy.addCourse(naruto);              // luffy teaches naruto
        luffy.addCourse(bleach);              // luffy teaches bleach

        onepiece.addProfessor(Zoro);          // Zoro teaches onepiece
        Zoro.addDepartment(SWE);              // Zoro belongs to SWE

        // Display departments with their professors
        System.out.println("=== Departments ===");
        CSE.display();
        EEE.display();
        SWE.display();

        // Display professors with their courses and departments
        System.out.println("\n=== Professors ===");
        SNK.display();
        luffy.display();
        Zoro.display();

        // Display courses with their professors
        System.out.println("\n=== Courses ===");
        onepiece.display();
        naruto.display();
        bleach.display();
    }
}