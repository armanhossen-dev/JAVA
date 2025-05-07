import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String name = "Arman Hossen Ripon";
        System.out.println(name);

        //length of a string
        int len = name.length();
        System.out.print("name.length = ");
        System.out.println(len); // how many char in this string is the total len of the string

        //find char by index
        char letter = name.charAt(0);  //name.charAt(index_number_of_char_in_that_String); // '0' is the first char of the string
        System.out.print("name.charAt(0) = ");
        System.out.println(letter);

        ///finding the letter first apper in which index, if found then it return's index ,if not found then returns -1
        //finding the "R" char location by the index
        int index = name.indexOf("R"); // if there is more than one R then it will return the first finding index of the R
        System.out.print("name.indexOf(\"R\") = ");
        System.out.println(index);


        int index2 = name.indexOf("n");
        System.out.print("name.indexOf(\"n\") = "); //4
        System.out.println(index2);

        ///finding the letter's last apper in which index, if found then it return's index ,if not found then returns -1
        int lastIndex = name.lastIndexOf("n");  // if there is more than one R then it will return the last finding index of the R
        System.out.print("name.lastIndexOf(\"n\") = "); //17
        System.out.println(lastIndex);

        //to make all the char UPPERCASE
        name = name.toUpperCase();
        System.out.print("name.toUpperCase() = ");
        System.out.println(name);

        //to make all the char lowercase
        name = name.toLowerCase();
        System.out.print("name.toLowerCase() = ");
        System.out.println(name);

        System.out.println();
        //to trim the whitespace before and end of words, not between them
        String test = "         String   Methodes     ";
        System.out.println("String test = \"         String   Methodes     \"");
        test = test.trim();
        System.out.print("test.trim() = ");
        System.out.println(test);


        System.out.println();
        //replace char in a stirng
        String str1 = "Hello World";
        System.out.print("str1 = \"Hello World\" => ");
        str1 = str1.replace("l", "*");
        System.out.println(str1);


        //to check if a string is empty or not
        //str1.isEmpty() this will return boolean value
        System.out.println("str1.isEmpty() = " + str1.isEmpty());

        //to find if any string contains a specific char ,then return  a boolean value, not for word
        if(name.contains(" ")){
            System.out.println( "name.contains(\" \") = " + name.contains(" "));
        }
        /* this doesn't works, stringName.contains("singleChar")
        if(name.contains("Ripon")){
            System.out.println("name.contains(\"Ripon\") = " + name.contains("Ripon"));
        }
        */

        //if the strings are equal or not
        String pass = "password";
        System.out.println(pass);
        if(pass.equals("password")) {
            System.out.println("pass.equals(\"password\") = " + pass.equals("password"));
        }

        //🛠 practice of equal strings
        String user;
        String f = "arman25";
        System.out.print("Enter first Name (arman25): ");
        user = scan.nextLine();
        if(user.equals(f)){
            System.out.println("user.equals(f) = " + user.equals(f));
        }else{
            System.out.println("not equal to f : " +  f);
        }

        //😎while finding equal or not, i can ignore case sensitivities, here the compairing string can be lower or upper case, i just compaire the char not it's uppercase or lowercase, then we use '.equalsIgnoreCase()'
        String codeName = "AHRN";
        System.out.print("Enter codeName (\'ahrn\' in any upper or lower case combination): ");
        codeName = scan.nextLine();

        if(codeName.equalsIgnoreCase("ahrn")){
            System.out.println("Matched \uD83D\uDE0E "); //😎
            System.out.println("codeName.equalsIgnoreCase(\"ahrn\") = " + codeName.equalsIgnoreCase("ahrn"));
        }else{
            System.out.println("Not Matched 😥");
        }

        /*
        int num;
        num = scan.nextInt();
        for(int i = 1; i<=10; i++){
            //System.out.println(i+1);
            System.out.printf("%d X %d = %d\n", i, num, i*num);
        }
         */
        scan.close();
    }
}