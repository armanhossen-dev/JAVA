public class Person {
    // this will be the parent, so it's a super class
    String fname;
    String lname;

    Person(String first, String last){
        fname = first;
        lname = last;
    }

    void showfullname(){
        System.out.println(fname + " " + lname);
    }
}