import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestDogBreeder1 {
    @Test
/**
    Test1
    Check if addDog function is working as intended.
    Insert dog details and compare if the name of the dog is stored in the dogs list
 */
    public void Test1()

    {
        DogBreeder DogBreeder1 = new DogBreeder("Wakana's Dog");
        Dog dog1 = new Dog("Anna", 4, "F", 111.11);
        DogBreeder1.addDog(dog1);
        assertEquals(true, DogBreeder1.findDog("Anna"));
    }


    @Test
    /**
     Test2
     Check if total price is calculated as intended.
     Insert five dog details and compare if the result of calculation function is the same as the acutual total price(1065.33)
     */
    public void Test2()
    {
        DogBreeder DogBreeder1 = new DogBreeder("Wakana's Dog");
        Dog dog1 = new Dog("Anna", 4, "F", 111.11);
        PedigreeDog dog2 = new PedigreeDog("Barry", 36, "M", 22.22, "Beagle");
        PedigreeDog dog3 = new PedigreeDog("Cindy", 2, "F", 333, "Beagle");
        Dog dog4 = new Dog("Darryl", 5, "M", 44);
        PedigreeDog dog5 = new PedigreeDog("Elsie", 10, "F", 555, "Poodle");

        DogBreeder1.addDog(dog1);
        DogBreeder1.addDog(dog2);
        DogBreeder1.addDog(dog3);
        DogBreeder1.addDog(dog4);
        DogBreeder1.addDog(dog5);



        assertEquals(true, (DogBreeder1.calTotal() == 1065.33));

    }
}
