//public class Fish {
//we know fish can eat smaller fish and can be hunted by big fish
//so fish has both flee and hunt method, we can implement more than one interface here
// we can implement more interface by comma
public class Fish implements Prey, Predator{
    @Override
    public void flee(){
        System.out.println("The fish is swimming away");
    }

    @Override
    public void hunt(){
        System.out.println("this fish is hunting");
    }



}
