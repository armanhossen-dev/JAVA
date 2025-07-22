public class Doctor extends Employee{
    String specialization;
    String department;
    Doctor(String name, String employeeID, double salary, String specialization, String department){
        super(name, employeeID, salary);
        this.specialization = specialization;
        this.department = department;
    }

    void work(){
        System.out.println("Doctor diagnoses patients.");
    }
}
