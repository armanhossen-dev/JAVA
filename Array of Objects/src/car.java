public class car {
    String modelName;
    String color;

    car(String model_Name, String Car_color){
        this.modelName = model_Name;
        this.color = Car_color;
    }

    void drive(){
        /*
        ✅ Use this when: an
        color = "orange" → "He is driving an orange Mustang on the road."
        color = "indigo" → "He is driving an indigo Civic on the road."
        ⚠️ But for consonants: a
        color = "blue" → "He is driving an blue car..." ❌ (Incorrect — should be "a blue")
         */
        //System.out.println(String.format("He is driving an %s %s on the road.", color, modelName));
        String article = "aeiou".indexOf(Character.toLowerCase(color.charAt(0))) >= 0 ? "an" : "a"; //wow what a line bro
        System.out.println(String.format("He is driving %s %s %s on the road.", article, color, modelName));

    }
    void drive(String name){
        String article = "aeiou".indexOf(Character.toLowerCase(color.charAt(0))) >= 0? "an" : "a";
        System.out.printf(name + " will drive %s %s %s\n", article, color, modelName);
    }



}
