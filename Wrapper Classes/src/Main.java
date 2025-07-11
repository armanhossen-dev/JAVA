public class Main {
    public static void main(String[] args) {
    //Wrapper classes = Allow primitive values (int, char, double, boolean)
    //                  to be used as objects, "Wrap them in an object"
    //                  Generally, don't wrap primitives unless you need an object.
    //                  Allows use of Collections Framework and static Utility Methods.


//        making objects but these ar not used now
//        Integer a = new Integer(123);
//        Double d = new Double(3.10)
//        Character c = new Character('$');
//        Boolean b = new Boolean(true);

        //BUT WE USE MODERN TECHNIC ->
        //AutoBoxing

        Integer a = 123;
        Double d = 3.10;
        Character c = '$';
        Boolean b = true;
        System.out.println("Autoboxing!");
        System.out.println(a + " " + b + " " + c + " " + d);
        //here 123, 3.10, $, ture are primitives and we are wraping them into objects a,d,c,b and object type is Integer, Double, Character, Boolean
        //like the way we use Stirng, it like same , we can use Integer, Double, Character, Boolean like String
        String s = "pizza";
        //Integer, Double, Character, Boolean, String - this are all reference data type, they are type of object

        //a , d , b, c, s are objects , remember that!!!
        //Unboxing
        System.out.println("\nUnboxing!");
        int a2 = a;  //a2,d2,c2,b2 are variable
        double d2 = d;
        char c2 = c;
        boolean b2 = b;
        System.out.println(a2 + " " + d2 + " " + c2 + " " + b2);

        //now this wrapper class does have some usefull static Utility Methods.
        //if i have to convert a premitive data type to string , i can use toString(vlaue) method
        String a3 = Integer.toString(123);
        String b3 = Boolean.toString(true);
        String c3 = Character.toString('$');
        String d3 = Double.toString(3.10);
        System.out.println("\ntoString");
        String f = a3 + " " + b3 + " " + c3 + " " + d3;
        System.out.println(f);


        int a4 = Integer.parseInt("123"); //Integer.parseInt("StringNumberInput") it will make it number int type
        double d4 = Double.parseDouble("3.13"); //Double.parseInt("StringNumberInput") it will make it number double type
        char c4;
//        char doesn't have parse Method, so we use string method
        c4 = "Arman".charAt(0);
        boolean b4 = Boolean.parseBoolean("True");
        System.out.println("\nDatatype.parseDatatype(\"String\")");
        System.out.println(a4 + " " + b4 + " " + c4 + " " + d4);
        System.out.println();
        char letter = 'r';
        System.out.println("letter = " + letter);
        System.out.println("Character.isLetter(letter) = " + Character.isLetter(letter)); // true
        //Character.isLetter(letter) this returns the boolean type, if ithat variable stored a letter or not
        System.out.println("Character.isUpperCase(letter) = " + Character.isUpperCase(letter)); // return a boolean, if the letter is uppercase or not

        //Wrapper classes are Integer, Double, Character, Boolean,
        //we will use ArrayList, ArrayList only works with Wrapper Class objects
    }
}
