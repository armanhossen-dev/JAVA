import javax.swing.plaf.basic.DefaultMenuLayout;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //.substring() = A method used to extract a portion of a string
        // string.substring(star_idx, end_idx) , creates a sub string

        Scanner scan = new Scanner(System.in);

        String email = "armanhossen.cse@gmail.com";

        String username = email.substring(0, email.indexOf("@")); // from first char to before of '@'
        System.out.println("username : " + username); // username : armanhossen.cse
        String domain = email.substring(email.indexOf("@"), email.length());
        // we can also do this withoud ending index
        String domain2 = email.substring(email.indexOf("@")+1); //to get after @
        System.out.println("domain : " + domain);
        System.out.println("domain2 : " + domain2); // domain2 : gmail.com

        System.out.print("Enter your email : ");
        email = scan.nextLine();

        //System.out.println("Your username : " + email.substring(0,email.indexOf("@")));
        //System.out.println("Your domain : " + email.substring(email.indexOf("@")+1));
        //checking validation of email
        if(email.contains("@")){
            System.out.println("Your username : " + email.substring(0,email.indexOf("@")));
            System.out.println("Your domain : " + email.substring(email.indexOf("@")+1));
        }else{
            System.out.println("Email must contain \'@\'");
        }
        scan.close();
    }
}