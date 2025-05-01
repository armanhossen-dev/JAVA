import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //MAD LIBS GAME //GIVES YOU A STORY AND LIKE FILL IN THE GAP TYPE
        Scanner scan = new Scanner(System.in);

        String adjective1;
        String adjective2;
        String noun1;
        String verb1;
        String adjective3;

        System.out.print("Enter an adjective (description): ");     adjective1 = scan.nextLine(); //suspicious
        System.out.print("Enter a noun (animal or person): ");      noun1 = scan.nextLine();      //Mark Zuckerburg
        System.out.print("Enter an adjective (description): ");     adjective2 = scan.nextLine(); //smelly
        System.out.print("Enter a verb end with -ing (action): ");  verb1 = scan.nextLine();      //screaming
        System.out.print("Enter an adjective (description): ");     adjective3 = scan.nextLine(); //happy

        System.out.println();
        System.out.println("Today I went to a " + adjective1 + " Zoo.");
        System.out.println("In an exhibit, I saw a " + noun1 + ".");
        System.out.println(noun1 + " was " + adjective2 + " and " + verb1 + "!");
        System.out.println("I was " + adjective3 + "!");

        scan.close();
    }
}
