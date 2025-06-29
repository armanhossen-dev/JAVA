import java.util.ArrayList;

public class UniversitySystem {
    String name;
    String address;
    int year;
    ArrayList<Department> d_array;
    ArrayList<Professor> p_array;

    UniversitySystem(String name, String address, int year){
        this.name = name;
        this.address = address;
        this.year = year;
        d_array = new ArrayList<>();
        p_array = new ArrayList<>();
    }

    void addDepartment_USM(int id, String name){
        Department a = new Department();
        a.addDepartmentId(id);
        a.addDepartmentName(name);
        d_array.add(a);
    }

    void addProfessor_USM(Professor newP){
        p_array.add(newP);
    }

    void displayUS(){
        System.out.println("\n========= University Info =========");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Established Year: " + year);
        System.out.println("Departments Count: " + d_array.size());
        System.out.println("Professors Count: " + p_array.size());

        System.out.println("\n----- Departments -----");
        int i = 1;
        for(Department d1 : d_array){
            System.out.print(i++ + ". ");
            d1.displayD();
        }

        System.out.println("\n--- Professors and Their Courses ---");
        for(Professor p : p_array){
            p.displayP();
            System.out.println();
        }
    }
}
