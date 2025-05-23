public class Main {
    public static void main(String[] args){
        //https://youtu.be/xTtL8E4LzTQ?t=28894
//Interface = A blueprint for a class that specifies a set of abstract methods
        //    that implementing classes MUST define.
        //    supports multiple inheritance-like behavior.
        /// by Interface , a class can have multiple parents 2++ -> more
        //create inteface not class, 'new' ->  'java class' -> 'interface' -> name that java file,

        Rabbit r1 = new Rabbit();
        r1.flee();
        Hawk h1 = new Hawk();
        h1.hunt();

        Fish f1 = new Fish();
        f1.flee();
        f1.hunt();
    }
}