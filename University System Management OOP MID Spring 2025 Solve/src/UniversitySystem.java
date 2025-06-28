public class UniversitySystem {
    String name;
    String address;
    int year;
//    static int countDepartment = 0;
    UniversitySystem(String name, String address, int year){
        this.name = name;
        this.address = address;
        this.year = year;
//        countDepartment++;
    }
    void displayinfo(){
        System.out.println("University Info:\n" +
                           "Name: " + name + "\n"
                          +"Address: " + address + "\n"
                          + "Year: " + year);
    }
}
