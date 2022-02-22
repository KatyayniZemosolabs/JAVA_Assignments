import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;
import java.util.Calendar;

public class Assignment4 {
    public static void main(String[] args) throws Exception{
        Scanner keyboard=new Scanner(System.in);
        int testCase=keyboard.nextInt();
        while(testCase-->0)
        {
            String date1=keyboard.next();
            String date2=keyboard.next();

            //Getting sign up date and current date
            //Parsing is to read the value of one object to convert it to another type
            Date signupDate=new SimpleDateFormat("dd-MM-yyyy").parse(date1);
            Date currentDate=new SimpleDateFormat("dd-MM-yyyy").parse(date2);
            if(currentDate.compareTo(signupDate)>0)
            {
                Date start,end,cal;
                cal=signupDate;
                //replacing sign up year from current year
                cal.setYear(currentDate.getYear());

                Calendar calendar=Calendar.getInstance();
                calendar.setTime(cal);
                //setting end range of the output
                calendar.add(Calendar.DATE, 30);
                end=calendar.getTime();

                //setting starting range of the output
                calendar.add(Calendar.DATE,-60);
                start=calendar.getTime();

                if(end.compareTo(currentDate)>0)
                    end=currentDate;
                SimpleDateFormat print=new SimpleDateFormat("dd-MM-yyyy");
                System.out.println(print.format(start)+"  "+print.format(end));

            }
            else
            {
                System.out.println("No range");
            }
        }
    }
}