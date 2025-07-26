public  abstract class Person {
    int age;
    String name;
    String id;
    Person(int age, String name, String id){
        this.age = age;
        this.name = name;
        this.id = id;
    }
    abstract void displayInfo();
}

