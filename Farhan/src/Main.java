public class Main {
    public static void main(String[] args){

//      Student(String studentID,String courseEnrolled, double grade, int age, String name, int id){
        Student Arman = new Student("241", "CSE212", 3.75, 50, "Arman Sadik", "241-15-292" );
        Student Farhan = new Student("241", "CSE212", 3.75, 50, "Farhan Sadik", "241-15-292" );
        Student Kobir = new Student("241", "CSE212", 3.75, 50, "Farhan Sadik", "241-15-292" );

        Arman.displayInfo();
        Farhan.displayInfo();
        Kobir.displayInfo();
        System.out.println();

        Faculty RaselSir = new Faculty();
        RaselSir.name = "Rahmatul Kabir Rasel";
        RaselSir.hi();
        System.out.println(RaselSir.varsityName);

        System.out.println();

        Faculty AshrafUllah = new Faculty("Ashraf Ullah Rahat");
        AshrafUllah.hi();
        System.out.println(AshrafUllah.varsityName);
    }
}
