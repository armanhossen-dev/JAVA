public class Faculty implements Secret{
    String name;
    // constructor method overloading
    Faculty(){}
    Faculty(String name){
        this.name = name;
    }

    @Override
    public void hi(){
        System.out.println("HI, I am  "+ name +" a Faculty!!!");
    }
}
