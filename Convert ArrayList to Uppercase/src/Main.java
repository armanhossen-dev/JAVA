import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("arman");
        names.add("ripon");
        names.add("hossen");

        for (int i = 0; i < names.size(); i++) {
            names.set(i, names.get(i).toUpperCase());
        }

        System.out.println(names); // [ARMAN, RIPON, HOSSEN]
    }
}
// or
/*
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("arman");
        names.add("ripon");
        names.add("hossen");

        List<String> upperNames = names.stream()
                                       .map(String::toUpperCase)
                                       .collect(Collectors.toList());

        System.out.println(upperNames); // [ARMAN, RIPON, HOSSEN]
    }
}
*/