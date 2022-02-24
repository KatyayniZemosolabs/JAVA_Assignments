/* Create a class with two (overloaded) constructors. Using this, call the second constructor inside the first one. */

public class SecondOfSixth {
    public SecondOfSixth(){
        this("Overloaded constructor called from default one");
    }

    public SecondOfSixth(String str){
        System.out.println(str);
    }

    public static void main(String args[]){
        new SecondOfSixth();
    }
}
