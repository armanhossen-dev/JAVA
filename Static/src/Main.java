public class Main {
    public static void main(String[] args){
        //static =  Makes a variable or method belong to the class
        //          rather than to any specific object.
        //          commonly used for utility methods or shared resources

        Friend friend1 = new Friend("Arman");
        friend1.myfriend();

        Friend friend2 = new Friend("Hossen");
        //friend1.myfriend(); //2
        friend2.myfriend(); //2 , so after define a new object calling this static count

//
//        System.out.println(friend1.numOfFrineds); //2
//        System.out.println(friend2.numOfFrineds); //2
//
//        we should access the static attribute by the clasName.StaticAttribute_or_method
//        System.out.println(Friend.numOfFrineds); //2


        Friend friend3 = new Friend("Ripon");
        friend3.myfriend();


        Friend friend4 = new Friend("Ali");
        friend4.myfriend();
        System.out.println();

        //showing total friends number
        Friend.totalfriends();
        /// //////////////////////////////////////////////////////////////////
        //Math is a utility method
//        we access it by Math.
//                examples
        double r1 = Math.round(5.448); //5.0
        double r2 = Math.pow(3,5); //243.0
        System.out.println(r1 + " " + r2);
        /*
        * we don't need to create an object like this,
        Math math1 = new Math();
        //then access like this
        math1.round(25.55);

        */
        ///here Math is a class and round is a static method of Math class, geting access by Math.round();
    }
}
