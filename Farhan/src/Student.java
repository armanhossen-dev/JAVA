public class Student extends Person{
//    studentID (String)
//    o	courseEnrolled (String)
//    o	grade (double)
     String studentID;
     String courseEnrolled;
     double grade;
     Student(String studentID,String courseEnrolled, double grade, int age, String name, String id){
         super(age,  name,  id);
         this.studentID = studentID;
         this.courseEnrolled = courseEnrolled;
         this.grade = grade;
     }

     @Override
     public void displayInfo(){
         System.out.println("----- Student Details -----");
         System.out.println(
         "Name: " + name + '\n' +
         "Age: "  + age + '\n' +
         "ID: " + id + '\n' +
         "Student ID: " + studentID+ '\n' +
         "Course Enrolled: " + courseEnrolled + '\n' +
         "Grade: " + grade );
     }


}
