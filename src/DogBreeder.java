import java.util.*;
//package Package09;

/**
 * This class defines functions for this system.
 *
 * @author  Wakana Gushi
 * @version 22 May 2023
 */

public class DogBreeder {

    private ArrayList<Dog> dogs = new ArrayList<Dog>();
    private String breederName;

    /**
     breederName: dog breeder name as a string
     */

    public DogBreeder(String newDogBreeder) {
        this.breederName= newDogBreeder;
    }



    public String getBreederName(){
        return breederName;
    }


    /**
     check if the dog name provided in the inDog attribute matches any names in the dogs list
     */
    public boolean findDog(String inDog) {
        for (Dog nextDog : dogs) {
            if (inDog.equals(nextDog.getName())) {
                System.out.println(nextDog);
                return true;
            }
        }
        return false;
    }

    /**
     2-7. add dog details to the dogs list.
     If the dog name is found in the dogs list, return an error.
     */
    public boolean addDog(Dog newDog) {
        if (findDog(newDog.getName())) {
            System.out.println("Error - dog " + newDog.getName() + " is already in the dogs record\n");
            return false;
        } else {
            dogs.add(newDog);
            return true;
        }

    }

    /**
     2-8. Remove dog details from the dogs list.
     If the dog name is not found in the dogs list, return an error.
     */
    public boolean deleteDog(Dog exDog) {
        if (findDog(exDog.getName())) {
            dogs.remove(exDog);
            System.out.println(exDog.getName() + " is now with a new family.\n");
            return true;
        }
        else {
            System.out.println("Error - dog " + exDog.getName() + " is not exist in the dogs record\n");
            return false;
        }

    }
//
//    public void printDogs() {
//        for (Dog nextDog : dogs) {
//            System.out.println(nextDog);
//        }
//
//    }
    /**
     2-9-1.
     Print all dog details in the dogs list.
     */

    public void listDogs() {
        System.out.println("List of dogs for sale by: " + breederName);
        for (Dog nextDogs : dogs) {
            System.out.println(nextDogs);
        }
        System.out.println("\n");
    }


    /**
     2-9-2.
     Calculate the total price of all dogs in the dogs list.
     */

    public double calTotal(){
        double total = 0;
        for (Dog nextDogs : dogs) {
            total += nextDogs.getPrice();
        }
        return total;
    }

    /**
     2-9-2.
     Print the total price of all dogs in the dogs list.
     */
    public void printTotal() {
//        double total = 0;
//        for (Dog nextDogs : dogs) {
//            total += nextDogs.getPrice();
//        }
        System.out.println("The total price for all dogs by " + breederName + " is \n" + calTotal() +"\n");
    }


    /**
     2-9-3.
     Print a list of dogs cheaper than threshold from the dogs list.
     */

    public void printCheaperThan(int threshold) {
        System.out.println("The list of " + breederName + " for less than $" + threshold);
        for (Dog nextDog : dogs) {
            if (nextDog.getPrice() < threshold) {
                System.out.println(nextDog);
            }
        }
        System.out.println("\n");

    }

    /**
     2-9-4.
     Print a list of dogs same as input breed from the dogs list.
     */

    public void printSameBreed(String dogBreed) {
        System.out.println("The list of " + dogBreed + "s for sale at " +breederName);
        for (Dog nextDog : dogs) {
            if (nextDog instanceof PedigreeDog)
                if (((PedigreeDog)nextDog).getBreed() == dogBreed) {
                    System.out.println(nextDog.getName());
                }
        }
        System.out.println("\n");
    }


}
