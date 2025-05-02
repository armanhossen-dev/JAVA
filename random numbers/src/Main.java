import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        int num;

        //num  = random.nextInt(); //this will make a new random number and assign into num variable
        //but it will be so big or 9-10 digit numbrer, range between -2^31 t0 +2^31,

        //num = random.nextInt(1,6); // this mans from 1 to 5 number, never 6 but random ly 1 to 5 number will assign into num
        //for dice
        num = random.nextInt(1,7); // to generate 1 - 6 , any number, randomly
        System.out.println(num);

        //for 3 dice and making 3 random number
        int num1, num2, num3;
        num1 = random.nextInt(1, 7);
        num2 = random.nextInt(1, 7);
        num3 = random.nextInt(1, 7);

        //✅ better to use "" most of the case
        System.out.print(num1 + " ");
        System.out.print(num2 + " ");
        System.out.println(num3);

        boolean isHead;
        isHead = random.nextBoolean();
        //System.out.println(isHead);
        if (isHead) {
            System.out.println("HEADS");
        } else {
            System.out.println("TAILS");
        }
    }
}
/*
eat();
prayer();
code();
sleep();
repeat();
“Growth begins where comfort ends;
without resistance, there is no progress.”
LIFE PHILOSOPHY
* */