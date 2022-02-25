/* Create a Cycle class, with subclasses Unicycle, Bicycle and Tricycle.
Add a balance( ) method to Unicycle and Bicycle, but not to Tricycle.
Create instances of all three types and upcast them to an array of Cycle. Try to call balance( ) on each element of the array and observe the results. Downcast and call balance( ) and observe what happens  */
public class MainCycle {
    public static void main(String[] args){
        //upcasting(typecast a child object to a parent object)
        Cycle [] cycle= new Cycle[3];
        cycle[0]=new Bicycle();
        cycle[1]=new Unicycle();
        cycle[2]= new Tricycle();

        //downcasting (a parent object to a child object)
        ((Bicycle)cycle[0]).balance();
        ((Unicycle)cycle[1]).balance();

        //This will cause an error because balance() is not defined in the Tricycle
//       ((Tricycle)cycle[2]).balance();
}
}
