import java.net.InetAddress;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.GregorianCalendar;
import java.lang.StringBuffer;

public class SendPingtoIP
{
    public long[] SendPingRequest(String IpAddress) throws Exception
    {
        System.out.println("Sending Ping Request to " + IpAddress);

        long[] TimeList = new long[11];

        for (int i = 0; i < 11; i++)
        {
            long finish = 0;
            //getTimeInMillis() return the current time of this Calendar in Milliseconds
            long start = new GregorianCalendar().getTimeInMillis();

            if (isreachable(IpAddress))
            {
                finish = new GregorianCalendar().getTimeInMillis();
            }
            else
            {
                System.out.println("Can not reach the Address");
                break;
            }
            //Store time in array format which is further used by median function in the main class.
            TimeList[i] = (finish - start);
        }

        return TimeList;
    }

    private boolean isreachable(String ip) throws Exception
    {
        String url;
        StringBuffer echo = new StringBuffer();
        url = "ping " + ip;

        try
        {
            //This function is used to open a URL
            Process p = Runtime.getRuntime().exec(url);
            //InputStreamReader is a bridge from byte streams to character streams
            // process p will get the url in byte format and InputStream will convert it into char format.
            BufferedReader inputStream = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String s = "";

            while ((s = inputStream.readLine()) != null)
            {

                if (s.contains("Packets: Sent") || s.contains("bytes of data"))
                {
                    return true;
                }

                echo.append(s + '\n');
            }
            return false;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return false;
        }
    }


}