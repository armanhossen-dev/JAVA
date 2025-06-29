public class Main {
    public static void main(String[] args){
        UniversitySystem u1 = new UniversitySystem("ABC University", "Bogura, Tinmatha", 2028);
        u1.addDepartment_USM(101, "CSE");

        Course c1 = new Course();
        c1.addCourseName("OOP");
        c1.addCredits(3.0);
        c1.addCourseid(221);

        Professor p1 = new Professor();
        p1.addName("Arman Hossen Ripon");
        p1.addId(883);
        p1.addCourse(c1);
        u1.addProfessor_USM(p1);

        Course c2 = new Course();
        c2.addCourseName("OOP Lab");
        c2.addCredits(1.5);
        c2.addCourseid(222);

        Professor p2 = new Professor();
        p2.addName("Ripon Ali Khan");
        p2.addId(241);
        p2.addCourse(c2);
        u1.addProfessor_USM(p2);

        u1.displayUS(); // Only call once
    }
}




//        +---------------------+
//        |   UniversitySystem  |
//        +---------------------+
//        | - name: String      |
//        | - address: String   |
//        | - year: int         |
//        | - d_array: ArrayList<Department> |
//        | - p_array: ArrayList<Professor>  |
//        +---------------------+
//        | + addDepartment_USM(id: int, name: String): void |
//        | + addProfessor_USM(p: Professor): void           |
//        | + displayUS(): void                              |
//        +---------------------+
//
//        1
//UniversitySystem ----------------- Department
//               *   d_array
//
//            1
//UniversitySystem ----------------- Professor
//               *   p_array
//
//        +---------------------+
//        |     Department      |
//        +---------------------+
//        | - id: int           |
//        | - name: String      |
//        +---------------------+
//        | + addDepartmentId(id: int): void     |
//        | + addDepartmentName(name: String): void |
//        | + displayD(): void                   |
//        +---------------------+
//
//        +---------------------+
//        |      Professor      |
//        +---------------------+
//        | - id: int           |
//        | - name: String      |
//        | - c_array: ArrayList<Course> |
//        | - d: Department     |
//        +---------------------+
//        | + addId(id: int): void          |
//        | + addName(name: String): void   |
//        | + addCourse(c: Course): void    |
//        | + addDept(d: Department): void  |
//        | + displayP(): void              |
//        +---------------------+
//
//        1
//Professor -------------------- Course
//            *   c_array
//
//        +---------------------+
//        |       Course        |
//        +---------------------+
//        | - courseid: int     |
//        | - credits: double   |
//        | - name: String      |
//        +---------------------+
//        | + addCourseid(id: int): void       |
//        | + addCredits(credits: double): void|
//        | + addCourseName(name: String): void|
//        | + displayC(): void                 |
//        +---------------------+
