/* Create a class with a constructor that takes a String argument. During construction, print the argument. Create an array of object references to this class, but don’t actually create objects to assign into the array. When you run the program, notice whether the initialization messages from the constructor calls are printed.
 */
public class ThirdOfSixth {
    public String str;
    public ThirdOfSixth(String str){
        this.str = str;
        System.out.println(str);

    }
    public static void main(String[] args){
        //Constructor won't be invoked as we are creating an array object.
        ThirdOfSixth arr[]= new ThirdOfSixth[10];
        //constructors are invoked
        for(int i=0;i<10;i++)
            arr[i]= new ThirdOfSixth("Constructor invoked");
    }
}
