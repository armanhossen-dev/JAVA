public class Main {
    public static void main(String[] args){
        //https://youtu.be/xTtL8E4LzTQ?t=28322

        //abstract =  used to define abstract classes and  methods
        //            Abstraction is the process of hiding implementation details
        //            and showing only the essential features;
        //            abstract classes can't be instantiated directly, can't create objects form this class directly
        //            can contain 'abstract' methods (which mush be implemented)


        //            can contain 'concrete' methods (which are inherited)
        /*
            void howManySide(){  /// concrete method
                         System.out.println("This object has " + num +" Side.");
           }
        */
        //because Shape class is abstracted so we can't create objects of Shape class
        // But we can use or call the method of an abstract class if a child class inherits from the abstract parent class Shape.
        /*
        A circle has no sides in the traditional sense, because it is a continuous curved shape with no straight edges or corners.
        However, sometimes humorously or philosophically, people say:
        "A circle has two sides: inside and outside."
        But geometrically:
        Sides = 0.
         */
        Circle c1 = new Circle(3);
        Triangle t1 = new Triangle(3,4); // 3
        Rectangle r1 = new Rectangle(3,4); // 4
        // howManySide() is a method from abstract class Shape, we can not make objects like shape ,
        // but we can access its method by its children class
        //void howManySide(){  /// concrete method
        //        System.out.println("This object has " + num +" Side.");
        //}
        c1.howManySide();
        t1.howManySide();
        r1.howManySide();

        System.out.println();

        //System.out.printf("Class name: %s\n",c1.getClass().getSimpleName());

        System.out.printf("Circle Area: %.2f cm²\n", c1.area());
        System.out.printf("Triangle Area: %.2f cm²\n",t1.area());
        System.out.printf("Rectangle Area: %.2f cm²\n",r1.area());
        /*
        Dard ko mehsoos karo
        Dard ko jaano
        Dard ko apna lo
        Ye duniya
        ye duniya pittal di
        o baby doll main sone di
        dil me mere hai
        dard e disco
        aadivasi heroine chiye
        kis kis ko
        or abb
        assi tussi
        all almighty push
         */





    }
}

