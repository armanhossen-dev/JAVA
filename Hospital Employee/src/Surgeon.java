public class Surgeon extends Doctor{
    int YOE; //yearOfExperience
    int NOSP; // numberOfSurgeriesPerformed
    Surgeon(String name, String employeeID, double salary, String specialization, String department,int y, int sp) {
        super(name, employeeID, salary, specialization, department);
        this.YOE = y;
        this.NOSP = sp;
    }
    @Override
    void work(){
        System.out.println("Surgeon performs operations.");
    }
}
