/* Create another class in package yourname.assignment.singleton containing a non-static String member variable. Add a static method that takes String as parameter and initialize the member variable and then return object of that class. Add a non-static method to print the String. */

package katyayni.assignment.singleton;

public class singleton {
    String name;
    public static singleton getObj(String s){
        singleton single = new singleton();
        single.name=s;
        return single;
    }

    public void printName(){
        System.out.println("Name is " + name);
    }

}
