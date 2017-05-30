package park_management;
import java.util.ArrayList;
import java.util.HashMap;

public class Enclosure {

   private HashMap<String, Dinosaur> dinosaurs;
   private String enclosureType;

   public Enclosure(){
    dinosaurs = new HashMap<String, Dinosaur>();
}

public HashMap<String, Dinosaur> getDinosaurs(){
    return dinosaurs;
}

public int getNumberOfDinos() {
    return dinosaurs.size();
}


public void removeDinosaur(Dinosaur dinosaur){
    dinosaurs.remove(dinosaur.getName(), dinosaur);
}

public void addDinosaur(Dinosaur newDinosaur){

    if(this.dinosaurs.size() == 0) {
        dinosaurs.put(newDinosaur.getName(), newDinosaur);
        enclosureType = newDinosaur.getClass().getName();
        return;
    }
    if (newDinosaur.getClass().getName() == enclosureType) {
        dinosaurs.put(newDinosaur.getName(), newDinosaur);
    } else {
        System.out.println("Only dinosaurs of a similar type can be added to an enclosure");
    }

}

} 

