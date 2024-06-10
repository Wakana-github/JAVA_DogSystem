
/**
 * this class is for a test to check DogSystem's functions
 *
 * @author  Wakana.G
 * @version 22 May 2023
 */

public class WakanaTest {
    public static void main(String arg[]){

        /**
         1. Store dog breeder's name
         */
        DogBreeder WakanasDogs = new DogBreeder("Wakana's Dog");


        /**
         2-6. Store dog details
         */
        Dog Anna = new Dog("Anna", 4, "F", 111.11);
        PedigreeDog Barry = new PedigreeDog("Barry", 36, "M", 22.22, "Beagle");
        PedigreeDog Cindy = new PedigreeDog("Cindy", 2, "F", 333, "Beagle");
        Dog Darryl = new Dog("Darryl", 5, "M", 44);
        PedigreeDog Elsie = new PedigreeDog("Elsie", 10, "F", 555, "Poodle");

        /**
         7. Add dog details in the dogs list
         */
        WakanasDogs.addDog(Anna);
        WakanasDogs.addDog(Barry);
        WakanasDogs.addDog(Cindy);
        WakanasDogs.addDog(Darryl);
        WakanasDogs.addDog(Elsie);

        /**
         8-17 Check required functions in the system
         */
        WakanasDogs.listDogs();
        WakanasDogs.printTotal();
        WakanasDogs.printCheaperThan(50);
        WakanasDogs.printCheaperThan(30);
        WakanasDogs.printSameBreed("Beagle");
        WakanasDogs.printSameBreed("Poodle");
        WakanasDogs.deleteDog(Cindy);
        WakanasDogs.listDogs();
        WakanasDogs.printTotal();
        WakanasDogs.addDog(Elsie);
    }
}
