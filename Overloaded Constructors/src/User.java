public class User {

    //if i don't gave value or to this attributes then this attributes are optional
    //inside the constructor i can assign default values to them
    String username;
    String email;
    int age;

    //"overloaded constructors"
    User(){ //Anonymous profile
        this.username = "Guest";
        this.email = "Not Provided";
        this.age = 0;
    }

    //creating constructor if somebody wants to create object by only username
    User(String ip_username){
        this.username = ip_username;
        //setting default values for others attribute
        this.email = "Not Provided";
        this.age = 0;
    }

    //creating constructor if somebody wants to create object by only username, and email
    User(String ip_username, String ip_email){
        this.username = ip_username;
        this.email = ip_email;
        //setting default values for others attribute
        this.age = 0;
    }

    //creating constructor if somebody wants to create object by all attributes username, email, age
    User(String ip_username, String ip_email, int ip_age){
        this.username = ip_username;
        this.email = ip_email;
        this.age = ip_age;
    }
}