import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Employee> es = new ArrayList<>();

        Doctor d1 = new Doctor("Arnab korim", "D101", 33000,"Blood","Skin");
        Surgeon s1 = new Surgeon("Rumi Rahman", "D202", 50330, "", "Bone",4, 20);
        es.add(d1);
        es.add(s1);

        d1.work();
        s1.work();
    }
}
