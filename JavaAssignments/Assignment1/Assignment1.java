//Question: Create a java program to search through the home directory and
// look for files that match a regular expression.
//The program should be able to take inputs repeatedly and
//should print out the full absolute path of the matching files found.

import java.io.File;
import java.util.Scanner;

public class Assignment1 {
    private void findFile()
    {
        // address of files or folder where to search
        File file = new File("C:\\Users\\Katyayni Tripathi\\Desktop\\Zemoso\\JavaAssignments\\Assignment1");
        //string to store the name of the file
        String str ;
        Scanner in = new Scanner(System.in);

        // do while is used to run the program again and again
        do{
            int ab =0;
            System.out.println("Enter the name of the file or folder");
            //take input
            str =in.nextLine();
            //list of file is stored in string
            String[] files = file.list();

            //check each file or folder
            for (String string : files){
                //check the name of file present or not and store in boolean str1
                Boolean str1 = str.equals(string);
                // str1 is true then print the following
                if (str1){
                    ab = 1;
                    System.out.println("File Found : ");
                    System.out.println(string);
                    //print the address of the file
                    System.out.println("Path : "+ file.getAbsolutePath());
                }
            }
            //if file not found
            if(ab == 0)
            {
                System.out.println("File not find : Re-enter the name of the file.");
            }
        } while(true);
    }

    //declared main()
    public static void main(String[] args){
        //object of Demo class is created
        Assignment1 obj =new Assignment1();
        //calling the findFile()
        obj.findFile();
    }
}