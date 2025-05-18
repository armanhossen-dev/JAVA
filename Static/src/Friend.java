public class Friend {
    String name;
    //lets calculate how many object i have created
    //int numOfFrineds ; //each friend object has this same copy of this variable so each time i create a new object it ++ and make increment for 1
    //but making this variable static can help me count friends
    static int numOfFrineds = 0 ;
    //by using keyword static now this 'numOfFrineds' variable is shared by every object
    // which is created by this class, and all object has access to it
    Friend(String fnd_name){
        this.name = fnd_name;
        numOfFrineds++; // always 1,
    }

    void myfriend(){
        // System.out.println(name + " is my friend.");
        System.out.println(Friend.numOfFrineds + ". " + name + " is my friend.");
    }

    //showing total friends number
    static void totalfriends(){
        System.out.println(String.format("You have total %d friend%s", numOfFrineds, (numOfFrineds == 1 ? "" : "s")));
    }



}
