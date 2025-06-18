public class Hospital {
        String name;
        String address;
        String Owner;
        int PatientNumber;
        int DoctorNumber;
        int year;

    Hospital(String name, int year, String address, String Owner, int PatientNumber, int DoctorNumber){
            this.name = name;
            this.year = year;
            this.address = address;
            this.Owner = Owner;
            this.PatientNumber = PatientNumber;
            this.DoctorNumber = DoctorNumber;
        }
        void displayHospitalInfo(){
            System.out.println("name = " +  name);
            System.out.println("year = " +  year);
            System.out.println("address = " +  address);
            System.out.println("Owner = " +  Owner);
            System.out.println("PatientNumber = " +  PatientNumber);
            System.out.println("DoctorNumber = " +  DoctorNumber);
        }

}
