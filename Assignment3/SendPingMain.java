import java.util.Arrays;
import java.util.Scanner;

public class SendPingMain {
    public static void main(String[] args) throws Exception
    {
        SendPingtoIP request = new SendPingtoIP();
        String IP = getString("Enter the IP Address: ");

        //Ping measures the round-trip time for messages sent from the host to a destination computer.
        long[] TimeList = request.SendPingRequest(IP);

        double median = getMedian(TimeList);
        System.out.println("Median is: " + median + " ms");

    }

    //Fun to take input of IP Address
    public static String getString(String CALL_FOR_VAR) throws Exception
    {
        System.out.println(CALL_FOR_VAR);
        String str = "";
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        sc.close();
        return str;
    }

    //Calculating median
    public static double getMedian(long[] array) throws Exception
    {
        Arrays.sort(array);
        double median;
        median = (double) array[array.length / 2];
        return median;
    }

}
