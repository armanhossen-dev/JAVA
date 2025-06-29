public class Department {
    private int id;
    public String name;

    void addDepartmentId(int id){
        this.id = id;
    }

    void addDepartmentName(String name){
        this.name = name;
    }

    void displayD(){
        System.out.println("Department: " + name + " (" + id + ")");
    }
}
