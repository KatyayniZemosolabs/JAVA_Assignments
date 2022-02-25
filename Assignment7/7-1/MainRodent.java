/*
Question: Create an inheritance hierarchy of Rodent: Mouse, Gerbil, Hamster,etc.
In the base class, provide methods that are common to all Rodents, and
override these in the derived classes to perform different behaviors depending on the specific type of Rodent.
Create an array of Rodent, fill it with different specific types of Rodents, and call your base-class methods to see what happens.
Make the methods of Rodent abstract whenever possible and all classes should have default constructors
that print a message about that class.
*/
class Rodent
{
    public void TypeOfTeeth(){
        System.out.println("rodents have incisors");
    }

}
class Mouse extends Rodent{
    public void TypeOfTeeth(){
        System.out.println("Mice have four incisors, two maxillary (upper) incisors, and two mandibular (lower) incisors.");
    }

}
class Gerbill extends Rodent{
    public void TypeOfTeeth(){
        System.out.println("Gerbils have four large incisors");
    }

}
class Hamster extends Rodent{
    public void TypeOfTeeth(){
        System.out.println("Hamsters are born with a set of 16 teeth; 4 of which are incisors (front teeth) and 12 molars");
    }

}
public class MainRodent {
    public static void main(String args[]){
        Rodent rodents[]= new Rodent[3];
        rodents[0]= new Mouse();
        rodents[1]= new Gerbill();
        rodents[2]= new Hamster();

        rodents[0].TypeOfTeeth();
        rodents[1].TypeOfTeeth();
        rodents[2].TypeOfTeeth();

    }
}
