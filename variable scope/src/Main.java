public class Main {

    //class variable is declared inside  a class not in a method
    static int y = 30; // class scope or class variable
    static int x = 20; //creating same named variable as class and local variable, but if inside a mehtod i use the same named variable and type of variable then the methods variable value will be work, not the class variables value
    //but if the class variable is const then it will work

    public static void main(String[] args){
    //https://youtu.be/xTtL8E4LzTQ?t=15968
    //variable scope = where a variable can be accessed
    // two level - local,   class

    //inside a class if i declare a variable then it is a local scope / local variable
        int x = 1;
        System.out.println(x); //1
        dosome(); //2
        System.out.println("y : " + y); //y : 30

    }
    static void dosome(){
        int x = 2; //here we have variable with same name, and it's also a local scope or vairable
        System.out.println(x);

    }


}

