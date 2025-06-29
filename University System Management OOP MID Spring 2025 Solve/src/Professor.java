import java.util.ArrayList;

public class Professor {
    int id;
    String name;
    ArrayList<Course> c_array;
    Department d;

    Professor(){
        c_array = new ArrayList<>();
    }

    void addId(int id){
        this.id = id;
    }

    void addName(String name){
        this.name = name;
    }

    void addCourse(Course c1){
        c_array.add(c1);
    }

    void addDept(Department dep){
        d = dep;
    }

    void displayP(){
        System.out.println("Professor: " + name + " (ID: " + id + ")");
        System.out.println("Teaches:");
        for(Course c : c_array){
            c.displayC();
        }
    }
}
