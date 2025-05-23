/*
public class Car extends Vehicle{
    @Override
    void go(){
        System.out.println("You drive the car");
    }
} */

public class Car implements Vehicle{
    @Override
    public void go(){
        System.out.println("You drive the car");
    }
}
