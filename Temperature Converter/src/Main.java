import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        double temp, ConvertedTemp;
        String unit;

        System.out.print("Enter the temperature: ");
        temp = scan.nextDouble();

        System.out.print("Convert to Celsius or Fahrenheit? (C or F): ");
        //unit = scan.next(); // it will take input of a char
        ///lets change the methode of scan, if i take input then i can change it's case to upper
        unit = scan.next().toUpperCase();
        //to ignore the enter or newline after taking input of that char
        scan.nextLine(); // takes newline but not assigned anywhere

        //test1   System.out.println( temp +"°"+unit); // numlock on, press Alt + 0+1+7+6 -> °

        //conditon ? true : false;
        ConvertedTemp = (unit.equals("C")) ? (temp * 5.0/9.0) - 32 : (temp * 9.0/5.0) + 32;
        System.out.printf("%.2f° %s", ConvertedTemp,unit);





        scan.close();
    }
}
