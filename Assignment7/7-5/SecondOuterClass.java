/*
Create a class with an inner class that has a non-default constructor (one that takes arguments). Create a second class with an inner class that inherits from the first inner class.
 */

public class SecondOuterClass extends FirstOuterClass {
    class SecondInnerClass extends FirstInnerClass {
        public SecondInnerClass(String string) {
            super(string);
            System.out.println("Second outer class");
        }
    }
    public static void main(String[] args) {
        FirstOuterClass fo = new FirstOuterClass();
        SecondOuterClass so = new SecondOuterClass();
        SecondInnerClass si = so.new SecondInnerClass("Hi");
    }
}