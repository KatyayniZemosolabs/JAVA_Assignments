/*
A vampire number v is a number with an even number of digits n, that can be factored into two numbers x and y each with n/2 digits and not both with trailing zeroes, where v contains precisely all the digits from x and from y, in any order. Write a java program to print first 100 vampire numbers.
*/
public class OneOfSixth {
    public static void main(String[] args){
        VampNum vampireNumber=new VampNum();
        vampireNumber.printVampireNumbers(100);

    }
}
