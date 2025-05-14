public class Main {
    public static void main(String[] args){
        // 2D array = an array where each element is an array
        //            useful for storing a matrix of data

        // example of 1D array, this 3 arrays are separated 1D arrays
        String[] fruits = {"Apple", "Orange", "Banana"};
        String[] vegetables = {"Potato", "Onion", "Carrot"};
        String[] meats = {"Chicken", "Beef", "Fish"};

        // now we are making an array of arrays
        //2D array
        // we can write this -> String[][] groceries = {fruits, vegetables, meats};
        //or
        String[][] groceries = {{"Apple", "Orange", "Banana"},
                                {"Potato", "Onion", "Carrot"},
                                {"Chicken", "Beef", "Fish"}};
        // to display elements we can use for loop or enhanced for loop
        for(String[] foods : groceries){
            //System.out.println(foods); // we will get 3 arrays (fruits, vegetables, meats) first elements address
            for(String name : foods){
                System.out.print(name + " ");
            }
            System.out.println();
        }
        /*
        Apple Orange Banana
        Potato Onion Carrot
        Chicken Beef Fish
         */
    }
}
