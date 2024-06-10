/**
 * Abstract class Dog
 *
 * @author  Wakana.G
 * @version 22 May 2023
 */


public class Dog {

    private String name;
    private int age;
    private String gender;
    private double price;

    /**
     * Dogs initially don't have a breed record
     * name: the dog name as a String
     * age: numbers of weeks as int
     * gender: String M or F
     * price: price in dollars and cents
     */
    public Dog(String inName, int inAge, String inGender, double inPrice) {
        name = inName;
        age = inAge;
        gender = inGender;
        price = inPrice;
    }

//    public void setName(String newName) {
//        name = newName;
//    }

    public String getName(){
        return name;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    public int getAge() {
        return age;
    }

//    public void setGender(String newGender) {
//        gender = newGender;
//    }

    public String getGender() {
        return gender;
    }

    public void setPrice(double newPrice) {
        price = newPrice;
    }

    public double getPrice() {
        return price;
    }

    public String toString(){
        return "Name: " + name + " Age: " +age + " Gender: " + gender + " Price: " + price;
    }

}

