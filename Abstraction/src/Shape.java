//public class Shape {

// to make shape class abstract, now we can't create any object from shape class, we can add it as  parent class of others
public abstract class  Shape{

    int num;
    Shape(int n){
        this.num = n;
    }

    void howManySide(){  // concrete method
        System.out.println("This object has " + num +" Side.");
    }

    //Abstract method, that means the children classes have to define it,
    // Abstract Method Must Be Declared with a Return Type, it can not be void type
    //implementations must if abstract method
    abstract double area();

    //concrete method


}
