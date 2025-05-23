/*
public class Bike extends Vehicle{
    @Override
    void go(){
        System.out.println("You drive the Bike");
    }
} */

public class Bike implements Vehicle{
    @Override
    public void go(){
        System.out.println("You drive the Bike");
    }
}