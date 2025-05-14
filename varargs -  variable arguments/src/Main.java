public class Main {
    public static void main(String[] args){
        //https://youtu.be/xTtL8E4LzTQ?t=19703
        //varargs = allow a method to accept a varying # of arguments
        // makes method more flexible, no need for overloaded  methods
        // java will pack the arguments into an array
        //  ... (ellipsis) in parameter using 3dots after the data type then name the packedArray
        int total = sum(1,2,3,4,5);
        System.out.println(total); //15
        double cgAvg = average(3.35,3.1, 2.94);
        System.out.printf("%.2f",cgAvg);

    }
    //overloaded methods - are the methods that shares the same name , but have different parameter
    static double add(int a, int b){
        return a+b;
    }
    static double add(int a, int b, int c){
        return a+b+c;
    }
    static double add(int a, int b, int c, int d){
        return a+b+c+d;
    }


    ///  now we will create only 1 add method that can handel varing arguments
    static int sum(int... packedArray){ // now using sum(1,2,3,4,5); then those numbers will be packed as an array and we can use for loop or enhanced for loop for that
        int s = 0;
        for(int a : packedArray){
            s += a;
        }
        return s;
    }

    static double average(double... nums){
        if(nums.length == 0){
            return  0;
        }
        double sum = 0, i = 0;
        for(double s : nums){
            sum += s;
            i++;
        }
        return  sum/i; //or same
        //return  sum/nums.length;
    }
}