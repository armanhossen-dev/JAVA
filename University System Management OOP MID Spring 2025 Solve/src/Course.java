public class Course {
    int courseid;
    double credits;
    String name;

    void addCourseid(int id){
        this.courseid = id;
    }

    void addCredits(double credits){
        this.credits = credits;
    }

    void addCourseName(String name){
        this.name = name;
    }

    void displayC(){
        System.out.println("   → " + name + " [" + courseid + "] = " + credits + " credits");
    }
}
