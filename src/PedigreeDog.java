/**
 * pedigreeDog is a subclass of dog.
 *
 * @author  Wakana.G
 * @version 22 May 2023
 */



public class PedigreeDog extends Dog
{

    private String breed;

    /**
     Breed: dog breed as a string
     */
    public PedigreeDog(String inName, int inAge, String inGender, double inPrice, String inBreed)
    {
        super(inName, inAge, inGender, inPrice);
        breed=inBreed;
    }

    public void setBreed(String newBreed){breed= newBreed;}

    public String getBreed(){return breed; }


    /**
     Print dog details with their breed.
     */
    public String toString(){ return super.toString() + " Breed:" + breed; }


}