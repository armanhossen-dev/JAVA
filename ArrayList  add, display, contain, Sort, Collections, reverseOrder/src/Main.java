import java.util.Collections;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args){
        ArrayList<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(3);
        num.add(2);

        Collections.sort(num);
        System.out.println("Sorted list : " + num);
        //Sorted list : [1, 2, 3]

        Collections.sort(num, Collections.reverseOrder());
        System.out.println("Sorted in Descending Order : " + num);


        ArrayList<String> names = new ArrayList<>();
        names.add("Arman");
        names.add("Ali");
        names.add("Saief");
        names.add("Khan");
        names.add("khan");
        Collections.sort(names);
        System.out.println("Sorted Names: " + names);

//        Collections.sort(names, Collections.reverseOrder());
//        System.out.println("Sorted Names(Descending ): " + names);

        names.remove(0);
        System.out.println(names);


//        int target = "Saief";
//        if(names.contains(target)){
          if(names.contains("Saief")){
            System.out.println("Found!");
        }else{
            System.out.println("Not found!");
        }
    }
}
