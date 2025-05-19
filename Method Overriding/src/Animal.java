public class Animal {
    boolean isAlive;
    Animal(){
        isAlive = true;
    }

    void move(){ //now dog, fish, cat will use this,
        // but if i write Running insted of moving, then fist dosen't run, it swims
        // so we can again make a method inside Fish class as same name void move() then use as text O/P i need
        //System.out.println("This Animal is Moving!");

        // this is method overriding, also i have to write '@Override' to the upside line of the void move() function in Fish class
        System.out.println("This Animal is Running!");
    }

}
