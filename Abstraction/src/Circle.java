public class Circle extends Shape{

    double radius;
    Circle(double radius){
        super(0);
        this.radius = radius;
    }

    @Override
    double area(){
        return Math.PI*Math.pow(radius,2);
    }
}
