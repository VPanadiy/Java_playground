package Others.JavaKids.PracticeOnClasses.PetMaster;

/**
 * Created by Vitaliy on 28.11.2016.
 */
public class Pet {
    int age;
    float weight;
    float height;
    String color;

    public void sleep(){
        System.out.println("Спокойной ночи! До завтра!");
    }

    public void eat(){
        System.out.println("Я очень голоден, давай перекусим счипсами!");
    }

    public String say(String aWord){
        String petResponse = "Ну ладно!! " + aWord;
        return petResponse;
    }
}
