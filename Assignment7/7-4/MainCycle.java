/*
Create a Cycle interface, with implementations Unicycle, Bicycle and Tricycle.
Create factories for each type of Cycle, and code that uses these factories.
 */

public class MainCycle {
    public void cycle(CycleFactory cf){
        Cycle c=cf.getCycle();
        c.noOfWheels();
    }
    public static void main(String[] args){
        MainCycle mc=new MainCycle();
        mc.cycle(new BicycleFactory());
        mc.cycle(new UnicycleFactory());
        mc.cycle(new TricycleFactory());
    }
}
