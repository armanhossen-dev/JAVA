public class Main {
    public static void main(String[] args){
//        super = [Refers to the parent class] (subClass <- superClass)
//                used in 'constructors' and methods 'overriding'
//                calls the parent 'constructor' to initialize attributes
        Person arman = new Person("Arman", "Hossen");
        arman.showfullname(); //Arman Hossen //https://youtu.be/xTtL8E4LzTQ?t=27178
        Student stu1 = new Student("Rakib", "hasan", 3.80);

        stu1.showfullname(); // showfullname(); is from person, student class is using it
        stu1.showgpa();
        System.out.println();

        Employee hossen = new Employee("Arman", "khan", 40000);
        hossen.hiName();
        hossen.sal();
    }
}