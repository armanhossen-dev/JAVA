public class Engine {
    String type;
    Engine(String type){
        this.type = type;
    }
    String getEngineType(){
        return type;
    }
    void start(){
        System.out.print("You start the " + type + " engine!\n");
    }

}
