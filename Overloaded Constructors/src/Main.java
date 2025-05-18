public class Main {
    public static void main(String args[]){
        /*
        overloaded constructors = Allow a class to have multiple constructors
                                  with different parameter lists.
                                  Enable objects to be initialized in various ways.
        create User class, then make attributes then define some constructor with same name and different parameters like overloaded methods, they will  work like overloaded constructors
        */
        User user0 = new User(); //Anonymous profile
        System.out.println("user0.username: " + user0.username);
        System.out.println("user0.email: " + user0.email);
        System.out.println("user0.age: " + user0.age);

        System.out.println();
        User user1 = new User("armanhossen");
        System.out.println("user1.username: " + user1.username); //armanhossen
        System.out.println("user1.email: " + user1.email); //Not Provided
        System.out.println("user1.age: " + user1.age); //0

        System.out.println();
        User user2 = new User("tryfindme", "tryfindme@gmail.com");
        System.out.println("user2.username: " + user2.username);
        System.out.println("user2.email: " + user2.email);
        System.out.println("user2.age: " + user2.age);

        System.out.println();
        User user3 = new User("ahrn", "armanhossen.cse@gmail.com", 22);
        System.out.println("user3.username: " + user3.username);
        System.out.println("user3.email: " + user3.email);
        System.out.println("user3.age: " + user3.age);
    }
}