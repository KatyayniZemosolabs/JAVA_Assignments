/*
 Create three interfaces, each with two methods. Inherit a new interface that combines the three, adding a new method. Create a class by implementing the new interface and also inheriting from a concrete class. Now write four methods, each of which takes one of the four interfaces as an argument. In main( ), create an object of your class and pass it to each of the methods.
 */

public class Main {
    public void foodVariety(FoodVariety d)
    {
        d.varietyOfFood();
    }
    public void italianFood(Italian a )
    {
        a.Pasta();
        a.Pizza();
    }
    public void indianFood(Indian b )
    {
        b.Roti();
        b.Rice();
    }
    public void chineseFood(Chinese c )
    {
        c.Momose();
        c.Noodles();
    }

    public static void main(String args[]){
        TestFood obj= new TestFood();
        Main order = new Main();
        order.chineseFood(obj);
        order.indianFood(obj);
        order.italianFood(obj);

    }


}
