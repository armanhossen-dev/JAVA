public class Main {
    public static void main(String[] args){
        // overloaded methods = methods that share the same name,
        //                      but different parameters
        //                      signature = name + parameters

        System.out.println(add(1,2));         //3.0
        System.out.println(add(1,2,3));     //6.0
        System.out.println(add(1,2,3,4)); //10.0

        String studentInfo = add_str("Arman Hossen");
        System.out.println(studentInfo);

        String studentInfo2 = add_str("Arman Hossen", "241-15-883");
        System.out.println(studentInfo2);
    }
    //overloaded methods
    static double add(double a, double b){
        return a+b;
    }
    static double add(double a, double b, double c){
        return a+b+c;
    }
    static double add(double a, double b, double c,double d){
        return a+b+c+d;
    }

    static String add_str(String name){
        return name + " is a student.";
    }

    static String add_str(String name, String id){
        return name + " is a student." + " His ID: "+id;
    }
}
